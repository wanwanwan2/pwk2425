package com.greedy.section03.team;

public class Manager {

	
	private boolean isOn;
		
		public void order() {
		
		if(isOn) {
			System.out.println("이미 주문을 하였습니다.");
		} else {
			this.isOn = true;
			System.out.println("김밥을 주문하였습니다.");
		}
	}
		private SuperVisor bill1 = new SuperVisor();
		
		public void bill1() {
			bill1.bill1();
		}
		
		
		private SuperVisor deliver1 = new SuperVisor();
		
		public void deliver1() {
			deliver1.deliver1();
		
		}
		
		public void deliver2() {
			
			if(isOn) {
				System.out.println("이미 김밥을 전달하였습니다.");
			} else {
				this.isOn = true;
				System.out.println("손님에게 김밥을 전달하였습니다.");
				}
			}
		
}
