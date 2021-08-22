package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 1. �⺻�����ڷ� ��ü ���� ���� �ش� ��ü ���� ���
		User u1 = new User();
		System.out.println(u1.information()); // char �ڷ����� �⺻���� ����
		// �� �ʵ忡 JVM�� �ʱⰪ �������!
		
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("ȫ�浿");
		System.out.println(u2.information());
		*/
		
		// 2. �Ű����� 3���ڸ� �����ڷ� ��ü ���� �� ���� ���
		User u2 = new User("user02", "pass02", "ȫ�浿");
		System.out.println(u2.information());
		
		// ȫ�浿�� ȫ�������� ������ ���� ���? => �̸��� ������ �� ����
		u2.setUserName("ȫ����");// �ʵ� �ϳ��� ������ ��츦 ����Ͽ� setter �޼ҵ尡 �ʼ��� �־����!
		System.out.println(u2.information());
		
		// 3. �Ű����� 5��¥�� �����ڷ� ��ü ���� �� ���� ���
		User u3 = new User("user03", "pass03", "�踻��", 23, '��');
		System.out.println(u3.information());

	}

}