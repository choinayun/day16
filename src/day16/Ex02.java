package day16;

import java.util.ArrayList;

final class A {
	// final ����ϸ� ��� �Ұ��� 
	// ��� �Ұ����ϴ� overriding �Ұ��� 
	public void aaa() {
		System.out.println("AŬ����");
	}
}

class B extends ArrayList {
	A a = new A();
	// �ٸ� class�� ��ü�� ���� ��� �޴� ��ó�� ��� ���� 
	public void bbb() {
		
		// ctrl + �ش� �ڷ��� ������ Ȯ�� ���� 
		// final �� ������ ��� �Ұ��� ������ ��� ���� 
		
		String s; 	   // ��� �Ұ��� 
		//ArrayList arr; // ��� �޴� �� ���� 
		a.aaa();
		System.out.println("BŬ����");
	}
}

class AA {
	public void aa() {
		
	}
}

class BB extends AA {
	public void bb() {
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		BB bb = new BB();

		
		B b = new B();
		b.bbb();
		
		b.add("aaa");
		System.out.println( b.get(0) );
	}
}
