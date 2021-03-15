package kr.co.controller;



import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.domain.MemberVO;

import kr.co.service.MyPageService;

@Controller
public class MyPageController {

	public class MemberController {

		@Inject
		private MyPageService service;
	
		@RequestMapping(value = "/update", method = RequestMethod.GET)
		public String update(Model model,int mnum) {
			List<MemberVO> vo = service.updateUI(mnum);
			model.addAttribute("vo", vo);
			System.out.println(vo);
	
			return "/update";
		}
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String update(MemberVO vo) {
			service.update(vo);
			

			return "redirect:/mypage/mypage";
		}
		

	}

}