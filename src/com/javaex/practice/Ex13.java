package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두 개의 정수를 입력받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
		//(0은 입력하지 않습니다.)
		int num1;
		int num2;
		System.out.println("첫번째 숫자:");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자:");
		num2 = sc.nextInt();
		
		int small;
		if (num1<num2) {
			small=num1;
		}else {
			small=num2;
		}
		int big;
		if (num1>num2) {
			big=num1;
		}else {
			big=num2;
		}
		
		
		
		if (big>small && big%small==0) {
			System.out.println(small+"는(은) "+big+"의 약수입니다.");
		}else {
			System.out.println(small+"는(은) "+big+"의 약수가 아닙니다.");
		}
		


	sc.close();}

}
