package com.luna.ch2;

public class Session {
/*
 	세션(Session)
 	
 	1. 세션이란?
 	
 	- 서로 관련된 요청들을 하나로 묶은 것 - 쿠키를 이용
 	  브라우저마다 개별 저장소(세션객체)를 서버에서 제공
 	  
 	 2. 세션의 생성 과정
 	 
 	  - 처음에 브라우저가 요청을 하면 서버가 무조건 세션객체(저장소)를 만듦(세션객체마다 세션ID를 가지고 있음)
 	  - 만든 저장소를 쓸 수 있게 세션ID가 담긴 쿠키를 만들어서 응답으로 보냄.
 	  - 브라우저에 쿠키가 저장됨
 	  - 다음부터 요청을 보낼때마다 쿠키가 자동으로 따라감
 	  
 	 3. 세션객체 얻기
 	 
 	 - 브라우저에서 보낸 세션을 받아 컨트롤러에서 세션 저장소를 사용하고 싶을면 request.getSession();을 사용함, 이 코드를 사용하면 이 요청에 있는 세션ID를 보고 일치하는 것을 찾음
	 - 일치하는 세션객체를 찾아서 session.setAttribute("id","asdf");를 하면 session에 key("id"),value("asdf")형태로 저장함
	 
	 4. 세션과 관련된 메서드
	 
	 메서드
	 - String getId() : 세션의 ID를 반환
	 - long getLastAccessedTime() 세션 내에서 최근 요청을 받은 시간을 반환
	 - boolean isNew() : 새로 생성된 세션인지를 반환.request.getSession() 호출 후 사용
	 - void invalidate() : 세션 객체를 제거(저장된 객체도 함께)
	 - void setMaxInactiveInterval(int interval) : 지정된 시간(초)후에 세션을 종료(예약종료)
	 - int getMaxInactiveInterval() : 예약된 세션 종료 시간을 반환
	 
	 속성 관련 메서드
	 - void setAttribute(String name, Object value) : 지정된 값(value)을 지정된 속성 이름(name)으로 저장
	 - Object getAttribute(String name) : 지정된 이름(name)으로 저장된 속성의 값을 반환
	 - void removeAttribute(String name) : 지정된 이름(name)의 속성을 삭제
	 - Enumeration getAttributeNames() : 기본 객체에 저장된 모든 속성의 이름을 반환
	 
	 5. 세션의 종료
	 
	 1. 수동 종료
	 HttpSession session = request.getSession();
	 session.invalidate();                       // 1. 세션을 즉시 종료
	 session.setMaxInactiveInterval(30*60);      // 2. 예약 종료(30분 후)
	 
	 2. 자동 종료 - web.xml
	 <session-config>
	 	<session-timeout>30</session-timeout>
	</session-config>
	
	6. 쿠키 vs 세션
	
	쿠키(Cookie) - 브루우저에 저장, 서버 부담x, 보안에 불리, 서버 다중화에 유리
	세션(HttpSession) - 서버에 저장, 서버 부담O, 보안에 유리, 서버 다중화에 불리

*/
}
