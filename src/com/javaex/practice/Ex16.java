package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 다음과 같이 정의되는 함수의 함수값을 계산해보자


		System.out.println("숫자를 입력해 주세요");
		System.out.println("숫자: ");
	
		int num;
		double result;
		num = sc.nextInt();
		
		if (num<=0) {
			result=(num*num*num)-(9*num)+2;
		}else {
			result=(7*num)+2;
		}System.out.println("계산결과는"+result+"입니다.");
		
		
		
		
		
		
		
		
		

sc.close();	}

}
