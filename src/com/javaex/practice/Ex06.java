package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*나이를 입력받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
          작성하세요*/
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		
		int age;
		age = sc.nextInt();
		
		if (age>=19 && age<65) {
			System.out.println("1번그룹입니다.");	
			
		} else {
			System.out.println("2번그룹입니다.");
			
		} 
		
		
           sc.close();
	}

}
