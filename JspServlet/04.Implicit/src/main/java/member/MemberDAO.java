package member;

public class MemberDAO {
	
	public boolean isLogin(String id, String pw) {
		if("user".equals(id)&& "user1234".equals(pw)) {
			return true;
		}else {
			return false;
		}
		
	}
}
