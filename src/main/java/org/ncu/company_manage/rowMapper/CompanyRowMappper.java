package org.ncu.company_manage.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.company_manage.api.User;

import org.springframework.jdbc.core.RowMapper;

public class CompanyRowMappper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User u = new User();
		u.setUserid(rs.getInt("userid"));
		u.setUsername(rs.getString("username"));
		u.setU_city(rs.getString("u_city"));
		u.setU_gender(rs.getString("u_gender"));
		u.setUserpass(rs.getString("userpass"));
		return u;
	}

}
