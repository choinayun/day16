package day16;

import java.util.Scanner;

interface Test01 {
	public static final String NAME = "홍길동";
	public String N = "aaa";
	// interface 에서 변수를 만들 땐 
	// 무조건 static final 이 들어와야 한다 (생략가능) 
	// 그리고 변수는 만들자마자 바로 값 초기화 (변수 이름은 대문자)
}

public class Ex10 {
	
	public static void main(String[] args) {
		
		System.out.println( Test01.NAME );
		
		// 업캐스팅해서 문제풀이 
		
		공방 u;
		
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1. 지상군 2. 공군");
		
		int choice = 0, num;
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if(num == 1) {
			u = new AA지상군();
			System.out.println("지상군을 선택하셨습니다");
		}else {
			u = new BB공군();
			System.out.println("공군을 선택하셨습니다");
		}
		
		System.out.println("1. 공격 2. 방어");
		choice = input.nextInt();
		
		if(choice == 1) u.attack();
		if(choice == 2) u.defense();
		
	}
}
