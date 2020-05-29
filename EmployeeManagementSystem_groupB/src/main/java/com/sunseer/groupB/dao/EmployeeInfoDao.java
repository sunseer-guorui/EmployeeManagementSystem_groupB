package com.sunseer.groupB.dao;

import java.util.List;

import com.sunseer.groupB.pojo.EmployeeInfo;
import com.sunseer.groupB.pojo.EmployeeInfoPhoto;

public interface EmployeeInfoDao {
	public void InsertEmployeeInfo(EmployeeInfo employeeInfo);
	public EmployeeInfoPhoto SelectEmployeeInfoId(Integer id);
	public List<EmployeeInfoPhoto> SelectEmployeeInfo(EmployeeInfoPhoto employee);
	public List<EmployeeInfoPhoto> SelectEmployeeInfoAll();
	public void UpdateEmployeeInfo(EmployeeInfo employeeInfo);
	public void DeleteEmployeeInfo(int user_id);
	public List<EmployeeInfo> SortEmployeeInfo(String row,boolean asc);
}
