package com.greedy.section03.constant;

public class Application2 {

	public static void main(String[] args) {
		
		/* 상수의 명명 규칙 */
		
		/* 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다. */
		final int AGE1 = 20;
		final int AGE2 = 30;
		final int age3 = 40; 		//소문자 가능하지만 변수와 구분이 힘들다.
		
		/* 2. 단어의 단어 연결은 언더스코어(_)를 사용한다. */
		final int MAX_AGE = 60;
		final int MIN_AGE = 20;
		final int minAGE = 30; 		//camel case 사용 가능하지만 변수와 구분이 힘들다.
		
	}

}
