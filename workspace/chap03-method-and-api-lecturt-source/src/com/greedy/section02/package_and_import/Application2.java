package com.greedy.section02.package_and_import;

//import java.lang.*;
import com.greedy.section01.method.Calculator;
import static com.greedy.section01.method.Calculator.maxNumberOf;

public class Application2 {

	public static void main(String[] args) {
		
		/* 1. non-static 메소드 호출 */
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(50, 60);
		
		System.out.println("50과 60중 더 작은 값은 : " + min);
		
		/* 2. static 메소드 호출 */
		int max = Calculator.maxNumberOf(50, 60);
		
		System.out.println("50과 60 중 더 큰 값은 : " + max);
		
		/* static import를 하게 되면 다른 클래스의 static 메소드 호출 시에도 클래스명을 생략하고 쓸 수 있다. */
		int max2 = maxNumberOf(100, 200);
		
		System.out.println("100과 200중 더 큰 값은 : " + max2);
	}

}
