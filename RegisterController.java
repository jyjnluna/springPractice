package com.luna.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
//	@RequestMapping(value="/register/save", method={RequestMethod.GET, RequestMethod.POST}) 이 코드를 아래의 코드로 간략히 사용 가능
//	@RequestMapping("/register/add") // 신규회원 가입 화면
//	@GetMapping("/register/add")
//	public String register() {
//		return "registerForm"; // WEB-INF/views/registerForm.jsp
//	}
	
	// servlet-context.xml에 <(mvc:)(스프링 mvc 스키마에 있는 태그라서 mvc를 붙여야하지만 servlet-context.xml beans xmlns에서 하나를 생략할 수 있어서 생략한다.)view-controller path="/register/add" view-name="registerForm" 이런 식으로 등록해놓으면 위의 코드를 사용하지 않고 이 코드만 있어도 된다.
	//view-controller는 GET요청만 허용하고 POST요청은 허용하지 않는다.
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST) // 이 코드를 아래의 코드로 간략히 사용 가능
	@PostMapping("/register/save") // spring 4.3버전부터 사용가능
	public String save(User user, Model m) throws Exception{
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
		return false;
}
}
