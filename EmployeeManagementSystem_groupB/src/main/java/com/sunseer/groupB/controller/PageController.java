package com.sunseer.groupB.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.sunseer.groupB.pojo.Loginpass;
import com.sunseer.groupB.service.LoginpassService;

@Controller
public class PageController {

	private LoginpassService loginpassService;

	@PostMapping("/B0")
	public String Login(Loginpass loginpass) {
		try {
			if(this.loginpassService.FindLoginpass(loginpass)) {
				return "";
			}else {
				return "";
			}
		}
		catch(IOException e) {
			return "";
		}
	}
}
