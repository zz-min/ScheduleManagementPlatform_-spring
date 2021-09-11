package com.webprj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webprj.di.entity.Exam;
import com.webprj.di.ui.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Exam exam = new ExamA();
		 * 
		 * 방법1)생성자로 추가 ExamConsole con = new InlineExamConsole(exam);
		 * 
		 * 방법2)setter로 추가 ExamConsole con = new InlineExamConsole();
		 * console.setExam(exam);
		 */
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("/com/webprj/di/setting.xml");
		//방법1) 이름으로 불러오기 단, 반환값 Object라서 형식변환 필수
		//ExamConsole con = (ExamConsole) context.getBean("con");
		//방법2) 인터페이스로 불러오기 단, 한 인터페이스에서 생성된 여러개 클래스 구별이 모호해짐 (선호방식**)
		ExamConsole con = (ExamConsole) context.getBean(ExamConsole.class);
		con.print();
		System.out.println("hello maven");
	}

}
