// 리소스에는 동적리소스와 정적리소스가 있다.
// 동적리소스에는 프로그램, 스트리밍 등이 있다.
// 정적리소스에는 이미지파일,css파일,html파일 등이 있다.

package com.luna.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // ctrl+shift+O는 자동 import(이클립스 단축키)
public class TwoDice {
	// 실행할때마다 결과가 변함 이것을 동적리소스라고 함
	@RequestMapping("/rollDice")
	public void main(HttpServletResponse response) throws IOException{
		int idx1 = (int)(Math.random()*6)+1;
		int idx2 = (int)(Math.random()*6)+1;
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		// 이미지파일은 그대로 존재함 이것을 정적리소스라고 함
		out.println("<img src='resources/img/dice"+idx1+".jpg'>");
		out.println("<img src='resources/img/dice"+idx2+".jpg'>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	}
}
