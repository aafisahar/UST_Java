package com.ustglobal.exception.customizecheckedexception;

public class TestAmount {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(560000);
			System.out.println("withdraw your cash");
		} catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Main ended");
	}
}
