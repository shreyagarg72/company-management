package org.ncu.company_manage.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.company_manage.api.Project;
import org.ncu.company_manage.api.User;

import org.springframework.jdbc.core.RowMapper;

public class ProjectRowMapper implements RowMapper<Project>{

	@Override
	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Project p = new Project();
		p.setP_id(rs.getInt("p_id"));
		p.setP_name(rs.getString("p_name"));
		p.setP_reporter(rs.getString("p_reporter"));
		p.setAssignee(rs.getString("assignee"));
		p.setP_progress(rs.getString("p_progress"));
		p.setP_priority(rs.getString("p_priority"));
		p.setP_level(rs.getString("p_level"));
		p.setP_comment(rs.getString("p_comment"));
		return p;
	}

}
