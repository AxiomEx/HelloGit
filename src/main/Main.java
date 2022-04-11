package main;

import calc.Calculator;
import calc.SubCalc;

public class Main {

	public static void main(String[] args) {

		System.out.println("로컬저장소 사용");
		System.out.println("원격저장소 사용 가능");
		System.out.println("원격저장소 사용 가능2");
		System.out.println("팀장 코드시작입니다.");

		System.out.println("팀장 코드 마지막입니다.");
		

		System.out.println("팀장 새코드 시작");
		System.out.println("팀장 새코드 끝");

		System.out.println("팀원 코드1");
		System.out.println("팀원 코드2");
		System.out.println("팀원 코드3");

		Calculator cal = new Calculator();
		int addResult = cal.add(1, 2);
		System.out.println(addResult);
		
		SubCalc sub = new SubCalc();
		int subResult = sub.subtract(1, 2);
		System.out.println(subResult);
		
		System.out.println("집에서 작업시작");
		System.out.println("집에서 작업끝");
		
		
	}

}
