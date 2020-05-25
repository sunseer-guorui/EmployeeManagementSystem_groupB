package com.sunseer.groupB.service;

import java.util.List;

import com.sunseer.groupB.pojo.EmployeeInfo;

public interface EmployeeInfoService {
	public void AddEmployeeInfo(EmployeeInfo employeeInfo);
	public List<EmployeeInfo> FindEmployeeInfo(EmployeeInfo employeeInfo);
	public void UpdateEmployeeInfo(EmployeeInfo employeeInfo);
	public void DeleteEmployeeInfoById(int id);
	public List<EmployeeInfo> SortEmployeeInfo(String order,boolean asc);
}
