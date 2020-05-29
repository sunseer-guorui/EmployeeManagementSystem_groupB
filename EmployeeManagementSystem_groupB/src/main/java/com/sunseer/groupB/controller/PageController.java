package com.sunseer.groupB.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunseer.groupB.pojo.EmployeeInfo;
import com.sunseer.groupB.pojo.EmployeeInfoPhoto;
import com.sunseer.groupB.pojo.Loginpass;
import com.sunseer.groupB.service.EmployeeInfoService;
import com.sunseer.groupB.service.LoginpassService;

@Controller
@RequestMapping("/user")
public class PageController {
	@Autowired
	private LoginpassService loginpassService;

	@Autowired
	private EmployeeInfoService employeeInfoService;

	@Value("${file.upload.path}")
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
		List<EmployeeInfoPhoto> list = null;
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

	@GetMapping("/BNM01")
	public String NewEmployee() {
		return "BNM01";
	}

	@PostMapping("/BNM01")
	public String ChackInfo(EmployeeInfo usersdata, Model model) {
		try {
			model.addAttribute("usersdata",usersdata);
//			this.employeeInfoService.addUser(usersdata);
//			user_image.transferTo(new File("C:\\Users\\2015NEC21\\Downloads\\" + useruser_image.getOriginalFilename()));
		}catch(Exception e){
			e.printStackTrace();
			return "newindex";
		}
		return "BNM02";
	}

	@PostMapping("/BNM02")
	public String showInfo(@ModelAttribute("e") EmployeeInfo e,Model model) {
		List<EmployeeInfoPhoto> list = null;
		try {
//			model.addAttribute("usersdata",usersdata);
			this.employeeInfoService.addUser(e);
			list = this.employeeInfoService.FindEmployeeInfoAll();
			model.addAttribute("list",list);
//			user_image.transferTo(new File("C:\\Users\\2015NEC21\\Downloads\\" + useruser_image.getOriginalFilename()));
		}catch(Exception error){
			error.printStackTrace();
			return "BNM01";
		}
		return "newindex";
	}


	//GetMappingで社員一覧ページへ移動したときは社員一覧を表示する
	@GetMapping("/newindex")
	public String backEmployees(Model model) {
		List<EmployeeInfoPhoto> list = null;
		list = this.employeeInfoService.FindEmployeeInfoAll();
		model.addAttribute("list",list);
		return "newindex";
	}

	@GetMapping("/preUpdateUser")
	public String preUpdateUser(Integer id, Model model) {

		try {
			EmployeeInfoPhoto user = this.employeeInfoService.findUserById(id);
//System.out.println(user.getUser_id());
			EmployeeInfo users = new EmployeeInfo();
			users.setUser_id(user.getUser_id());
			users.setUser_firstname(user.getUser_firstname());
			users.setUser_lastname(user.getUser_lastname());
			users.setUser_firstkata(user.getUser_firstkata());
			users.setUser_lastkata(user.getUser_lastkata());
			users.setUser_gender(user.getUser_gender());
			users.setDepart_name(user.getDepart_name());
			users.setUser_birth(user.getUser_birth());
			users.setUser_tele(user.getUser_tele());
			users.setUser_mail(user.getUser_mail());
			users.setUser_address(user.getUser_address());
			users.setUser_education(user.getUser_education());
			users.setUser_special(user.getUser_special());
//System.out.println(users.getUser_id());

			model.addAttribute("user", users);

		}catch(Exception e){
			e.printStackTrace();
			return "newindex";
		}
		return "BME01";
	}

	@PostMapping("/BME01")
	public String updateUser(EmployeeInfo user,Model model) {

		try {
//			System.out.println("ssss");
			this.employeeInfoService.modifyUser(user);
			model.addAttribute("usersdata",user);
		}catch(Exception e){
			e.printStackTrace();
			return "newindex";
		}
		return "BME02";
	}

	@GetMapping("/BME03")
	public String chackUserdata() {
		return "BME03";
	}

	//検索結果の表示
	@PostMapping(value = "/newindex",params = "search")
	public String SearchEmployee(@Valid @ModelAttribute("employeeInfo") EmployeeInfoPhoto employeeInfo
			,BindingResult bindingResult,Model model) {
		List<EmployeeInfoPhoto> list = null;
		try {
			list = this.employeeInfoService.FindEmployeeInfo(employeeInfo);
			model.addAttribute("list",list);
		}catch(Exception e) {
			e.printStackTrace();
			return "newindex";
		}
		return "newindex";
	}

	//社員情報の削除
	@PostMapping(value = "/newindex",params= "delete")
	public String DeleteEmployee(@RequestParam("id")Integer id,Model model) {
		List<EmployeeInfoPhoto> list = null;
		try {
			this.employeeInfoService.DeleteEmployeeInfoById(id);
			list = this.employeeInfoService.FindEmployeeInfoAll();
			model.addAttribute("list",list);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "newindex";
	}

}
