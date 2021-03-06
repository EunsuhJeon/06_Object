package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
	
	
		// ------ NonStaticMethod --------
		NonStaticMethod test = new NonStaticMethod();
		
		// 1. 古鯵痕呪 蒸壱 鋼発逢亀 蒸澗 五社球 硲窒
		//test.method1();
		
		// 2. 古鯵痕呪 蒸壱 鋼発葵精 赤澗 五社球 硲窒
		/*
		 * String str = test.method2();// 旭精 切戟莫税 痕呪拭 衣引葵聖 眼焼却 呪 赤製
		 * System.out.println(str);
		 */
		/*
		System.out.println(test.method2()); // 廃 匝稽 推鉦
		
		// 3. 古鯵痕呪 赤壱 鋼発葵精 蒸澗 五社球 硲窒
		test.method3(4, 0);
		
		// 4. 古鯵痕呪亀 赤壱 鋼発葵亀 赤澗 五社球 硲窒
		/*
		char ch = test.method4("照括馬室推", 3);
		System.out.println(ch);
		*/
		//System.out.println(test.method4("照括馬室推",3)); // 廃 匝稽 推鉦
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("庚切伸 脊径: ");
		String str = sc.nextLine();
		System.out.print("舛呪 脊径: ");
		int num = sc.nextInt();
		
		if(num < str.length() && num > 0) {
			System.out.println("衣引: " + test.method4(str, num));		
		}else {
			System.out.println("設公 脊径馬写柔艦陥.");
		}
		*/
		
		// -------StaticMethod ----------
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("穿精辞");
		System.out.println(StaticMethod.method4("照括馬室推", "照括馬室推"));
		
		
		// ------ OverlaodingTest --------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(20);
		ot.test(10, "ぞぞぞ");
		ot.test("せせせ", 20);
		ot.test(50,60);
		ot.test("悪左寓");
		
		System.out.println(10);
		System.out.println("いい");
		System.out.println(0.0);
		//System.out.println
		
		
		
	}
	
}
