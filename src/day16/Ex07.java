package day16;

class A지상군 {
	public void 지상군공격() {}
	public void 지상군공격합니다() {}
	public void 지상군공격할까요() {}
	public void 지상군공격해요() {
		System.out.println("지상군 공격"); }
	public void 지상군공격싫어요() {}
	public void 지상군공격합시다() {}
}

class B공군 {
	public void attack() {
		System.out.println("공군 공격");
	}
}

public class Ex07 {
	
	public static void main(String[] args) {
		
		A지상군 a = new A지상군();
		B공군 b = new B공군();
		
		b.attack();
	}
}
