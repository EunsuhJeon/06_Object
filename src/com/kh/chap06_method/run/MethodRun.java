package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
	
	
		// ------ NonStaticMethod --------
		NonStaticMethod test = new NonStaticMethod();
		
		// 1. 매개변수 없고 반환갑도 없는 메소드 호출
		//test.method1();
		
		// 2. 매개변수 없고 반환값은 있는 메소드 호출
		/*
		 * String str = test.method2();// 같은 자료형의 변수에 결과값을 담아둘 수 있음
		 * System.out.println(str);
		 */
		/*
		System.out.println(test.method2()); // 한 줄로 요약
		
		// 3. 매개변수 있고 반환값은 없는 메소드 호출
		test.method3(4, 0);
		
		// 4. 매개변수도 있고 반환값도 있는 메소드 호출
		/*
		char ch = test.method4("안녕하세요", 3);
		System.out.println(ch);
		*/
		//System.out.println(test.method4("안녕하세요",3)); // 한 줄로 요약
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if(num < str.length() && num > 0) {
			System.out.println("결과: " + test.method4(str, num));		
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		*/
		
		// -------StaticMethod ----------
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("전은서");
		System.out.println(StaticMethod.method4("안녕하세요", "안녕하세요"));
		
		
		// ------ OverlaodingTest --------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(20);
		ot.test(10, "ㅎㅎㅎ");
		ot.test("ㅋㅋㅋ", 20);
		ot.test(50,60);
		ot.test("강보람");
		
		System.out.println(10);
		System.out.println("ㄴㄴ");
		System.out.println(0.0);
		//System.out.println
		
		
		
	}
	
}
