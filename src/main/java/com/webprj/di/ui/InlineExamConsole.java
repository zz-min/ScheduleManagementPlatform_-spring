package com.webprj.di.ui;

import com.webprj.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;

	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total : %d", exam.total());
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}


}
