package com.greedy.section03.api.math;

public class Application1 {

	public static void main(String[] args) {
		
		/* java.lang.Math
		 * Math클래스는 수학에서 자주 사용하는 상수들과 함수 들을 미리 구현해놓은 클래스이다.
		 * */
		
		/* 절대값 */
		System.out.println("-7의 절대값 : " + Math.abs(-7));
		System.out.println("-1.25의 절대값 : " + Math.abs(-1.25));
		
		/* 최대값 최솟값 */
		System.out.println("10과 20중 더 작은 것은 : " + Math.min(10,20));
		System.out.println("20과 30중 더 큰 것은 : " + Math.max(20, 30));
		
		/* 원주율 */
		System.out.println("원주율 : " + Math.PI);
		
		/* 난수 발생 */
		System.out.println("난수 발생 : " + Math.random());
		
		
	}

}
