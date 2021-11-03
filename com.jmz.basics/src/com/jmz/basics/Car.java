package com.jmz.basics;

class CarA {
	void milage() {
		System.out.println("car mialge");
	}
}

class BMW extends CarA {

}

class Tesla extends CarA {
	void eslaMialge() {
		System.out.println("tesla milage");
	}

	ElectricNew electric;
}

class ElectricNew {
	void test() {
		System.out.println("electric");
	}
}

public class Car {
	public static void main(String[] args) {

		Tesla t = new Tesla();
		t.electric.test();
	}
}
