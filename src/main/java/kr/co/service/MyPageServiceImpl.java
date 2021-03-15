package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.domain.MemberVO;
import kr.co.repository.MyPageDAO;
@Service
public class MyPageServiceImpl implements MyPageService{
	@Inject
	private MyPageDAO dao;
	@Override
	public List<MemberVO> updateUI(int mnum) {
		// TODO Auto-generated method stub
		return dao.updateUI(mnum);
	}
	@Override
	public void update(MemberVO vo) {
		// TODO Auto-generated method stub
		dao.update(vo);
	}

}
