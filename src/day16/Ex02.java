package day16;

import java.util.ArrayList;

final class A {
	// final 사용하면 상속 불가능 
	// 상속 불가능하니 overriding 불가능 
	public void aaa() {
		System.out.println("A클래스");
	}
}

class B extends ArrayList {
	A a = new A();
	// 다른 class에 객체를 만들어서 상속 받는 것처럼 사용 가능 
	public void bbb() {
		
		// ctrl + 해당 자료형 누르면 확인 가능 
		// final 이 있으면 상속 불가능 없으면 상속 가능 
		
		String s; 	   // 상속 불가능 
		//ArrayList arr; // 상속 받는 것 가능 
		a.aaa();
		System.out.println("B클래스");
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
