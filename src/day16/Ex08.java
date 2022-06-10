package day16;

interface 공방 {
	public void attack();
	public void defense();
}

class AA지상군 implements 공방 {
	
	public void 총알장전() {
		System.out.println("총알장전"); }
	
	public void 전진앞으로() {
		System.out.println(); }

	public void attack() {
		총알장전();
		System.out.println("공격 개시");
	}
	
	public void defense() {
		System.out.println("지상군 방어합니다");
	}
	
}

class BB공군 implements 공방 {

	public void attack() {
		System.out.println("공군이 공격 합니다");
	}

	public void defense() {
		System.out.println("공군 방어합니다");	
	}
	
}

class AB {
	public void printAttack(공방 aa) {
		aa.attack();
	}
	/*
	 'AA지상군'이나 'BB공군'이나 '공방'이라는 부모를 가지고 있으니 
	 한가지의 형태를 가진 메소드로 받는 것이 가능함 
	 
	public void printAttack(BB공군 aa) {
		aa.attack();
	} */
}

public class Ex08 {
	
	public static void main(String[] args) {
		
		공방 a = new AA지상군();
		a.attack();
		
		AB ab = new AB();
		AA지상군 aa = new AA지상군();
		ab.printAttack( aa );
	
		ab.printAttack( new BB공군() );
	}
}









