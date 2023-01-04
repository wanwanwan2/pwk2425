package com.greedy.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		
		/* 오버플로우 */
		/* 자료형 별 값의 최대 범위를 벗어나는 경우
		 * 발생한 carry(용량처리)를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킴
		 * */
		
		byte num1 = 127;
		
		System.out.println("num1 : " + num1);
		
		num1++;
		
		System.out.println("num1 overflow : " + num1);
		
		/* 언더플로우 */
		byte num2 = -128;
		
		System.out.println("num2 : " + num2);
		
		num2--;
		
		System.out.println("num2 underflow : " + num2);
		
		int firstNum = 1000000;
		int secondNum = 700000;
		
		int multi = firstNum * secondNum;
		
		System.out.println("firstNum * secondNum = " + multi);
		
		/* 해결 방법 */
		long longMulti = firstNum * secondNum;
		
		System.out.println("longMulti : " + longMulti);
		
		long result = (long) firstNum * secondNum;
		
		System.out.println("result : " + result);
		
	}

}
