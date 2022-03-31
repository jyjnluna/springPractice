package com.luna.ch2;

public class ExceptionHandling {
/*
 	���� ó��
 	
 	1. @ExceptionHandler�� @ControllerAdvice
 	
 	- ���� ó���� ���� �޼��带 �ۼ��ϰ� @ExceptionHandler�� ���δ�.
 	- @ControllerAdvice�� ���� ���� ó�� Ŭ���� �ۼ� ����(��Ű�� ���� ����) / ���� ó�� �޼��尡 �ߺ��� ���, ��Ʈ�ѷ� ���� ���� ó�� �޼��尡 �켱
 	
 	2. @ResponseStatus
 	
 	- ���� �޽����� ���� �ڵ带 ������ �� ���
 	
 	3. <error-page> - web.xml
 	
 	- ���� �ڵ庰 �� ����
 	ex)
 	<error-page>
 		<error-code>400</error-code>
 		<location>/error400.jsp</location>
 	<error-page>
 	
 	4. SimpleMappingExceptionResolver
 	
 	- ���� ������ �� ���ο� ���. servlet-context.xml�� ���
 	
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
	
	/ch2/ex ��û -> Dispatcherservlet -> Controller
	               -> ���ܸ� ó���Ϸ��� handlerExceptionResolvers�� ��ϵǾ��ִ�
	               	  // 1,2,3, �������
	                  1. ExceptionHandlerExceptionResolver (���� ó�� �⺻ ����)
	                  2. ResponseStatusExceptionResolver (���� ó�� �⺻ ����)
	                  3. DefaultHandlerExceptionResolver (�������� ���ǵ� ������ �����ڵ带 500���뿡�� 400~500����� �ٲ���)(���� ó�� �⺻ ����) �� �Ⱦ
	                  
	 6. ������������ ���� ó�� 
	 
	 - ��Ʈ�ѷ� �޼��� ������ try-catch�� ó��
	 - ��Ʈ�ѷ��� @ExceptionHandler�޼��尡 ó��
	 - @ControllerAdviceŬ������ @ExceptionHandler�޼��尡 ó��
	 - ���� �������� �� ���� - SimpleMappingExceptionResolver
	 - ���� ���� �ڵ庰�� �� ���� - <error-page>
 */
}
