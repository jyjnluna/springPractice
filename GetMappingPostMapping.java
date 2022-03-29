package com.luna.ch2;

public class GetMappingPostMapping {

	// 1. @GetMapping, @PostMapping
	
	// @ RequestMapping ��� @GetMapping, @PostMapping ��� ����
	
	// 2. Ŭ������ ���̴� @RequestMapping
	
	// ���ε� URL�� ���� �κ��� @RequestMapping���� Ŭ������ ����
	
	// 3. @RequestMapping�� URL����
	
	// ?�� �� ����, *�� ���� ����, **�� ���� ��� ����. �迭�� ���� ���� ����
	
	// ����           					URL pattern             ��ĪURL
	// 1. exact mapping(��Ȯ�� ��ġ)       /login/hello.do         http://localhost/ch2/login/hello.do
	// 2. path mapping(��� ����)         /login/*                http://localhost/ch2/login/
	// 3. extension mapping(Ȯ���� ����)   *.do                    http://localhost/ch2/hi.do
	
	// 4. URL���ڵ� - �ۼ�Ʈ ���ڵ�
	
	// URL�� ���Ե� non-ASCII���ڸ� ���� �ڵ�(16����) ���ڿ��� ��ȯ
}
