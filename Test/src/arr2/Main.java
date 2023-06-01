package arr2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Array_loginDAO dao = new Array_loginDAO();
		Array_loginDTO dto = new Array_loginDTO();
		// String id;
		// String pw;
		
		String id = "", pw ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		 id = sc.next();
//		dto.id_input = sc.next(); 
		
		System.out.print("비밀번호 : ");
		 pw = sc.next();
//		dto.setId_input(pw) = sc.nextLine();
		
		
		dto.setId_input(id);
		dto.setPw_input(pw);	
		
		String result = dao.login(dto);	
		System.out.println(result);
	}

}