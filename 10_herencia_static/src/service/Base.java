package service;

public class Base {
	public static void print() {
		System.out.println("hello");
	}
}
class Hija extends Base{
	
	public static void print() {
		System.out.println("by");
	}
	
	public static void m() {
		Base.print(); //hello
		Hija.print();  //by
		print();  //by
	}
}
