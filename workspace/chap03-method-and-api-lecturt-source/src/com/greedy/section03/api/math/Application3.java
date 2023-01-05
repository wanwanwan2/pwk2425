package com.greedy.section03.api.math;

import java.util.Random;

public class Application3 {

	public static void main(String[] args) {
		
		/* java.util.Random 클래스 */
		Random random = new Random();
		
		/* 0부터 9까지의 난수 발생 */
		int randomNumber1 = random.nextInt(10);
		System.out.println("0부터 9까지의 난수 : " + randomNumber1);
		
		/* 1부터 10까지 난수 발생 */
		int randomNumber2 = random.nextInt(10) + 1;
		System.out.println("1부터 10까지의 난수 : " + randomNumber2);
	}

}
