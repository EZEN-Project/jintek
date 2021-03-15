package kr.co.service;

import java.util.List;

import kr.co.domain.MemberVO;

public interface MemberService {
	public List<MemberVO> memberList();

	public void insertMember(MemberVO vo);

	public Object ViewMember(String userId);

	void deleteMember(String userId);

	void updateMember(MemberVO vo);
}
