package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
	
	
		// ------ NonStaticMethod --------
		NonStaticMethod test = new NonStaticMethod();
		
		// 1. �Ű����� ���� ��ȯ���� ���� �޼ҵ� ȣ��
		//test.method1();
		
		// 2. �Ű����� ���� ��ȯ���� �ִ� �޼ҵ� ȣ��
		/*
		 * String str = test.method2();// ���� �ڷ����� ������ ������� ��Ƶ� �� ����
		 * System.out.println(str);
		 */
		/*
		System.out.println(test.method2()); // �� �ٷ� ���
		
		// 3. �Ű����� �ְ� ��ȯ���� ���� �޼ҵ� ȣ��
		test.method3(4, 0);
		
		// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ� ȣ��
		/*
		char ch = test.method4("�ȳ��ϼ���", 3);
		System.out.println(ch);
		*/
		//System.out.println(test.method4("�ȳ��ϼ���",3)); // �� �ٷ� ���
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		if(num < str.length() && num > 0) {
			System.out.println("���: " + test.method4(str, num));		
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		*/
		
		// -------StaticMethod ----------
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("������");
		System.out.println(StaticMethod.method4("�ȳ��ϼ���", "�ȳ��ϼ���"));
		
		
		// ------ OverlaodingTest --------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(20);
		ot.test(10, "������");
		ot.test("������", 20);
		ot.test(50,60);
		ot.test("������");
		
		System.out.println(10);
		System.out.println("����");
		System.out.println(0.0);
		//System.out.println
		
		
		
	}
	
}