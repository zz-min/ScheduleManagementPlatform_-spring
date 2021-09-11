package com.webprj.di.entity;

import com.webprj.di.entity.Exam;

public class ExamA implements Exam {

	private int kor;
	private int math;
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+math;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/2.0f;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
