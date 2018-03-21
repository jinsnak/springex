package kr.co.dhflour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	/* request maipping (method 단독 맵핑) */
	//1. 단독맵핑
	@ResponseBody
	@RequestMapping("/main")
	public String main() {
		return "MainController:main()";
	}
	
	//2. depth 가능
	@ResponseBody
	@RequestMapping("/main2/a/b/c/d")
	public String main2() {
		return "MainController:main2()";
	}
	
	//2개 이상 가능
	@ResponseBody
	@RequestMapping( {"/main3", "/m3" } )
	public String main3() {
		return "MainController:main3()";
	}
	
	
}
