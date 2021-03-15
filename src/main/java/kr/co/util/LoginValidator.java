package kr.co.util;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import kr.co.domain.MemberVO;

public class LoginValidator implements Validator{ //로그인시 아이디ㅡ비밀번호 검증해서  오류메시지를 출출
	
	public boolean supports(Class<?>clazz) {
		return MemberVO.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object command, Errors errors) {
		
		MemberVO member = (MemberVO) command;
		if(!StringUtils.hasLength(member.getId())) {
			errors.rejectValue("memberId", "error.required");
		}
		
		if(!StringUtils.hasLength(member.getPw())){
			errors.rejectValue("password", "error.required");
		}
	
		if(errors.hasErrors()) {
			errors.reject("error.input.member");
		}
	}
}