package com.ustglobal.atmmachine;

public class TestA {
     
	public static void main(String[] args) {
		
		Machine m = new Machine();
		
		HDFC h1 = new HDFC();
		m.slot(h1);
		
		System.out.println("-----------------------");
		
		ICICI i1 = new ICICI();
		m.slot(i1);
		
		System.out.println("-----------------------");
		
		SBI s1 = new SBI();
		m.slot(s1);
	}
}
