package com.luna.ch2;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// ������� �Է��ϸ� ������ �˷��ִ� ���α׷�
public class YoilTellerMVC { // http://localhost/ch2/getYoilMVC?year=2022&month=03&day=23
	@RequestMapping("/getYoilMVC")
	public String main(int year, int month, int day, Model m) throws IOException { //String ��� void�� ����ϰ� ���ε� �ּ� �̸��� jsp������ ����� return���� �����ϰ� ���� �� �� �ִ�.
		
		// 1. ��ȿ�� �˻�
		if(!isValid(year, month, day))
			return "yoilError";

		// 2. ���� ���
		char yoil = getYoil(year, month, day);
		
		// 3. ����� ����� model�� ����
		m.addAttribute("year", year);
		m.addAttribute("month", month);
		m.addAttribute("day", day);
		m.addAttribute("yoil", yoil);
		
		return "yoil"; //WEB-INF/views/yoil.jsp

	}

	private boolean isValid(int year, int month, int day) {

		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:�Ͽ���, 2:������ ...
		return " �Ͽ�ȭ�������".charAt(dayOfWeek);
}
}
