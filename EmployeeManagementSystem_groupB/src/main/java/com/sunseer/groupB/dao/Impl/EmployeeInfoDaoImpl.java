package com.sunseer.groupB.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sunseer.groupB.dao.EmployeeInfoDao;
import com.sunseer.groupB.pojo.EmployeeInfo;
import com.sunseer.groupB.pojo.EmployeeInfoPhoto;

@Repository
public class EmployeeInfoDaoImpl implements EmployeeInfoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	//データの追加
	@Override
	public void InsertEmployeeInfo(EmployeeInfo employeeInfo) {
		String sql = "insert into userdata(user_firstname,user_lastname,user_firstkata,user_lastkata,user_gender,"
				+ "depart_name,user_birth,user_tele,user_mail,user_address,user_education,user_special,user_image) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
//		System.out.println(employeeInfo.getUser_image().getOriginalFilename());
//		MultipartFile photo = employeeInfo.getUser_image();
		try {
			jdbcTemplate.update(sql,employeeInfo.getUser_firstname(),employeeInfo.getUser_lastname()
					,employeeInfo.getUser_firstkata(),employeeInfo.getUser_lastkata(),employeeInfo.getUser_gender(),employeeInfo.getDepart_name()
					,employeeInfo.getUser_birth(),employeeInfo.getUser_tele(),employeeInfo.getUser_mail(),employeeInfo.getUser_address()
					,employeeInfo.getUser_education(),employeeInfo.getUser_special(),employeeInfo.getUser_image());
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	//IDでデータの取得
	@Override
	public EmployeeInfoPhoto SelectEmployeeInfoId(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		String sql = "select * from userdata where user_id = ?";
//		EmployeeInfo users= new EmployeeInfo();
		Object[] arr = new Object[] {id};
		EmployeeInfoPhoto user= new EmployeeInfoPhoto();
		this.jdbcTemplate.query(sql, arr, new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_firstname(rs.getString("user_firstname"));
				user.setUser_lastname(rs.getString("user_lastname"));
				user.setUser_firstkata(rs.getString("user_firstkata"));
				user.setUser_lastkata(rs.getString("user_lastkata"));
				user.setUser_gender(rs.getString("user_gender"));
				user.setDepart_name(rs.getString("depart_name"));
				user.setUser_birth(rs.getString("user_birth"));
				user.setUser_tele(rs.getString("user_tele"));
				user.setUser_mail(rs.getString("user_mail"));
				user.setUser_address(rs.getString("user_address"));
				user.setUser_education(rs.getString("user_education"));
				user.setUser_special(rs.getString("user_special"));
				user.setUser_image(rs.getString("user_image"));
			}
		});
		return user;
	}

	//データの検索&取得
	@Override
	public List<EmployeeInfoPhoto> SelectEmployeeInfo(EmployeeInfoPhoto employeeInfo) {
		String sql = "select * from userdata " + employeeInfo.makeSearchSql();

		RowMapper<EmployeeInfoPhoto> rowMapper = new BeanPropertyRowMapper(EmployeeInfoPhoto.class);
		List<EmployeeInfoPhoto> results = jdbcTemplate.query(sql,rowMapper);
		return results;

	}

	//データの全件取得
	@Override
	public List<EmployeeInfoPhoto> SelectEmployeeInfoAll() {
		String sql = "select * from userdata";
		RowMapper<EmployeeInfoPhoto> rowMapper = new BeanPropertyRowMapper(EmployeeInfoPhoto.class);
		List<EmployeeInfoPhoto> results = jdbcTemplate.query(sql,rowMapper);
		return results;
	}

	//データの上書き
		@Override
		public void UpdateEmployeeInfo(EmployeeInfo employeeInfo) {
			// TODO 自動生成されたメソッド・スタブ
			String sql1 = "update userdata set user_firstname=?,user_lastname=?,user_firstkata=?,user_lastkata=?,user_gender=?,"
					+ "depart_name=?,user_birth=?,user_tele=?,user_mail=?,user_address=?,user_education=?,user_special=?,user_image=? where user_id = ?";
			String sql2 = "update userdata set user_firstname=?,user_lastname=?,user_firstkata=?,user_lastkata=?,user_gender=?,"
					+ "depart_name=?,user_birth=?,user_tele=?,user_mail=?,user_address=?,user_education=?,user_special=? where user_id = ?";
			System.out.println("image:"+employeeInfo.getUser_image());
//			this.jdbcTemplate.update(sql, users.getUser_firstname(),users.getUser_gender(), users.getUser_id());
			if(!employeeInfo.getUser_image().isEmpty()) {
				this.jdbcTemplate.update(sql1,employeeInfo.getUser_firstname(),employeeInfo.getUser_lastname(),
						employeeInfo.getUser_firstkata(),employeeInfo.getUser_lastkata(),employeeInfo.getUser_gender(),employeeInfo.getDepart_name(),
						employeeInfo.getUser_birth(),employeeInfo.getUser_tele(),employeeInfo.getUser_mail(),employeeInfo.getUser_address(),
						employeeInfo.getUser_education(),employeeInfo.getUser_special(),employeeInfo.getUser_image(),employeeInfo.getUser_id());
			}else {
				this.jdbcTemplate.update(sql2,employeeInfo.getUser_firstname(),employeeInfo.getUser_lastname(),
						employeeInfo.getUser_firstkata(),employeeInfo.getUser_lastkata(),employeeInfo.getUser_gender(),employeeInfo.getDepart_name(),
						employeeInfo.getUser_birth(),employeeInfo.getUser_tele(),employeeInfo.getUser_mail(),employeeInfo.getUser_address(),
						employeeInfo.getUser_education(),employeeInfo.getUser_special(),employeeInfo.getUser_id());
			}
		}

	//データの削除
	@Override
	public void DeleteEmployeeInfo(int user_id) {
		String sql = "delete from userdata where user_id = ?";
		jdbcTemplate.update(sql,Integer.toString(user_id));
	}

	//データの並び替え
	@Override
	public List<EmployeeInfo> SortEmployeeInfo(String row, boolean asc) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
