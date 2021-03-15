package kr.co.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	SqlSession sqlSession;

	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO viewMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO viewMember(String userId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.viewMember", userId);
	}
 	
	
}
