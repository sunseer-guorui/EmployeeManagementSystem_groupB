package com.sunseer.groupB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.sunseer.groupB.pojo.Loginpass;
import com.sunseer.groupB.service.LoginpassService;

@Controller
public class PageController {
	@Autowired
	private LoginpassService loginpassService;

	@PostMapping("/B0")
	public String Login(Loginpass loginpass) {
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
