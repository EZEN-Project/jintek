package kr.co.repository;

import java.util.List;

import kr.co.domain.MemberVO;

public interface MemberDAO {

	public List<MemberVO> memberList();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO viewMember();
	
	public void deleteMember(String userId);
	
	public void updateMember(MemberVO vo);

	MemberVO viewMember(String userId);
}
