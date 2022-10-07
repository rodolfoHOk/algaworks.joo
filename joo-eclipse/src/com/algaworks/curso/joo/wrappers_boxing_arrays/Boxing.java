package com.algaworks.curso.joo.wrappers_boxing_arrays;

public class Boxing {
	
	public static void main(String[] args) {
	
		Integer i = 10; // Boxing
		
		Integer j = Integer.valueOf(10);
		int x = j; // UnBoxing
		
		System.out.println(i + x);
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i1 == i2); // true -> obs
		System.out.println(i3 == i4); // false
		System.out.println(i1.equals(i2)); // true
		System.out.println(i3.equals(i4)); // true
		
		// obs: true (considerado mesmo objeto) acontece nos valores de:
		// - boolean
		// - short e integer de -128 a 127
		// - char de \u0000 a \u007F
		
	}
	
}
