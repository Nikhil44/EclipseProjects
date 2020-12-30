package com;

public class InterviewQuestions {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		InterviewQuestions s = new InterviewQuestions();
		s.a = 44;
		s.b = 45;
		System.out.println("The value of s.a : " + s.a + " the value of s.b : " + s.b);

		InterviewQuestions t = new InterviewQuestions();
		System.out.println("The value of t.a : " + t.a + " the value of t.b :   " + t.b);
	}

}
