package quize;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

class time {
	
	public Date date;
	public SimpleDateFormat simpl;
	
	public void timefunc() {
		
		simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		String s = simpl.format(date);
		
		JFrame frame = new JFrame();
		Container c = frame.getContentPane(); 
		JLabel label = new JLabel();
		label.setText(s);
		
		Font font = new Font(null, Font.BOLD, 32);  
		label.setFont(font); 
		label.setHorizontalAlignment(JLabel.CENTER); // 가운데정렬
		
		c.add(label);
		
		frame.setLocation(1000, 200); // 위치 지정
		frame.setPreferredSize(new Dimension(500,200)); // 사이즈 지정
		frame.pack(); // 설정값 적용 
		
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
		
		System.out.println("1. 로그인 2. 가 입 3. 로그아웃");
		System.out.println(">>>");
		num = input.nextInt();
		
		if(num == 3) {
			System.exit(1);
		}else if (num == 2) {
			System.out.println("아이디 입력");
			id = input.next();
			System.out.println("비밀번호 입력");
			pw = input.next();
			
			System.out.println("회원가입 완료");
		
		}else if (num == 1) {
			System.out.println("아이디 입력");
			sid = input.next();
			System.out.println("비밀번호 입력");
			spw = input.next();
			
			if( spw != map.get(id) && sid != id) {
				System.out.println("로그인 실패");
			}else {
				System.out.println("인증 통과");
			}
		}	
			
	}	
}


class func {

	public void otherfunc() {
		
		int num2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("==== 환 영 합 니 다 ====");
		System.out.println("1. 기 능");
		System.out.println("2. off");
		System.out.println("입력 >>>>");
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
