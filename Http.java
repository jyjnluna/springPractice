package com.luna.ch2;

public class Http {
/*
	 HTTP 요청과 응답
	 
	 1. 프로토콜(protocol)이란?
	 
	 - 서로 간의 통신을 위한 약속, 규칙
	   주고 받을 데이터에 대한 형식을 정의한 것
	   
	 2. HTTP(Hyper Text Transfer Protocol)란?
	 
	 - 단순하고 읽기 쉽다 - 텍스트 기반의 프로토콜
	 - 상태를 유지하지 않는다(stateless) - 클라이언트 정보를 저장X
	 - 확장 가능하다 - 커스텀 헤더(header) 추가 기능
	 
	 3. HTTP 메시지
	 
	 - HTTP메시지는 실제 편지와 유사하게 헤더와 바디로 구성
	 - 헤더에는 메시지에 대한 설명이 들어있고 바디에는 실제 내용이 들어감
	 
	 4. HTTP 메시지 - 응답메시지
	 
	 - 상태코드 1xx - informational (정보교환)
	 - 상태코드 2xx - Success
	 - 상태코드 3xx - Redirect
	 - 상태코드 4xx - Client Error
	 - 상태코드 5xx - Server Error
	 
	 5. HTTP 메세지 - 요청 메시지
	 
	 - HTTP 요청 메시지 GET (서버에 있는 리소스를 얻어오는것) 리소스 URL만 필요해서 바디가 필요없음
	 - HTTP 요청 메시지 POST (서버에 정보를 제공하는것 ex.글쓰기,로그인 등등) GET과 달리 바디가 있음
	 
	 6. HTTP 메서드 - GET,POST
	 
	 - GET
	 - 서버의 리소스를 가져오기 위해 설계
	 - QUERY STRING을 통해 데이터를 전달(소용량)
	 - URL에 데이터 노출되므로 보안에 취약
	 - 데이터 공유에 유리
	 ex) 검색엔진에서 검색단어 전송에 이용
	 
	 - POST
	 - 서버에 데이터를 올리기 위해 설계됨
	 - 전송 데이터 크기의 제한이 없음(대용량)
	 - 데이터를 요청 메시지의 body에 담아 전송
	 - 보안에 유리, 데이터 공유에는 불리
	 ex) 게시판에 글쓰기, 로그인, 회원가입
	 
	 7. 텍스트 파일 vs 바이너리 파일
	 
	 - 텍스트 파일 : 문자만 있는 저장되어있는 파일 - 숫자를 문자로 변환 후 쓴다
	 - 바이너리 파일 : 문자와 숫자가 저장되어 있는 파일 - 데이터를 있는 그대로 읽고 쓴다
	 
	 8. MIME(Multipurpose Internet Mail Extensions)
	 
	 - 텍스트 기반 프로토콜에 바이너리 데이터 전송하기 위해 고안
	 - HTTP의 Content-Type헤더에 사용. 데이터의 타입을 명시
	
	 - 타입          설명                           예시
	 - text         텍스트를 포함하는 모든 문서         text/plain
	 - image        모든 종류의 이미지                img/bmp
	 - audio        모든 종류의 오디오 파일            audio/midi
	 - video        모든 종류의 비디오 파일            video/webm
	 - application  모든 종류의 이진 데이터            application/octetstream
	 
	 이 외에도 다양함
	 
	 9. Base 64
	 
	 - 바이너리 데이터를 텍스트 데이터로 변활할 때 사용
	 - 64진법은 '0'~'9', 'A'~'Z', 'a'~'z', '+', '/' 모두 64개의 문자로 구성
*/
}
