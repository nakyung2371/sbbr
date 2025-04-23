package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor; 

@RequiredArgsConstructor
@Getter
public class HelloLombok {
	private final String hello;
	private final int lombok;
	
//	public static void main(String[] arg) {
//		HelloLombok helloLombok = new HelloLombok();
//		helloLombok.setHello("헬로");
//		helloLombok.setLombok(5);
//		
//		System.out.println(helloLombok.getHello());
//		System.out.println(helloLombok.getLombok());
//	}
	
//	public void setHello(String hello) {
//		this.hello = hello;
//	}
//	
//	public void setLombok(int lombok) {
//		this.lombok = lombok;
//	}
//	
//	public String getHello() {
//		return this.hello;
//	}
//	
//	public int getLombok() {
//		return this.lombok;
//	}
	
	public static void main(String[] arg) {
		HelloLombok helloLombok = new HelloLombok("헬로", 5);
//		helloLombok.setHello("헬로");
//		helloLombok.setLombok(5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}
