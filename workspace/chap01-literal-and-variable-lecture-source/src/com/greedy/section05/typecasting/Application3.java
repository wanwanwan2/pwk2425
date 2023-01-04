package com.greedy.section05.typecasting;

public class Application3 {

	public static void main(String[] args) {
		
		/* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산 */
		int inum = 10;
		long lnum = 100;
		
		/* 방법1. 두 수의 연산 결과를 int형으로 형변환 한 후 int 자료형 변수에 리턴받는다. */
		int sum = (int) (inum + lnum);
		
		/* 방법2. long형을 강제로 int로 변경 후 연산 */
		int sum2 = inum + (int) lnum;
		
		/* 방법3. 결과값을 long형 자료형으로 받는다. (자료형변환 이용) */
		long sum3 = inum + lnum;
		
		/* 주의사항 : 정수 연산의 경우 int 미만의 연산 처리 결과는 형상 int형으로 변환된다. */
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
		
		int result = byteNum1 + byteNum2;
		int result2 = byteNum1 + shortNum1;
		int result3 = shortNum1 + byteNum1;
		int result4 = shortNum1 + shortNum2;
		
		

	}

}
