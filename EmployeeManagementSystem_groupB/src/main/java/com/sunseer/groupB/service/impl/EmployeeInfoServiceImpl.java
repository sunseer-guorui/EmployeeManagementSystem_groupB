package com.sunseer.groupB.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sunseer.groupB.dao.EmployeeInfoDao;
import com.sunseer.groupB.pojo.EmployeeInfo;
import com.sunseer.groupB.service.EmployeeInfoService;

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	private EmployeeInfoDao employeeInfoDao;

	@Override
	public void AddEmployeeInfo(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<EmployeeInfo> FindEmployeeInfo(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void UpdateEmployeeInfo(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void DeleteEmployeeInfoById(int id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<EmployeeInfo> SortEmployeeInfo(String order, boolean asc) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


}
