package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(24);
		al.add(22.3);
		al.add("Sufi");
		al.add(true);
		al.add(null);
		al.add('A');
		
		for(int i = 0; i < 6;i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
	}
}
