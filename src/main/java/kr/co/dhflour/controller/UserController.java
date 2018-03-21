package kr.co.dhflour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/* request mapping (type + method) (제일추천)*/

@Controller
@RequestMapping("/user")
public class UserController {
	
	@ResponseBody
	@RequestMapping("/joinform")
	public String joinForm() {
		return "UserController:joinForm()";
	}
	
	@ResponseBody
	@RequestMapping("/join")
	public String join() {
		return "UserController:join()";
	}
	
	/* Request Mapping의 value는 같지만 get과 post가 들어왔을 때  login메서드를 오바로드해서 사용한다.*/
	@RequestMapping( value="/login", method=RequestMethod.GET)
	public String login() {
		return "/WEB-INF/views/login.jsp";
	}
	
	@ResponseBody
	@RequestMapping( value="/login", method=RequestMethod.POST)
//	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
	public String login(@ModelAttribute UserVo vo) {  //jsp의 넘기는 form의 name과 VO의 정의를 일치시키면 이와같이 사용가능
		System.out.println(vo);
		
		return "UserController:login()";
	}
}
