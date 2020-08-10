package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//회원가입 페이지 이동
	@RequestMapping(value="join", method=RequestMethod.GET)
	public void loginGET() {
		
		logger.info("회원가입 페이지 진입");
		
	}
	
	//로그인 페이지 이동
	@RequestMapping(value="login", method = RequestMethod.GET)
	public void joinGET() {
		
		logger.info("로그인 페이지 진입");
		
	}
	
}
