package com.luna.ch2;

public class GetMappingPostMapping {

	// 1. @GetMapping, @PostMapping
	
	// @ RequestMapping 대신 @GetMapping, @PostMapping 사용 가능
	
	// 2. 클래스에 붙이는 @RequestMapping
	
	// 맵핑될 URL의 공통 부분을 @RequestMapping으로 클래스에 적용
	
	// 3. @RequestMapping의 URL패턴
	
	// ?는 한 글자, *는 여러 글자, **는 하위 경로 포함. 배열로 여러 패턴 지정
	
	// 종류           					URL pattern             매칭URL
	// 1. exact mapping(정확히 일치)       /login/hello.do         http://localhost/ch2/login/hello.do
	// 2. path mapping(경로 맵핑)         /login/*                http://localhost/ch2/login/
	// 3. extension mapping(확장자 맵핑)   *.do                    http://localhost/ch2/hi.do
	
	// 4. URL인코딩 - 퍼센트 인코딩
	
	// URL에 포함된 non-ASCII문자를 문자 코드(16진수) 문자열로 변환
}
