package com.greedy.section01.method;

public class Application2 {

	public static void main(String[] args) {
		
		System.out.println("main() 호출됨...");
		
		/* non static 메소드 호출하는 방법
		 * 클래스명 사용할 이름 = new 클래스명();
		 * 사용할 이름, 메소드명();
		 *  */
		Application2 app2 = new Application2();
		app2.methodA();
		app2.methodB();
		
		System.out.println("main() 종료됨...");
;	}

	public void methodA() {
		
		System.out.println("methodA() 호출됨...");
		
		System.out.println("methodA() 종료됨...");
		
	}
	
	public void methodB() {
		
		System.out.println("methodB() 호출됨...");
		
		System.out.println("methodB() 종료됨...");
	}
}
