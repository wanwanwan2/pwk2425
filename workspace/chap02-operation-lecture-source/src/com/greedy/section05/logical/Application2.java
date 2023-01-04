package com.greedy.section05.logical;

public class Application2 {

	public static void main(String[] args) {
		
		/* 논리 연산자의 우선순위와 활용
		 * && : 11순위
		 * || : 12순위
		 * */
		
		int x = 3;
		int y = 10;
		
		System.out.println(y >= 5 || x > 0 && x < 2);
		
		/* 1. 1부터 100사이의 값인지 확인
		 * 1 <= 변수 <= 100 이렇게는 사용하지 못함 
		 * 변수 >= 1 && 변수 <= 100
		 * */
		
		int num1 = 55;
		System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));
		
		int num2 = 166;
		System.out.println("1부터 100 사이인지 확인 : " + (num2 >=1 && num2 <= 100));
		
		/* 2. 어떤 문자가 대문자인지 확인 */
		/* 문자 >= 'A' && 문자 >= 'Z' */
		char ch1 = 'G';
		
		System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
		
		char ch2 = 'g';
		System.out.println("영어 대문자인지 확인: " + (ch2 >= 'A' && ch2 <= 'Z'));
		
		/* 3. 대문자 소문자 상관없이 영문자 'y'인지 확인 */
		/* 문자 == 'y' || 문자 == 'Y' */
		
		char ch3 = 'y';
		System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));
		
		/* 4. 영문자인지 확인*/
		/* A: 65, Z: 90, a: 97, z: 122*/
		char ch5 = 'f';
		System.out.println("영문자 인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
		System.out.println("영문자 인지 확인 : " + ((ch5 >= 65 && ch5 <=90) || (ch5 >= 97 && ch5 <= 122)));
	}

}
