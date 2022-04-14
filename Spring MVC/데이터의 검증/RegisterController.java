package com.luna.ch2;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	
	// �Ʒ��� �޼��带 ����ϸ� ��ȯ ������ ������ ������ �ʴ´�.
	@InitBinder // �� �޼���� �� ��Ʈ�ѷ� �ȿ����� ��밡��
	public void toDate(WebDataBinder binder) {
		ConversionService conversionService = binder.getConversionService(); // converter ���񽺷� �ڵ���ȯ
		System.out.println("conversionService="+conversionService);  // converter ���񽺸� ����� ���� Ȯ��
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
		binder.registerCustomEditor(String[].class, new StringArrayPropertyEditor("#")); // �����ڸ� ����ؼ� �迭�� ���� ������ ���� ��
//		binder.setValidator(new UserValidator()); // UserValidator�� WebDataBinder�� ���� validator�� ���
//		binder.addValidators(new UserValidator()); // setValidator�� ���� �۷ι� validator�� �Ⱦ��� ������ add�� ��� - �۷ι� Validator�� ���� Validator�� ���ÿ� �����ϰ� ������ ���
		List<Validator> validatorList = binder.getValidators();
		System.out.println("validatorList="+validatorList);
	}
	
	@RequestMapping(value="/register/add", method={RequestMethod.GET, RequestMethod.POST}) //�� �ڵ带 �Ʒ��� �ڵ�� ������ ��� ����

	public String register() {
		return "registerForm"; // WEB-INF/views/registerForm.jsp
	}
	
	// servlet-context.xml�� <(mvc:)(������ mvc ��Ű���� �ִ� �±׶� mvc�� �ٿ��������� servlet-context.xml beans xmlns���� �ϳ��� ������ �� �־ �����Ѵ�.)view-controller path="/register/add" view-name="registerForm" �̷� ������ ����س����� ���� �ڵ带 ������� �ʰ� �� �ڵ常 �־ �ȴ�.
	//view-controller�� GET��û�� ����ϰ� POST��û�� ������� �ʴ´�.
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST) // �� �ڵ带 �Ʒ��� �ڵ�� ������ ��� ����
	@PostMapping("/register/save") // spring 4.3�������� ��밡��
	public String save(@Valid User user, BindingResult result, Model m) throws Exception{
		System.out.println("result="+result);
		System.out.println("user="+user);	
		
		// ���� ���� - Validator�� ���� �����ϰ�, validator()�� ���� ȣ��
/*		UserValidator userValidator = new UserValidator();
		userValidator.validate(user, result); // BindingResult�� Errors�� �ڼ�
*/		
		//User��ü�� ������ ��� ������ ������, registerForm�� �̿��ؼ� ������ ������� ��.
		if(result.hasErrors()) {
			return "registerForm";
		}
		
		// 1. ��ȿ�� �˻�
/*		if(!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸��Է��ϼ̽��ϴ�.", "utf-8");
			
			// �� �ڵ�� �Ʒ��� �� �� �ڵ�� ���� ����� �Ѵ�.
			m.addAttribute("msg", msg);
			return "forward:/register/add";
*/			
//			return "redirect:/register/add?msg="+msg; // URL ���ۼ�(rewriting)
//			���� �� �� ¥�� �ڵ带 ����� ��� registForm.jsp���� body ���� form �±׿� <div id="msg" class="msg"> ${URLDecoder.decode(param.msg, "utf-8")}</div> �� �ڵ带 �߰����־���Ѵ�.
//		}
		
		// 2. DB�� �ű�ȸ�� ������ ����
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return true;
}
}
