package com.greedy.section05.typecasting;

public class Application1 {

	public static void main(String[] args) {
		
		/* 데이터 형변환 */
		/* 데이터 형변환의 필요한 이유 
		 * - 자바에서 다른 타입끼리 연산은 피연산들이 모두 같은 타입인 경우에만 가능하다.
		 * 	즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
		 * */
		
		/* 형변환의 종류와 규칙
		 * 1. 자동 형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
		 * 	1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
		 * 	1-2. 정수는 실수로 자동 형변환 된다.
		 * 	1-3. 문자형은 int형으로 자동 형변환 된다.
		 * 	1-4. 논리형은 형변환 규칙에서 제외된다.
		 *  
		 * 2. 강제 형변환 (명시적 형변환) : 형변환 연산자를 이용한 강제적으로 수행하는 형변환
		 * 	2-1. 자동 형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
		 * */
		
		/* 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다. */
		/* 1-1-1. 정수끼리의 자동 형변환 */
		byte bnum = 1;
		short snum = (short) bnum;
		int inum = snum;
		long lnum = inum;
		
		lnum = 10000000000L;
		
		/* 연산 시에도 자동으로 큰 쪽 자료형으로 맞춰서 계산한다. */
		int num1 = 10;
		long num2 = 20;
		
//		int result = num1 + num2;
		long result1 = num1 +num2;
		
		System.out.println("result1 : " + result1);
		
		/* 1-1. 실수끼리의 자동 형변환 */
		float fnum = 4.0f;
		double dnum = fnum;
		
		double result2 = fnum + dnum;
		
		System.out.println("result2 : " + result2);
		
		/* 1-2. 정수는 실수로 자동 형변환 된다. */
		long eight = 8;
		float four = eight;
		
		System.out.println("four : " + four);
		
		/* 상수와 정수의 연산은 실수로 연산 결과가 반환된다. */
		float result3 = eight + four;
		
		System.out.println("result3 : " + result3);
		
		/* 1-3. 문자형은 int형으로 자동 형변환한다. */
		char ch1 = 'a';
//		short sch = ch1;
		int charNumber = ch1;
		
		System.out.println("charNumber : " + charNumber);
		
		char ch2 = 65;
		
//		int a = 65;
//		char ch3 = a;
		
		System.out.println("ch2 : " + ch2);
		
		/* 1-4. 논리형은 형변환 규칙에서 제외된다. */
//		boolean isTrue = true;
//		byte b = isTrue;
//		short s = isTrue;
//		int i = isTrue;
//		long l = isTrue;
		
	}

}
