package day16;

interface ���� {
	public void attack();
	public void defense();
}

class AA���� implements ���� {
	
	public void �Ѿ�����() {
		System.out.println("�Ѿ�����"); }
	
	public void ����������() {
		System.out.println(); }

	public void attack() {
		�Ѿ�����();
		System.out.println("���� ����");
	}
	
	public void defense() {
		System.out.println("���� ����մϴ�");
	}
	
}

class BB���� implements ���� {

	public void attack() {
		System.out.println("������ ���� �մϴ�");
	}

	public void defense() {
		System.out.println("���� ����մϴ�");	
	}
	
}

class AB {
	public void printAttack(���� aa) {
		aa.attack();
	}
	/*
	 'AA����'�̳� 'BB����'�̳� '����'�̶�� �θ� ������ ������ 
	 �Ѱ����� ���¸� ���� �޼ҵ�� �޴� ���� ������ 
	 
	public void printAttack(BB���� aa) {
		aa.attack();
	} */
}

public class Ex08 {
	
	public static void main(String[] args) {
		
		���� a = new AA����();
		a.attack();
		
		AB ab = new AB();
		AA���� aa = new AA����();
		ab.printAttack( aa );
	
		ab.printAttack( new BB����() );
	}
}








