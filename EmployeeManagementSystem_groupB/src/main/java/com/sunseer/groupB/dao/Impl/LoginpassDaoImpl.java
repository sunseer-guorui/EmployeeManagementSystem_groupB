package com.sunseer.groupB.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
		String sql = "select * from userdataauthor where author_mail=?";
		RowMapper<Loginpass> rowMapper = new BeanPropertyRowMapper<Loginpass>(Loginpass.class);
		//条件にあう列数(0か1)が代入される
		Loginpass matchLoginpass = jdbcTemplate.queryForObject
				(sql, rowMapper,loginpass.getAuthor_mail());
		System.out.println(loginpass.equals(matchLoginpass));
		return loginpass.equals(matchLoginpass);
	}

}
