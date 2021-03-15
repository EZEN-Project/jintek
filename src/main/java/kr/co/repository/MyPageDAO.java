package kr.co.repository;

import java.util.List;

import kr.co.domain.MemberVO;

public interface MyPageDAO {
	List<MemberVO> updateUI(int mnum);
	public void update(MemberVO vo);
}
