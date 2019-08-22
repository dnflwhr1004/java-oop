package com.bitcamp.Service;
import com.bitcamp.Domains.MemberBean;
/**
요구사랑 (기능정의)
<사용자 기능>
1. 회원가입 
2. 마이페이지에서 회원가입 정보확인
3. 비밀번호를 수정할 수 있게
4. 회원탈퇴 
**************
<관리자 기능>
5. 회원목록 
6. 아이디 검색
*/
public class MemberService {
	private MemberBean[] members; // 객체배열 , 멤버변수는 초기화하지 않는다. // 생성자에 의해 초기화 된다.
	private int count;
	
	public MemberService() {
		members = new MemberBean[10];
		count = 0;
	}
	
	/**
	 1. 회원가입	
	 */
	 
	public String join(MemberBean param) {
		String msg = "회원가입 성공!";
		members[count] = param;
		count++;
		return msg;
	}
	
	/**
	 2. 마이페이지
	 */
	public String getMyPage(MemberBean param) {
		
		return param.toString();
	}
	
	/**
	 3. 비밀번호를 수정 
	 */
	
	public String changePassWord(MemberBean param) {
		String msg = "비밀번호 변경완료!";
		return msg;
	}
	
	/**
	 4. 회원탈퇴 
	 */
	
	public String withDrawal(MemberBean param) {
		String msg = "회원탈퇴 완료!";
		return msg;
	}
	
	/**
	 5. 회원목록  
	 */
	
	public String list() {
		String msg = "";
		for(int i = 0; i < count; i++) {
			msg += members[i].toString() + ", \n";
		}
		return msg;
	}
	
	/**
	 6. 아이디 검색   
	 */
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i = 0; i < count; i++) {
			if(id.equals(members[i].getId())) {
				member = members[i];
			}
		}
		return member;
	}
}