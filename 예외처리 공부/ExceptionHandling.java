package com.luna.ch2;

public class ExceptionHandling {
/*
 	예외 처리
 	
 	1. @ExceptionHandler와 @ControllerAdvice
 	
 	- 예외 처리를 위한 메서드를 작성하고 @ExceptionHandler를 붙인다.
 	- @ControllerAdvice로 전역 예외 처리 클래스 작성 가능(패키지 지정 가능) / 예외 처리 메서드가 중복된 경우, 컨트롤러 내의 예외 처리 메서드가 우선
 	
 	2. @ResponseStatus
 	
 	- 응답 메시지의 상태 코드를 변경할 때 사용
 	
 	3. <error-page> - web.xml
 	
 	- 상태 코드별 뷰 맵핑
 	ex)
 	<error-page>
 		<error-code>400</error-code>
 		<location>/error400.jsp</location>
 	<error-page>
 	
 	4. SimpleMappingExceptionResolver
 	
 	- 예외 종류별 뷰 맵핑에 사용. servlet-context.xml에 등록
 	
 	ex)
 	<beans:bean class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
 		<beans:property name="defaultErrorView" value="error"/>
 		<beans:property name="exceptionMappings">
		 	<beans:props>
		 		<beans:prop key="com.luna.ch2.MyException">error400</beans:prop>
		 	<beans:props>
		 </beans:property>
		 <beans:property name="statusCodes">
		 	<beans:props>
		 		<beans:prop key="error400">404</beans:prop>
		 	</beans:props>
		 </beans:property>
	</beans:bean>
	
	5. ExceptionResolver
	
	/ch2/ex 요청 -> Dispatcherservlet -> Controller
	               -> 예외를 처리하려고 handlerExceptionResolvers에 등록되어있는
	               	  // 1,2,3, 순서대로
	                  1. ExceptionHandlerExceptionResolver (예외 처리 기본 전략)
	                  2. ResponseStatusExceptionResolver (예외 처리 기본 전략)
	                  3. DefaultHandlerExceptionResolver (스프링에 정의된 예외의 상태코드를 500번대에서 400~500번대로 바꿔줌)(예외 처리 기본 전략) 를 훑어봄
	                  
	 6. 스프링에서의 예외 처리 
	 
	 - 컨트롤러 메서드 내에서 try-catch로 처리
	 - 컨트롤러에 @ExceptionHandler메서드가 처리
	 - @ControllerAdvice클래스의 @ExceptionHandler메서드가 처리
	 - 예외 종류별로 뷰 지정 - SimpleMappingExceptionResolver
	 - 응답 상태 코드별로 뷰 지정 - <error-page>
 */
}
