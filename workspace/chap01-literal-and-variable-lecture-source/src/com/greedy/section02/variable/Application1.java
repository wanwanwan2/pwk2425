package com.greedy.section02.variable;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수의 사용 목적 
		 * 1. 값에 의미를 부여하기 위한 목적
		 * 2. 한번 값을 저장하고 재사용을 하기 위한 목적 
		 * 3. 시간에 따라 변하는 값을저장하고 사용하기 위한 목적 
		 * */
		
		System.out.println("===== 값에 의미 부여 테스트 =====");
		System.out.println("보너스를 포함한 급여 : " + (1000000 + 2000000) + "원");
		
		int salary = 1000000;
		int bonus = 200000;
		
		System.out.println("보너스를 포함한 급여: "+ (salary + bonus) + "원");
		
		System.out.println("===== 변수에 저장한 값 재사용 테스트 =====");
		System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");
		
		int point = 100;
		System.out.println("1번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("2번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("3번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("4번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("5번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("6번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("7번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("8번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("9번 고객에게 포인트를" + point + "지급하였습니다.");
		System.out.println("10번 고객에게 포인트를" + point + "지급하였습니다.");
		
		System.out.println("===== 시간에 따라 변하는 값 테스트 =====");
		
		int sum = 0;
		
		sum = sum + 10;  //대입연산자 왼쪽에는 공간 오른쪽에는 값이 온다.
		System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
		
		sum = sum + 10;  //대입연산자 왼쪽에는 공간 오른쪽에는 값이 온다.
		System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
		
		sum += 10;  //sum에 10을 더하라는 표시
		System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
		
		
	}

}
