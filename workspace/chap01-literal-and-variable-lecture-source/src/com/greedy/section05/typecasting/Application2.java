package com.greedy.section05.typecasting;

public class Application2 {

	public static void main(String[] args) {
		
		/* 강제형변환 */
		/* 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다. */
		
		/* 강제 형변환 규칙 */
		/* 1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요한다.
		 * 2. 상수를 정수로 변경 시 강제 형변환이 필요하다.
		 * 3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
		 * 4. 논리형은 강제 형변환 규칙에서도 제외된다.
		 * */
		
		/* 1-1. 정수끼리의 강제 형변환 */
		long lnum = 8;
//		int inum = lnum;		//데이터 손실 가능성을 컴파일러가 알려준다.
		int inum = (int)lnum;	//변경하려는 자료형을 명시하여 강제 형변환을 해야 함
		
		short snum = (short) inum;
		byte bnum = (byte) snum;
		
		/* 1-2. 실수끼리의 강제 형변환 */
		double dnum = 8.0;
		float fnum = (float) dnum;
		
		/* 2. 실수를 정수를 변경 시 강제 형변환 */
		float fnum2 = 4.0f;
		long lnum2 = (long) fnum2;		//소수점 이하의 데이터 손실 가능성때문에 컴파일러가 알려준다.
		
		/* 3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환 */
		char ch = 'a';
		byte bnum2 = (byte) ch;
		short snum2 = (short) ch;
		
		int num1 = 97;
		int num2 = -97;
		
		char ch2 = (char) num1;
		char ch3 = (char) num2;
		
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		
		/* 4. 논리형은 강제 형변환 규칙에서도 제외된다. */
//		boolean isTrue = true;
//		byte b = (byte) isTrue;
//		short s = (short) isTrue;
//		int i = (int) isTrue;
//		long l = (long) isTrue;
//		float f =(float) isTrue;
//		double d = (double) isTrue;
//		char c = (char) isTrue;
	}

}
