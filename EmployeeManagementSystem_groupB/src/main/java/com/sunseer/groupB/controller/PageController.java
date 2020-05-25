package com.sunseer.groupB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunseer.groupB.pojo.Loginpass;
import com.sunseer.groupB.service.LoginpassService;

@Controller
@RequestMapping("/groupB")
public class PageController {
	@Autowired
	private LoginpassService loginpassService;

	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}

	@PostMapping("/B0")
	public String LoginChack(Loginpass loginpass) {
		try {
			if(this.loginpassService.FindLoginpass(loginpass)) {
				return "newindex";
			}else {
				return "B0";
			}
		}
		catch(Exception e) {
			return "B0";
		}
	}
}
