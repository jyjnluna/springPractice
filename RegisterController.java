package com.luna.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
//	@RequestMapping(value="/register/save", method={RequestMethod.GET, RequestMethod.POST}) �� �ڵ带 �Ʒ��� �ڵ�� ������ ��� ����
//	@RequestMapping("/register/add") // �ű�ȸ�� ���� ȭ��
//	@GetMapping("/register/add")
//	public String register() {
//		return "registerForm"; // WEB-INF/views/registerForm.jsp
//	}
	
	// servlet-context.xml�� <(mvc:)(������ mvc ��Ű���� �ִ� �±׶� mvc�� �ٿ��������� servlet-context.xml beans xmlns���� �ϳ��� ������ �� �־ �����Ѵ�.)view-controller path="/register/add" view-name="registerForm" �̷� ������ ����س����� ���� �ڵ带 ������� �ʰ� �� �ڵ常 �־ �ȴ�.
	//view-controller�� GET��û�� ����ϰ� POST��û�� ������� �ʴ´�.
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST) // �� �ڵ带 �Ʒ��� �ڵ�� ������ ��� ����
	@PostMapping("/register/save") // spring 4.3�������� ��밡��
	public String save(User user, Model m) throws Exception{
		// 1. ��ȿ�� �˻�
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸��Է��ϼ̽��ϴ�.", "utf-8");
			
			// �� �ڵ�� �Ʒ��� �� �� �ڵ�� ���� ����� �Ѵ�.
			m.addAttribute("msg", msg);
			return "forward:/register/add";
			
//			return "redirect:/register/add?msg="+msg; // URL ���ۼ�(rewriting)
//			���� �� �� ¥�� �ڵ带 ����� ��� registForm.jsp���� body ���� form �±׿� <div id="msg" class="msg"> ${URLDecoder.decode(param.msg, "utf-8")}</div> �� �ڵ带 �߰����־���Ѵ�.
		}
		
		// 2. DB�� �ű�ȸ�� ������ ����
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return false;
}
}
