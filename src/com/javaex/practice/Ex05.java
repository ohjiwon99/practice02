package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		age = sc.nextInt();
		
		if (age>20) {
			System.out.println("\"1번그룹\"");			
		}else {
			System.out.println("\'2번그룹\'");
		} System.out.println("입니다.");		
		
sc.close();
	}

}
/*
(1)15일 때 결과 /2번
(2)19일 때 결과 /2번
(3)20일 때 결과 /2번
(4)21일 때 결과 /1번
(5)100일 때 결과/1번
*/