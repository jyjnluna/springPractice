package com.luna.ch2;

public class Session {
/*
 	����(Session)
 	
 	1. �����̶�?
 	
 	- ���� ���õ� ��û���� �ϳ��� ���� �� - ��Ű�� �̿�
 	  ���������� ���� �����(���ǰ�ü)�� �������� ����
 	  
 	 2. ������ ���� ����
 	 
 	  - ó���� �������� ��û�� �ϸ� ������ ������ ���ǰ�ü(�����)�� ����(���ǰ�ü���� ����ID�� ������ ����)
 	  - ���� ����Ҹ� �� �� �ְ� ����ID�� ��� ��Ű�� ���� �������� ����.
 	  - �������� ��Ű�� �����
 	  - �������� ��û�� ���������� ��Ű�� �ڵ����� ����
 	  
 	 3. ���ǰ�ü ���
 	 
 	 - ���������� ���� ������ �޾� ��Ʈ�ѷ����� ���� ����Ҹ� ����ϰ� ������ request.getSession();�� �����, �� �ڵ带 ����ϸ� �� ��û�� �ִ� ����ID�� ���� ��ġ�ϴ� ���� ã��
	 - ��ġ�ϴ� ���ǰ�ü�� ã�Ƽ� session.setAttribute("id","asdf");�� �ϸ� session�� key("id"),value("asdf")���·� ������
	 
	 4. ���ǰ� ���õ� �޼���
	 
	 �޼���
	 - String getId() : ������ ID�� ��ȯ
	 - long getLastAccessedTime() ���� ������ �ֱ� ��û�� ���� �ð��� ��ȯ
	 - boolean isNew() : ���� ������ ���������� ��ȯ.request.getSession() ȣ�� �� ���
	 - void invalidate() : ���� ��ü�� ����(����� ��ü�� �Բ�)
	 - void setMaxInactiveInterval(int interval) : ������ �ð�(��)�Ŀ� ������ ����(��������)
	 - int getMaxInactiveInterval() : ����� ���� ���� �ð��� ��ȯ
	 
	 �Ӽ� ���� �޼���
	 - void setAttribute(String name, Object value) : ������ ��(value)�� ������ �Ӽ� �̸�(name)���� ����
	 - Object getAttribute(String name) : ������ �̸�(name)���� ����� �Ӽ��� ���� ��ȯ
	 - void removeAttribute(String name) : ������ �̸�(name)�� �Ӽ��� ����
	 - Enumeration getAttributeNames() : �⺻ ��ü�� ����� ��� �Ӽ��� �̸��� ��ȯ
	 
	 5. ������ ����
	 
	 1. ���� ����
	 HttpSession session = request.getSession();
	 session.invalidate();                       // 1. ������ ��� ����
	 session.setMaxInactiveInterval(30*60);      // 2. ���� ����(30�� ��)
	 
	 2. �ڵ� ���� - web.xml
	 <session-config>
	 	<session-timeout>30</session-timeout>
	</session-config>
	
	6. ��Ű vs ����
	
	��Ű(Cookie) - �������� ����, ���� �δ�x, ���ȿ� �Ҹ�, ���� ����ȭ�� ����
	����(HttpSession) - ������ ����, ���� �δ�O, ���ȿ� ����, ���� ����ȭ�� �Ҹ�

*/
}
