package com.chris.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class CodeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping(value="/guess", method=RequestMethod.POST)
	public String guess(@RequestParam(value="guess") String guess,
			RedirectAttributes redirectAttributes) {
		if(guess.equals("bushido")) {
			return "redirect:/code";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	@RequestMapping("/code")
	public String guess() {
		return "code.jsp";
	}
	
}
