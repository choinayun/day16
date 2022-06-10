package day16;

import java.util.ArrayList;

class A1 {
	public void print() {
		System.out.println("A클래스");
	}
}

class B1 extends A1{
	public void print() { // 오버라이딩
		System.out.println("B클래스");
	}
	public void bbb() {
		System.out.println("다운캐스팅");
	}
}

class C1 extends A1{
	public void print() {
		System.out.println("C클래스");
	}	
	public void add(int a) {
		System.out.println(a);
	}
}

public class Ex04 {

	public static void main(String[] args) {
		/*
		A1 a;
		B1 b;
		C1 c;
		a = new A1(); a.print();
		b = new B1(); b.print();
		c = new C1(); c.print();
		*/
		
		A1 a; //공통적으로 가지고 있는 것
		// 업캐스팅 방식 (자식의 형태를 부모의 형태로 형변환)
		// 부모가 가지고 있는 메소드만 호출 가능 
		a = new B1(); a.print(); 
		a = new C1(); a.print();
		
		B1 b = (B1)a; // 다운캐스팅 (부모의 형태를 자식의 형태로 형변환)
		b.bbb(); // 다운캐스팅 사용하는 예 
		
		ArrayList arr = new ArrayList();
		// 모든 값의 부모는 object
		// object 타입으로는 모든 값을 넣어줄 수 있다 
		// int i = "aaa";
		Object i = "aaa"; // 업캐스팅
		arr.add("aaa");
		
		C1 cc = new C1();
		cc.add(1111);
	}
}
