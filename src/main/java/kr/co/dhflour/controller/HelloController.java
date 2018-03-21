package kr.co.dhflour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//1.ModelAndView를 생성하여 Model과 View를 담아서 전달
	@RequestMapping( "/hello2" )
	public ModelAndView hello( @RequestParam("n") String name ) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject( "name", name );
		mav.setViewName( "/WEB-INF/views/hello.jsp" );
		
		return mav;
	}

	//2. Model을 파라미터로 받아 그 안에 값을 넣고 view 경로를 return한다. (이 방법을 선호)
	@RequestMapping( { "/hello", "/hi" } )
	public String hello(@RequestParam("n") String name, Model model) {
		
		model.addAttribute("name", name);
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	//redirect 방식
	@RequestMapping("hello3")
	public String hello3() {
		
		return "redirect:/hello?n=redirectPage";
	}
	
	
	@ResponseBody //View가 아닌 직접 response body에 쓰겠다.
	@RequestMapping("hello4")
	public String hello4() {
		
		return "Hello withoutJSP";
	}
}
