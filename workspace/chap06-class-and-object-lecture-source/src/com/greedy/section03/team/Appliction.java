package com.greedy.section03.team;

import java.util.Scanner;

public class Appliction {

	public static void main(String[] args) {

		Manager service = new Manager();
		Consumer custom = new Consumer();
		SuperVisor service1 = new SuperVisor();
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("야채김밥: 1000원");
			System.out.println("참치김밥: 2000원");
			System.out.println("김치김밥: 1500원");
			System.out.println("1. 주문");
			System.out.println("2. 슈퍼바이저에게 주문내역전달");
			System.out.println("3. 손님에게 주문내역 전달");
			System.out.println("4. 슈퍼바이저가 김밥을 매니저에게 전달");
			System.out.println("5. 매니저가 김밥을 손님에게 전달" );
			System.out.println("9. 잘먹겠습니다.");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : service.order(); break;
				case 2 : service1.bill1(); break;
				case 3 : custom.bill2(); break;
				case 4 : service.deliver1(); break;
				case 5 : custom.deliver2(); break;				
				case 9 : System.out.println("잘먹겠습니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
		}
		
	}

	}
}