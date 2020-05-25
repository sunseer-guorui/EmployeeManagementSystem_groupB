package com.sunseer.groupB.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunseer.groupB.dao.EmployeeInfoDao;
import com.sunseer.groupB.pojo.EmployeeInfo;

@Repository
public class EmployeeInfoDaoImpl implements EmployeeInfoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	//データの追加
	@Override
	public void InsertEmployeeInfo(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	//データの検索
	@Override
	public List<EmployeeInfo> SelectEmployeeInfo(EmployeeInfo employee) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	//全データの取得
	@Override
	public List<EmployeeInfo> SelectEmployeeInfoAll(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	//データの上書き
	@Override
	public void UpdateEmployeeInfo(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//データの削除
	@Override
	public void DeleteEmployeeInfo(EmployeeInfo employeeInfo) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//データの並び替え
	@Override
	public List<EmployeeInfo> SortEmployeeInfo(String row, boolean asc) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
