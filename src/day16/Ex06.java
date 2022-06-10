package day16;

class AAAA{
	public void aaa() {
		
	}
}

class Ex06Class extends AAAA implements Test{
	// interface 는 implements 상속 
	
	// interface 를 쓰는 이유
	// 1) 이름을 단일화 할 수 있음 
	// 2) 내용 수정시 편리 
	
	@Override
	public void test() {
		System.out.println("test");
	}
	
}

public class Ex06 {
	
	public static void main(String[] args) {
		
		 Ex06Class e = new Ex06Class();
		 e.test();
	}
}
