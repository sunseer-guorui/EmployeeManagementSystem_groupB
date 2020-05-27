package com.sunseer.groupB.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunseer.groupB.pojo.EmployeeInfo;
import com.sunseer.groupB.pojo.Loginpass;
import com.sunseer.groupB.service.EmployeeInfoService;
import com.sunseer.groupB.service.LoginpassService;

@Controller
@RequestMapping("/groupB")
public class PageController {
	@Autowired
	private LoginpassService loginpassService;

	@Autowired
	private EmployeeInfoService employeeInfoService;

//	@RequestMapping("/{page}")
//	public String showpage(@PathVariable String page) {
//		return page;
//	}

	@GetMapping("/B0")
	public String goLogin() {
		return "/B0";
	}

	@PostMapping("/B0")
	public String LoginChack(Loginpass loginpass,Model model) {
		List<EmployeeInfo> list = null;
		try {
			if(this.loginpassService.FindLoginpass(loginpass)) {
				list = this.employeeInfoService.FindEmployeeInfoAll();
				model.addAttribute("list",list);

				return "newindex";
			}else {
				System.out.println("ログイン内容が正しくありません");
				return "B0";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("エラー");
			return "B0";
		}
	}

	@GetMapping("/newindex")
	public String ShowAllEmployee() {
		return "newindex";
	}
	
	//検索結果の表示
	@PostMapping(value = "/newindex",params = "search")
	public String SearchEmployee(@Valid @ModelAttribute("employeeInfo") EmployeeInfo employeeInfo
			,BindingResult bindingResult,Model model) {
		List<EmployeeInfo> list = null;
		try {
			list = this.employeeInfoService.FindEmployeeInfo(employeeInfo);
			model.addAttribute("list",list);
		}catch(Exception e) {
			e.printStackTrace();
			return "B0";
		}
		return "newindex";
	}
}
