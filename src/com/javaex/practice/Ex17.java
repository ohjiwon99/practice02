package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요
		
		System.out.println("수익을 입력해 주세요");
		System.out.println("금익: ");
		int num= sc.nextInt();
		double tax=0;
		
		if (num>0 && num<=1000) {
			tax = num * 0.09;
		}else if (num>1000 && num<=4000) {
			tax =(1000*0.09)+0.18*(num-1000);
		}else if (num>4000 && num<8000) {
			tax =(1000*0.09)+(3000*0.18)+0.27*(num-4000);
		}else if (num>=8000) {
			tax =(1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(num-8000);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println("소득세는"+tax+"입니다.");
		
		
		
		
		
		
		
		
		
		
		
		

	sc.close();}

}
