package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*아래의 조건과 같이 출력되도록 프로그램을 작성하세요
		⚫ 태어난 년도를 입력받습니다.
		⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
		⚫ 성인(20세 이상) 이면 무료료 건강검진을 받을 수 있습니다.
		⚫ 짝수해 태어난 사람은 올해가 짝수해 이면 검사대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
		(홀수해 태어난 사람이 올해가 홀수해 이면 검사대상 올해가 짝수해 이면 검사대상이 아닙니다.) 
		⚫ 40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다.*/
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.println("년도");
		int Birthsyear=sc.nextInt();
		System.out.println("올해:2023");
		System.out.println("태어난해"+Birthsyear);
		int year;
		year=2023-Birthsyear;
		System.out.println("나이:"+year);
		
		System.out.println("==================================");
		
		if (20>year) {
			System.out.println("20살미만 건강검진대상이 아님");
		}else if (20<=year && year%2==0 && year<40) {
			System.out.println("20살이상 건강검진해 암검사x");
		}else if (20<=year && year%2==0 && year>=40) {
			System.out.println("20살이상 건강검진해 암검사");
		}else {
			System.out.println("20살이상 건강검진대상해 아님");
		}
		
		

	sc.close();}

}
