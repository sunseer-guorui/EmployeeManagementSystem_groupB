package com.sunseer.groupB.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
		String sql = "insert into userdata(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,employeeInfo.getUser_id(),employeeInfo.getUser_firstname(),employeeInfo.getUser_lastname()
				,employeeInfo.getUser_firstkata(),employeeInfo.getUser_lastkata(),employeeInfo.getUser_gender(),employeeInfo.getDepart_name()
				,employeeInfo.getUser_birth(),employeeInfo.getUser_tele(),employeeInfo.getUser_mail(),employeeInfo.getUser_address()
				,employeeInfo.getUser_Educational(),employeeInfo.getUser_special(),employeeInfo.getUser_image());
	}

	//データの検索&取得
	@Override
	public List<EmployeeInfo> SelectEmployeeInfo(EmployeeInfo employee) {
		return null;

	}

	//データの全件取得
	public List<EmployeeInfo> SelectEmployeeInfoAll() {
		String sql = "select * from userdata";
		RowMapper<EmployeeInfo> rowMapper = new BeanPropertyRowMapper(EmployeeInfo.class);
		List<EmployeeInfo> eis = jdbcTemplate.query(sql,rowMapper);
		return eis;
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
