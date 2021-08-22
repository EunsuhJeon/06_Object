package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 1. 기본생성자로 객체 생성 직후 해당 객체 정보 출력
		User u1 = new User();
		System.out.println(u1.information()); // char 자료형의 기본값은 공백
		// 각 필드에 JVM의 초기값 담겨있음!
		
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("홍길동");
		System.out.println(u2.information());
		*/
		
		// 2. 매개변수 3개자리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user02", "pass02", "홍길동");
		System.out.println(u2.information());
		
		// 홍길동이 홍말동으로 개명을 했을 경우? => 이름만 변경할 수 있음
		u2.setUserName("홍말동");// 필드 하나씩 수정할 경우를 고려하여 setter 메소드가 필수로 있어야함!
		System.out.println(u2.information());
		
		// 3. 매개변수 5개짜리 생성자로 객체 생성 후 정보 출력
		User u3 = new User("user03", "pass03", "김말똥", 23, '남');
		System.out.println(u3.information());

	}

}