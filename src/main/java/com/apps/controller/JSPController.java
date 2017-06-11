package com.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	
	@RequestMapping("/index")
	public String renderIndexPage(){
		return "index";
	}
}
