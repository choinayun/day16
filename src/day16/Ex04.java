package day16;

import java.util.ArrayList;

class A1 {
	public void print() {
		System.out.println("AŬ����");
	}
}

class B1 extends A1{
	public void print() { // �������̵�
		System.out.println("BŬ����");
	}
	public void bbb() {
		System.out.println("�ٿ�ĳ����");
	}
}

class C1 extends A1{
	public void print() {
		System.out.println("CŬ����");
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
		
		A1 a; //���������� ������ �ִ� ��
		// ��ĳ���� ��� (�ڽ��� ���¸� �θ��� ���·� ����ȯ)
		// �θ� ������ �ִ� �޼ҵ常 ȣ�� ���� 
		a = new B1(); a.print(); 
		a = new C1(); a.print();
		
		B1 b = (B1)a; // �ٿ�ĳ���� (�θ��� ���¸� �ڽ��� ���·� ����ȯ)
		b.bbb(); // �ٿ�ĳ���� ����ϴ� �� 
		
		ArrayList arr = new ArrayList();
		// ��� ���� �θ�� object
		// object Ÿ�����δ� ��� ���� �־��� �� �ִ� 
		// int i = "aaa";
		Object i = "aaa"; // ��ĳ����
		arr.add("aaa");
		
		C1 cc = new C1();
		cc.add(1111);
	}
}
