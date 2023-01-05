package com.greedy.section02.package_and_import;

public class Application {

	public static void main(String[] args) {
		
		com.greedy.section01.method.Calculator calc = new com.greedy.section01.method.Calculator();
		int min = calc.minNumberOf(30,20);
		
		System.out.println("30과 20중 더 작은 값은 : " + min);
		
		/* 2. static 메소드 호출 */
		int max = com.greedy.section01.method.Calculator.maxNumberOf(30, 20);
		
		System.out.println("30과 20중 더 큰 값은 : " + max);
	}

}
