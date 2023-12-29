package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하세요
		
		
		int num1;
		int num2;
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.println("숫자1:");
		num1 = sc.nextInt();
		System.out.println("숫자2:");
		num2 = sc.nextInt();
		
		
		int max;
		int small;
		
		if (num1>num2) {
			max=num1;
		}else {
			max=num2;
		}
		
		if (num1>num2) {
			small=num2;
		}else {
			small=num1;
		}
		
		System.out.println("큰수:"+max+"     작은수:"+small);

	sc.close();}

}
