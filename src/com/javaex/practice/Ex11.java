package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
		
		int f;
		int s;
		
		System.out.println("첫번째 숫자: ");
		f = sc.nextInt();
		System.out.println("두번째 숫자: ");
		s = sc.nextInt();
		
		int big;
		int small;
		
		if (f>s) {
			big=f; small=s;
		}else {
			big=s; small=f;
		}
		System.out.println("몫:"+big/small);
		System.out.println("나머지:"+big%small);

 
		
		
		
		
		sc.close();	}

}
