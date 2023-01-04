package com.greedy.section01.literal;

public class Application2 {

	public static void main(String[] args) {
		
		/* 값을 직접 연산하여 출력 할 수 있다.
		 * 이 때의 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다. 
		 * */
		
		/* 1. 숫자와 숫자의 연산 */
		/* 1-1. 정수와 정수의 연산 */
		System.out.println("============ 정수와 정수의 연산 ============");
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);		//정수와 정수의 연산 결과는 정수가 나온다.
		System.out.println(123 % 10);		//모드(mod)연산 -> 두 수를 나눈 나머지 반환

		/* 1-2. 실수와 실수의 연산 */
		System.out.println("============ 실수와 실수의 연산 ============");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);  	//실수와 실수의 연산 결과는 실수가 나온다.
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 10.0);
		
		/* 1-3. 정수와 실수의 연산*/
		/* 정수와 실수의 연산 결과는 항상 실수가 나온다.*/
		System.out.println("============ 정수와 실수의 연산 ============");
		System.out.println(123 + 0.5);
		System.out.println(123 - 1.0);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
		/* 2. 문자의 연산 */
		/* 2-1. 문자와 문자의 연산 */
		/* 문자는 숫자로 인식된다. 따라서 숫자에 사용 가능한 연산이 전부 사용 가능하다. */
		System.out.println("============ 문자와 문자의 연산 ============");
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');
		System.out.println('a' / 'b');
		System.out.println('a' % 'b');
		
		/* 2-2. 문자와 정수의 연산 */
		System.out.println("============ 문자와 정수의 연산 ============");
		System.out.println('a' + 1);		
		System.out.println('a' - 1);		
		System.out.println('a' * 2);		
		System.out.println('a' / 2);		
		System.out.println('a' % 2);
		
		/* 2-3. 문자와 실수의 연산 */
		System.out.println("=========== 문자와 실수의 연산 ============");
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0);
		
		/* 3. 문자열의 연산 */
		/* 3-1. 문자열과 문자열의 연산 */
		/* 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어붙이기)가 된다.
		 * 문자열은 '+' 연산 외에 다른 연산을 사용하지 못한다.
		 * */
		
		System.out.println("=========== 문자열과 문자열의 연산 ==========");
		System.out.println("hello" + "world");
//		System.out.println("hello" - "world");
//		System.out.println("hello" * "world");
//		System.out.println("hello" / "world");
//		System.out.println("hello" % "world");
		
		/* 3-2. 문자열과 다른 형태의 값 연산 */
		System.out.println("=========== 문자열과 다른 형태의 값 연산 =========");
		System.out.println("helloworld" + 123);
		System.out.println("helloworld" + 123.456);
		System.out.println("helloworld" + 'a');
		System.out.println("helloworld" + true);
		
		/* 주의사항 : 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 되는 것에 주의!*/
		System.out.println("=========== 문자열 형태의 숫자 값 '+' 연산 ========");
		System.out.println("123" + "456");
		
		/* 4. 논리값 연산 */
		/* 4-1. 논리값과 논리값의 연산 */
//		System.out.println(true + false);
//		System.out.println(true - false);
//		System.out.println(true * false);
//		System.out.println(true / false);
//		System.out.println(true % false);
		
		/* 4-2. 논리값과 다른 값의 연산 */
//		System.out.println(true + 1);
//		System.out.println(true + 1.0);
//		System.out.println(true + 'a');
		System.out.println(true + "a");
		
	}

}
