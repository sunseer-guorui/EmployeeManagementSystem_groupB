package com.sunseer.groupB.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunseer.groupB.dao.LoginpassDao;
import com.sunseer.groupB.pojo.Loginpass;

//メールアドレス、パスワードと合致するデータがある場合、trueを返す
@Repository
public class LoginpassDaoImpl implements LoginpassDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean SelectLoginpass(Loginpass loginpass) {
		String sql = "select case when author_mail=? and author_password=? "
				+ "then 'true' else 'false end from UserDataAuthor";
		//条件にあう列数(0か1)が代入される
		int coincidence = this.jdbcTemplate.update(sql,loginpass.getMailAdress(),loginpass.getPassword());
		if(coincidence >0) {
			return true;
		}else {
			return false;
		}
	}

}
