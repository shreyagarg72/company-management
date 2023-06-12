package org.ncu.company_manage.DAO;

import java.util.List;

import org.ncu.company_manage.api.Project;
import org.ncu.company_manage.api.User;

public interface UserDAO {
	void saveUser(User user);
	boolean validateUser(String username, String userpass);
	boolean validateAdmin(String adminname, String adminpass);
	List<User> loadUsers();
	User getUser(int userid);
	int updateUser(User user);
	User getOneUser(int userid);
	List<Project> loadProject();
	Project getOneProject(int p_id);
	int updateComment(Project project);
	void saveProject(Project project);
	int updateProjectDetail(Project project);
	int deleteProject(int p_id);
	int updateProgress(Project project);
	int updatePriority(Project project);
	int updateLevel(Project project);
}
