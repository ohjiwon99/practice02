package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 아래의 조건과 같이 출력되도록 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 연도를 입력해 주세요");
		System.out.println("년도:");
		
		int year;
		year =sc.nextInt();
		
		int age = 2023- year;

		if (15>age || 65<=age ) {
			System.out.println(age+"살 "+"무료예방접종 대상자입니다.");
		}else {
			System.out.println(age+"살 "+"무료예방접종 대상자가 아닙니다.");
		}

	sc.close();}

}
