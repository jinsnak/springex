package kr.co.dhflour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* request mapping (type 단독맵핑) */

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController:list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String insert() {
		return "GuestbookController:insert()";
	}
}
