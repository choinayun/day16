package day16;

class AAAA{
	public void aaa() {
		
	}
}

class Ex06Class extends AAAA implements Test{
	// interface �� implements ��� 
	
	// interface �� ���� ����
	// 1) �̸��� ����ȭ �� �� ���� 
	// 2) ���� ������ �� 
	
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
