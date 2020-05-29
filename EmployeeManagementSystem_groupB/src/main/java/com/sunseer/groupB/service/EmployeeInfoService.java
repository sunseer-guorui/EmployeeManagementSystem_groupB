package com.sunseer.groupB.service;

import java.util.List;

import com.sunseer.groupB.pojo.EmployeeInfo;
import com.sunseer.groupB.pojo.EmployeeInfoPhoto;


public interface EmployeeInfoService {
	void addUser(EmployeeInfo usersdata);
	public List<EmployeeInfoPhoto> FindEmployeeInfo(EmployeeInfoPhoto employeeInfo);
	public List<EmployeeInfoPhoto> FindEmployeeInfoAll();
	public void UpdateEmployeeInfo(EmployeeInfo employeeInfo);
	public void DeleteEmployeeInfoById(int id);
	public EmployeeInfoPhoto findUserById(Integer id);
	void modifyUser(EmployeeInfo users);
}
