package quize;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

class time {
	
	public Date date;
	public SimpleDateFormat simpl;
	
	public void timefunc() {
		
		simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
		String s = simpl.format(date);
		
		JFrame frame = new JFrame();
		Container c = frame.getContentPane(); 
		JLabel label = new JLabel();
		label.setText(s);
		
		Font font = new Font(null, Font.BOLD, 32);  
		label.setFont(font); 
		label.setHorizontalAlignment(JLabel.CENTER); // �������
		
		c.add(label);
		
		frame.setLocation(1000, 200); // ��ġ ����
		frame.setPreferredSize(new Dimension(500,200)); // ������ ����
		frame.pack(); // ������ ���� 
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class login {
	
	public void logfunc() {
		
		int num;
		String id = null, pw, sid, spw ;
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		
		System.out.println("1. �α��� 2. �� �� 3. �α׾ƿ�");
		System.out.println(">>>");
		num = input.nextInt();
		
		if(num == 3) {
			System.exit(1);
		}else if (num == 2) {
			System.out.println("���̵� �Է�");
			id = input.next();
			System.out.println("��й�ȣ �Է�");
			pw = input.next();
			
			System.out.println("ȸ������ �Ϸ�");
		
		}else if (num == 1) {
			System.out.println("���̵� �Է�");
			sid = input.next();
			System.out.println("��й�ȣ �Է�");
			spw = input.next();
			
			if( spw != map.get(id) && sid != id) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("���� ���");
			}
		}	
			
	}	
}


class func {

	public void otherfunc() {
		
		int num2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("==== ȯ �� �� �� �� ====");
		System.out.println("1. �� ��");
		System.out.println("2. off");
		System.out.println("�Է� >>>>");
		num2 = input.nextInt();
		
		if(num2 == 2) {
			
		}
		
	}
}


public class TimeQuize01 {

	public static void main(String[] args) {

		login l = new login();
		
		
	}
}
