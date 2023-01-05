package com.greedy.section01.method;

public class Application9 {

	public static void main(String[] args) {
	
		/* 다른 클래스에 각성한 메소드 호출 */
		int first = 100;
		int second = 50;
		
		/* 1. non-static 메소드 */
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(first, second);
		
		System.out.println("두 수 중 최솟값은 : " + min);
			
		/* 2. static 메소드 */
		int max = Calculator.maxNumberOf(first, second);
		
		System.out.println("두 수 중 최대값은 : " + max);
		
		/* 주의!
		 * static 메소드로 non-static 메소드처럼 호출은 가능하다.
		 * 하지만 권장하지는 않는다.
		 * static 키워드는 여러 객체가 공유하는 영역이다.
		 * 이 때 객체를 이용해 static 메소드에 접근하게 되면 그 객체가 가지는 값으로 메소드가 동작하여
		 * 예상하지 못하는 결과값이 반환될 가능성이 있기 때문에 사용을 제한하는 것이 좋다.
		 * 또한, 객체를 만들면서 메모리 영역을 할당하기 때문에 불필요한 메모리 낭비 현상이 발생할 수 있다.
		 * */
		
		int max2 = calc.maxNumberOf(first, second);
		
		System.out.println("두 수 중 더 큰 값은 : " + max2);

	}

}
