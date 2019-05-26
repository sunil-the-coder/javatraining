package com.itp.training;

class MyClass<E> {
	E data;

	public MyClass(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MyClass [data=" + data + "]";
	}

}

public class GenericTest {

	public static void main(String[] args) {

		MyClass<Double> obj = new MyClass<Double>(5.4);;
		System.out.println(obj);
	}
}
