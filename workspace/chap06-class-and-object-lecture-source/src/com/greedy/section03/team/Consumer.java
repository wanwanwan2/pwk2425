package com.greedy.section03.team;

	

	public class Consumer {
	
		private	boolean isOn;
		private Manager order = new Manager();
	
	public void order() {
		order.order();
	}
	
	public void bill2() {
		
		if(isOn) {
			System.out.println("이미 영수증을 받았습니다.");
		} else {
			this.isOn = true;
			System.out.println("손님이 영수증을 받았습니다.");
		}
	  }
	private Manager deliver2 = new Manager();
	
	public void deliver2() {
		deliver2.deliver2();
	}
}
