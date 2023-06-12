package org.ncu.company_manage.Service;

import java.util.List;

import org.ncu.company_manage.api.Project;
import org.ncu.company_manage.api.User;


public interface UserService {
	void addOneUser(User userInfo);
	List<User> loadUsers();
	User getUser(int userid);
	void updateRecord(User user);
	User getOneRecord(int userid);
	List<Project> loadUserProject();
	Project getOneProjectRec(int p_id);
	void updateComment(Project project);
	void addOneProject(Project projectInfo);
	void updateProj(Project project);
	int deleteProjectRecord(int p_id);
	void updateProgress(Project project);
	void updatePriority(Project project);
	void updateLevel(Project project);
}
