package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.encapsulation.model.vo.Student;

public class EncapsulationRun {
	
	/*
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게함!!
	 * 
	 * * 캡슐화: 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어서 관리하는 기법 중 하나로
	 * 			클래스에서의 가장 중요한 목적인 "데이터의 접근 제한"을 원칙으로
	 * 			외부로부터 "데이터의 직접 접근을 막고" 
	 * 			대신에 데이터를 간접적으로나마 처리(값을 대입, 값을 돌려줌)할 메소드를 클래스내부에 작성해서 관리하는 방법
	 * 	1) 정보 은닉: private
	 * 		직접 접근을 막기 위해 private라는 접근제한자 사용
	 * 	2) setter/ getter 메소드
	 * 		private하는 순간 필드에 직접 접근 불가
	 * 		setter메소드: 해당 필드에 대입시키고자 하는 값 전달받아 해당 필드에 대입시켜주는 역할
	 * 		getter메소드: 해당 필드에 담긴 값을 반환해주는 역할
	 */
	
	public static void main(String[] args) {
		
		Student hong = new Student();
		
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 162.3;
		hong.korScore = 100;
		hong.mathScore = 90;
		*/
		
		//hong.method1(10);
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(162.3);
		hong.setKorScore(100);
		hong.setMathScore(90);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		
		System.out.println(hong.getKorScore());
		System.out.println(hong.getMathScore());
		
	}

}
