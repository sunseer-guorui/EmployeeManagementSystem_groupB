package com.sunseer.groupB.dao;

import java.util.List;

import com.sunseer.groupB.pojo.EmployeeInfo;

public interface EmployeeInfoDao {
	public void InsertEmployeeInfo(EmployeeInfo employeeInfo);
	public List<EmployeeInfo> SelectEmployeeInfo(EmployeeInfo employee);
	public List<EmployeeInfo> SelectEmployeeInfoAll (EmployeeInfo employeeInfo);
	public void UpdateEmployeeInfo(EmployeeInfo employeeInfo);
	public void DeleteEmployeeInfo(EmployeeInfo employeeInfo);
	public List<EmployeeInfo> SortEmployeeInfo(String row,boolean asc);
}
