package kr.co.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.media.jfxmedia.logging.Logger;

import kr.co.domain.MemberVO;
import kr.co.service.MemberService;

@Controller
public class MemberController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService memberService;
	
	@RequestMapping("member/list.do")
	public String memberList(Model model) {
		List<MemberVO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}
	
	@RequestMapping("member/write.do")
	public String memberWrite() {
		
		return "member/member_write";
	}
	
	@RequestMapping("member/insert.do")
	public String memberInsert(@ModelAttribute MemberVO vo) {
		memberService.insertMember(vo);
		return "redirect:/member/list.do";
	}
	
	@RequestMapping("member/view.do")
	public String memberView(String userId, Model model) {
		
		model.addAttribute("dto",memberService.ViewMember(userId));
		
		logger.info("클릭한 아이디 : " +userId);
		
		return "member/member_view";
	}
}
