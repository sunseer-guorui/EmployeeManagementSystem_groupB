package com.sunseer.groupB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunseer.groupB.dao.EmployeeInfoDao;
import com.sunseer.groupB.pojo.EmployeeInfo;
import com.sunseer.groupB.pojo.EmployeeInfoPhoto;
import com.sunseer.groupB.service.EmployeeInfoService;

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	@Autowired
	private EmployeeInfoDao employeeInfoDao;

	@Override
	public List<EmployeeInfoPhoto> FindEmployeeInfo(EmployeeInfoPhoto employeeInfo) {
		return employeeInfoDao.SelectEmployeeInfo(employeeInfo);
	}

	@Override
	public List<EmployeeInfoPhoto> FindEmployeeInfoAll() {
		return employeeInfoDao.SelectEmployeeInfoAll();
	}

	@Override
	public void UpdateEmployeeInfo(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void DeleteEmployeeInfoById(int id) {
		employeeInfoDao.DeleteEmployeeInfo(id);
	}

	@Override
	public EmployeeInfoPhoto findUserById(Integer id) {
		return this.employeeInfoDao.SelectEmployeeInfoId(id);
	}

	@Override
	public void modifyUser(EmployeeInfo users) {
		this.employeeInfoDao.UpdateEmployeeInfo(users);
	}

	@Override
	public void addUser(EmployeeInfo usersdata) {
		this.employeeInfoDao.InsertEmployeeInfo(usersdata);
	}

}
