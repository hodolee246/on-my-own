package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/member/*")
public class MemberController {

	@GetMapping(value = "/login")
	public ModelAndView login() {
		log.info("test");
		ModelAndView loginMav = new ModelAndView();
		
		return loginMav;
	}
	
	
}
