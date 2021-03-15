package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.domain.MemberVO;
import kr.co.repository.MemberDAOImpl;
@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	MemberDAOImpl memberDao;
	
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return memberDao.memberList();
	}

	@Override
	public void insertMember(MemberVO vo) {
		
		memberDao.insertMember(vo);
	}

	@Override
	public MemberVO ViewMember(String userId) {
		// TODO Auto-generated method stub
		return memberDao.viewMember(userId);
	}
	
	@Override
	public void deleteMember(String userId) {
		
		memberDao.deleteMember(userId);
	}
	
	@Override 
	public void updateMember(MemberVO vo) {

		memberDao.updateMember(vo);
	}
	
	
}
