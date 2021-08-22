package com.kh.chap06_method.controller;

public class StaticMethod {

	// 1. �Ű������� ���� ��ȯ���� ���� �żҵ�
	public static void method1() {
		System.out.println("�Ű������� ��ȯ�� �� �� ���� static�޼ҵ��Դϴ�.");
	}
	
	// 2. �Ű����� ���� ��ȯ���� �ִ� �żҵ�
	public static int method2() {
		System.out.println("�Ű����� ���� ��ȯ���� �ִ� static�޼ҵ��Դϴ�.");
		
		// 1���� ������(1~100 ������)������ �� �հ�
		/*
		int sum = 0;
		for(int i=1; i<=Math.random()*100+1; i++) {
			sum += i;
		}
		return sum;
		*/
		int random = (int)(Math.random() *100 + 1);
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 3. �Ű����� �ְ� ��ȯ���� ���� �żҵ�
	public static void method3(String name) {
		System.out.println("�Ű����� �ְ� ��ȯ���� ���� static�޼ҵ��Դϴ�.");
		System.out.println(name + "���� �湮�� ȯ���մϴ�.");
	}
	
	// 4. �Ű����� �ְ� ��ȣ������ �ִ� �޼ҵ�
	public static boolean method4(String str1, String str2) {
		System.out.println("�Ű������� ��ȯ�� �� �� �ִ� static�޼ҵ��Դϴ�.");
		/*
		if(str1.contentEquals(str2)) {
			return true;
		}else {
			return false;
		}
		*/
		return str1.equals(str2);
	}
}
