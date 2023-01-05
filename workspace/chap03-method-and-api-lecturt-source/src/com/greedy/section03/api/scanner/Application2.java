package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* Scanner의 nextLine()과 next() */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인사말을 입력해주세요 : ");
		String greeting1 = sc.nextLine();
		System.out.println(greeting1);
		
		System.out.print("인사말을 입력해주세요 : ");
		String greeting2 = sc.next();
		System.out.println(greeting2);
		System.out.println(sc.next());
	}

}
