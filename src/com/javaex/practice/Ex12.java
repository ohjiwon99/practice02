package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.println("숫자1: ");
		num1 = sc.nextInt();
		System.out.println("숫자2: ");
		num2 = sc.nextInt();
		System.out.println("숫자3: ");
		num3 = sc.nextInt();
		
		int small;
		if (num1<num2 && num1<num3) {
			small=num1;
		}else if (num2<num3 && num2<num1) {
			small=num2;
		}else {
			small=num3;
		}
		System.out.println("가장 작은수는 "+small+" 입니다.");
		
		
		
		
		
		
		
		
		

	sc.close();}

}
