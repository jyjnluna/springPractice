package com.luna.ch2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice("com.luna.ch2") // ������ ��Ű������ �߻��� ���ܸ� ó�� 
@ControllerAdvice // �� �ڵ带 ����ϸ� �Ʒ��� �޼������ ��� ��Ʈ�ѷ����� �߻��ϴ� ���ܵ��� ó�����ش�. // ��� ��Ű���� ����
public class GlobalCatcher {

	// ���� ó���� ���ִ� �޼���
	@ExceptionHandler(NullPointerException.class)
	public String catcher2(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error";
	}
}
