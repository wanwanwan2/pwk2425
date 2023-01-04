package com.greedy.section04.comparison;

public class Application1 {

	public static void main(String[] args) {
		
		/* 비교연산자 (매우 중요) */
		/* 1. 숫자값 비교 */
		/* 1-1. 정수 비교 */
		
		int inum1 = 10;
		int inum2 = 20;
		
		System.out.println("========== 정수값 비교 ===========");
		System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));	//equal
		System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2)); 	//not equal
		System.out.println("inum1가 inum2보다 큰지 비교 : " + (inum1 > inum2));
		System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
		System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
		System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1 <= inum2));
		
		/* 1-2. 실수 비교 */
		double dnum1 = 10.0;
		double dnum2 = 20.0;
		
		System.out.println("======== 실수값 비교 ========");
		System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
		System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2));
		System.out.println("dnum1이 dnum2보다 큰지 비교: " + (dnum1 > dnum2));
		System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
		System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
		System.out.println("dnum1이 dnum2보다 작거나 같은지 비교 : " + (dnum1 <= dnum2));
		
		/* 2. 문자값 비교*/
		char ch1 = 'a';		//97
		char ch2 = 'A';		//65
		
		System.out.println("========= 문자값 비교 ==========");	
		System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
		System.out.println("ch1과 ch2가 같지 않은지 비교 " + (ch1 != ch2));
		System.out.println("ch1이 ch2보다 큰 지 비교" + (ch1 > ch2));
		System.out.println("ch1이 ch2보다 크거나 같은지 비교" + (ch1 >= ch2));
		System.out.println("ch1이 ch2보다 작은지 비교" + (ch1 > ch2));
		System.out.println("ch1이 ch2보다 작거나 같은지 비교" + (ch1 >= ch2));
	
		/* 3. 논리값 비교 */
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("========= 논리값 비교 ==========");	
		System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
		System.out.println("bool1과 bool2가 같지 않은지 비교 " + (bool1 != bool2));
//		System.out.println("bool1과 bool2가 큰지 비교 : " + (bool1 > bool2));
		
		/* 4. 문자열값 비교 */
		String str1 = "java";
		String str2 = "java";
		
		System.out.println("========== 문자열값 비교 =========");
		System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
		System.out.println("str1과 str2가 같지 같지 않은지 비교 : " + (str1 != str2));
//		System.out.println("str1과 str2가 큰지 비교 : " + (str1 > str2));
		
			
	
	}
	
}

