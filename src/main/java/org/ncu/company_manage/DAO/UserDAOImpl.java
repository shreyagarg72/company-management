package org.ncu.company_manage.DAO;

import java.util.List;

import org.ncu.company_manage.api.Project;
import org.ncu.company_manage.api.User;
import org.ncu.company_manage.rowMapper.CompanyRowMappper;
import org.ncu.company_manage.rowMapper.ProjectRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveUser(User user) {
		Object[] sqlParameters = { user.getUserid(), user.getUsername(), user.getU_city(), user.getU_gender(),
				user.getUserpass() };
		// get all the variety data types
		String sql = "insert into user(userid,username,u_city,u_gender,userpass) values(?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);
		System.out.println("record updated");

	}

	@Override
	public boolean validateUser(String username, String userpass) {
		// TODO Auto-generated method stub
		int count = jdbcTemplate.queryForObject("select count(*) from user where username=? and userpass=?",
				Integer.class, username, userpass);
		if (count == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean validateAdmin(String adminname, String adminpass) {
		int count = jdbcTemplate.queryForObject("select count(*) from admin where adminname=? and adminpass=?",
				Integer.class, adminname, adminpass);
		if (count == 1)
			return true;
		else
			return false;
	}

	@Override
	public List<User> loadUsers() {
		// TODO Auto-generated method stub
//		List<Student> studentList = new ArrayList<Student>();
//		
		String sql = "select * from user";

		List<User> theListOfUser = jdbcTemplate.query(sql, new CompanyRowMappper());

		return theListOfUser;
	}

	@Override
	public User getUser(int userid) {
		String sql = "SELECT * FROM user where userid=?";
		User user = jdbcTemplate.queryForObject(sql, new CompanyRowMappper(), userid);
		return user;
	}

	@Override
	public int updateUser(User user) {
		String sql = "update user set username=?,u_city=?,u_gender=?,userpass=?  where userid=?";
		Object[] sqlParameters = { user.getUsername(), user.getU_city(), user.getU_gender(),
				user.getUserpass(),user.getUserid() };
		int recordUpdated = jdbcTemplate.update(sql,sqlParameters);
		return recordUpdated;
	}

	@Override
	public User getOneUser(int userid) {
		String query = "select * from user where userid = ?";
		return jdbcTemplate.queryForObject(query, new CompanyRowMappper(), userid);
		
	}

	@Override
	public List<Project> loadProject() {
		String sql = "select * from projectinfo";

		List<Project> theListOfProjects = jdbcTemplate.query(sql, new ProjectRowMapper());

		return theListOfProjects;
	}

	@Override
	public Project getOneProject(int p_id) {
		String query = "select * from projectinfo where p_id = ?";
		return jdbcTemplate.queryForObject(query, new ProjectRowMapper(), p_id);
	}

	@Override
	public int updateComment(Project project) {
		String sql = "update projectinfo set p_comment=? where p_id=?";
		Object[] sqlParameters = { project.getP_comment(),project.getP_id() };
		int recordUpdated = jdbcTemplate.update(sql,sqlParameters);
		return recordUpdated;
	}

	@Override
	public void saveProject(Project project) {
		Object[] sqlParameters = { project.getP_id(),project.getP_name(),project.getP_reporter(), project.getAssignee(),
				project.getP_progress(),project.getP_priority(),project.getP_level(),project.getP_comment() };
		// get all the variety data types
		String sql = "insert into projectinfo(p_id,p_name,p_reporter,assignee,p_progress,p_priority,p_level,p_comment) values(?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);
		System.out.println("record updated");
		
	}

	@Override
	public int updateProjectDetail(Project project) {
		String sql = "update projectinfo set p_id=?,p_name=?,p_comment=? where p_id=?";
		Object[] sqlParameters = { project.getP_comment(),project.getP_id() };
		int recordUpdated = jdbcTemplate.update(sql,sqlParameters);
		return recordUpdated;
	}

	@Override
	public int deleteProject(int p_id) {
		String query = "delete from projectinfo where p_id = ?";
		return jdbcTemplate.update(query, p_id);
	}

	@Override
	public int updateProgress(Project project) {
		String sql = "update projectinfo set p_progress=? where p_id=?";
		Object[] sqlParameters = { project.getP_progress(),project.getP_id() };
		int recordUpdated = jdbcTemplate.update(sql,sqlParameters);
		return recordUpdated;
	}

	@Override
	public int updatePriority(Project project) {
		String sql = "update projectinfo set p_priority=? where p_id=?";
		Object[] sqlParameters = { project.getP_priority(),project.getP_id() };
		int recordUpdated = jdbcTemplate.update(sql,sqlParameters);
		return recordUpdated;
	}

	@Override
	public int updateLevel(Project project) {
		String sql = "update projectinfo set p_level=? where p_id=?";
		Object[] sqlParameters = { project.getP_level(),project.getP_id() };
		int recordUpdated = jdbcTemplate.update(sql,sqlParameters);
		return recordUpdated;
	}

}
