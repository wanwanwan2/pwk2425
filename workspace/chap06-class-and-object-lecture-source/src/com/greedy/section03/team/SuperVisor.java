package com.greedy.section03.team;

public class SuperVisor {

	
	private boolean isOn;
	
	public void bill1() {
		
	if(isOn) {
		System.out.println("이미 영수증을 받았습니다.");
	} else {
		this.isOn = true;
		System.out.println("슈퍼바이저가 영수증을 받았습니다.");
	}
  }
	
	public void deliver1() {
		
	if(isOn) {
		System.out.println("이미 김밥을 전달하였습니다.");
	} else {
		this.isOn = true;
		System.out.println("매니저에게 김밥을 전달하였습니다.");
		}
	}
}
