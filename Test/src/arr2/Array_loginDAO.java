package arr2;


public class Array_loginDAO {

	String[] id = { "pkr0957", "it", "ddangkong" };
	String[] pw = { "qkr140502", "bank", "qkr149592" };

	public String login(Array_loginDTO dto) {
		String result="";
		for (int i = 0; i < id.length; i++) {
			if (dto.getId_input().equals(id[i]) && dto.getPw_input().equals(pw[i])) {
				result = "로그인 성공";
				break;
			} else {result ="로그인 실패";}
		}
		return result;
	}
}