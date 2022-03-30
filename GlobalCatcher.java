package com.luna.ch2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice("com.luna.ch2") // 지정된 패키지에서 발생한 예외만 처리 
@ControllerAdvice // 이 코드를 사용하면 아래의 메서드들이 모든 컨트롤러에서 발생하는 예외들을 처리해준다. // 모든 패키지에 적용
public class GlobalCatcher {

	// 예외 처리를 해주는 메서드
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
