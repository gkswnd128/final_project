package kh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.FeedDAO;

@Controller
@RequestMapping("/feed/")
public class FeedController {

	@Autowired
	private FeedDAO dao;
	
	@RequestMapping("goFeed")
	public String goFeed() {
		
		System.out.println("12341234");
		
		return "/feed/feedMain";
	}
	@RequestMapping("detailView")
	public String detailView() {
		return "/feed/detailView";
	}
	
	@RequestMapping("goFeedWrite")
	public String goFeedWrite() {
		return "/feed/feedWrite";
	}
	
	
	@ExceptionHandler //예외 공동 처리
	public String exceptionHandler(Exception e) {//NumberFormatException.class, SQLException.class
		e.printStackTrace();
		return "error";
	}
}


