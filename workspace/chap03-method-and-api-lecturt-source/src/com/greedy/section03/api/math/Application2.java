package com.greedy.section03.api.math;

public class Application2 {

	public static void main(String[] args) {
		
		/* 원하는 범위의 난수 발생 
		 * (int) (Math.random() * 구하려는 난수의 갯수) + 난수의 최솟값
		 * */
		
		
		/* 0 ~ 9까지의 난수 발생 */
		int random1 = (int) (Math.random() * 10);
		System.out.println("0부터 9 사이의 난수 : " + random1);
		
		/* 1 ~ 10까지의 난수발생 */
		int random2 = (int) (Math.random() * 10) + 1;
		System.out.println("1부터 10 까지의 난수 : " + random2);
				
		/* 10 ~ 15까지의 난수발생 */
		int random3 = (int) (Math.random() * 6) + 10;
		System.out.println("10 부터 15 까지의 난수 : " + random3); 
		
		/* -128 ~ 128까지의 난수발생 */
	 	int random4 = (int) (Math.random() * 256) -128;
		System.out.println("-128부터  128까지의 난수 : + " + random4);
	}

}

