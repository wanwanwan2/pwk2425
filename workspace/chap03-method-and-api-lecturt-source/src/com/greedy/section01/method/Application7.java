package com.greedy.section01.method;

public class Application7 {

	public static void main(String[] args) {
		
		/* 매개변수와 리턴값 복합 활용 */
		/* 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기 */
		
		int first = 20;
		int second = 10;
		
		Application7 app7 = new Application7();
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 몫 : " + app7.divideTwoNumbers(first, second));
	
	}	
	/**
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 더하여 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 더하기를 할 첫 번째 정수
	 * @param second 더하기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 더한 결과
	 * */
		
	public int plusTwoNumbers(int first, int second) {
		
		return first + second;
	}
	/**
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 이용하여 
	 * 첫 번째 매개변수로 전달받은 정수에서 두 번째 매개변수로 전달받은 정수를 뺀 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 빼기를 할 첫 번째 정수
	 * @param sencond 빼기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 뺀 결과
	 * */
		
	public int minusTwoNumbers(int first, int second) {
		
		return first - second;
	}
	/**
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 곱하여 결과 값을 반환하는 기능 제공
	 * </pre>
	 * @param first 곱하기를 할 첫 번째 정수
	 * @param second 곱하기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수 의 곱셈 결과
	 * */
		
	public int multipleTwoNumbers(int first, int second) {
		
		return first * second;
	}
	/**
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 이용하여 
	 * 첫 번째 매개변수로 전달한 정수에서
	 * 두 번째 매개변수로 전달한 정수를 나누고 그 몫을 정수형으로 반환하는 기능 제공
	 * 단, 두 번째 매개변수를 0으로 하면 ArithmeticException이 발생할 수 있으므로 주의에서 사용해야함
	 * </pre>
	 * @param first 나누기를 할 첫 번째 정수 
	 * @param second 나누기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수의 나누기한 몫 결과 
	 * */
	
	
	public int divideTwoNumbers(int first, int second) {
		
		return first / second;
	}
}
