package day16;

// Overriding
// 상속 받은 경우에만 사용 가능 
// 상속받은 자식을 부모의 메소드와 동일하게 만드는 것
// 부모의 메소드가 실행되는게 아니라 자식의 메소드가 실행 되는 것 
// 조건 : 부모 메소드와 형식이 같아야 한다 
//		*부모와 형식의 범위가 같거나 커야 오버라이딩 가능
// 		*public > protected > private


class Ferrai {
	
	private int ye;
	
	public Ferrai(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "년씩 페라리 속도 300km");
	}
	
}

class NewFerrai extends Ferrai {
	
	 public NewFerrai(int y) {
		 super(y);
	 }
	 public void autoSystem() {
		 System.out.println("자동 운전 모드 시작합니다");
	 }
	 public void speed() { // 오버라이딩 
		 // 메소드의 내용이 조금 변동 될 때 사용한다 
		 // 자동으로 추가 가능하다 
		 System.out.println(super.getYe() + "년식 페라리 속도 400km");
	 }
}

public class Ex01 {

	public static void main(String[] args) {
		
		NewFerrai f = new NewFerrai(2023);
		
		f.speed();
		f.autoSystem();
			
	}
}
