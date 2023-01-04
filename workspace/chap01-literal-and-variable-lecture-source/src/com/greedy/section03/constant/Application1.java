package com.greedy.section03.constant;

public class Application1 {

	public static void main(String[] args) {
		
		/* 상수란? 
		 * 변하지 않는 값을 저장해두기 위한 메모리상의 공간을 의미한다. 
		 * */
		
		/* 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
		 * 초기화 이후 값 대입시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
		 * 예) 수학 공식에 사용되는 수치 PI -> 3.14
		 * */
		
		/* 1. 상수 선언 */
		/* 상수 선언 시 자료형 앞에 final을 붙인다. */
		final int AGE;
		
		/* 2. 초기화 */
		AGE = 20;
//		AGE = 30; 		//초기화 이후 값을 대입하는 것은 불가능하다.
		
		/* 3. 상수 사용 */
		System.out.println("AGE의 값 : " + AGE);
		
		System.out.println("AGE의 두 배 : " + (AGE * 2 ));
	}

}
