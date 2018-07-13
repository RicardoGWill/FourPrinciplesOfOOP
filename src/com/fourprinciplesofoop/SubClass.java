package com.fourprinciplesofoop;

public class SubClass extends SuperClass {
	
	static protected String a;
	static protected String b;
	static protected int x;
	static protected int y;

	SubClass (String a, String b) {
		SubClass.a = a;
		SubClass.b = b;
	}
	
	SubClass (int x, int y) {
		SubClass.x = x;
		SubClass.y = y;
	}

	static SubClass object1 = new SubClass ("Goodbye ", "New York!");
	static SubClass object2 = new SubClass (400, 500);
	
	public static void main(String[] args) {
		System.out.println(object1.method1());
		System.out.println(object2.method2());
	}
	
	@Override
	public int method2( ) {
		int x = 100;
		int y = 300;
		return x * y;
	}


}