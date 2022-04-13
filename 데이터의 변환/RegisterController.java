package com.luna.ch2;

import java.net.URLEncoder;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	
	// 아래의 메서드를 사용하면 변환 했을때 에러가 생기지 않는다.
	@InitBinder // 이 메서드는 이 컨트롤러 안에서만 사용가능
	public void toDate(WebDataBinder binder) {
		ConversionService conversionService = binder.getConversionService(); // converter 서비스로 자동변환
		System.out.println("conversionService="+conversionService);  // converter 서비스를 출력을 통해 확인
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
		binder.registerCustomEditor(String[].class, new StringArrayPropertyEditor("#")); // 구분자를 사용해서 배열에 각각 나누어 들어가게 함
	}
	
	@RequestMapping(value="/register/add", method={RequestMethod.GET, RequestMethod.POST}) //이 코드를 아래의 코드로 간략히 사용 가능

	public String register() {
		return "registerForm"; // WEB-INF/views/registerForm.jsp
	}
	
	// servlet-context.xml에 <(mvc:)(스프링 mvc 스키마에 있는 태그라서 mvc를 붙여야하지만 servlet-context.xml beans xmlns에서 하나를 생략할 수 있어서 생략한다.)view-controller path="/register/add" view-name="registerForm" 이런 식으로 등록해놓으면 위의 코드를 사용하지 않고 이 코드만 있어도 된다.
	//view-controller는 GET요청만 허용하고 POST요청은 허용하지 않는다.
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST) // 이 코드를 아래의 코드로 간략히 사용 가능
	@PostMapping("/register/save") // spring 4.3버전부터 사용가능
	public String save(User user, BindingResult result, Model m) throws Exception{
		System.out.println("result="+result);
		System.out.println("user="+user);		
		// 1. 유효성 검사
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못입력하셨습니다.", "utf-8");
			
			// 이 코드와 아래의 한 줄 코드는 같은 기능을 한다.
			m.addAttribute("msg", msg);
			return "forward:/register/add";
			
//			return "redirect:/register/add?msg="+msg; // URL 재작성(rewriting)
//			위의 한 줄 짜리 코드를 사용할 경우 registForm.jsp에서 body 안의 form 태그에 <div id="msg" class="msg"> ${URLDecoder.decode(param.msg, "utf-8")}</div> 이 코드를 추가해주어야한다.
		}
		
		// 2. DB에 신규회원 정보를 저장
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return true;
}
}
