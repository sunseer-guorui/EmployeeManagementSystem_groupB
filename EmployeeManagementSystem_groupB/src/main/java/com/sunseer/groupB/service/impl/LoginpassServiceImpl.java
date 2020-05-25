package com.sunseer.groupB.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunseer.groupB.dao.LoginpassDao;
import com.sunseer.groupB.pojo.Loginpass;
import com.sunseer.groupB.service.LoginpassService;

@Service
public class LoginpassServiceImpl implements LoginpassService {
	@Autowired
	private LoginpassDao loginpassDao;

	public boolean FindLoginpass(Loginpass loginpass) {
		return loginpassDao.SelectLoginpass(loginpass);
	}
}
