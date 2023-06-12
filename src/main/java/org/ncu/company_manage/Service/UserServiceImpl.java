package org.ncu.company_manage.Service;

import java.util.List;

import org.ncu.company_manage.DAO.UserDAO;
import org.ncu.company_manage.api.Project;
import org.ncu.company_manage.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Override
	public void addOneUser(User userInfo) {
		userDAO.saveUser(userInfo);
		
	}
	@Override
	public List<User> loadUsers() {
		// TODO Auto-generated method stub
		List<User> userList = userDAO.loadUsers();
		return userList;
	}
	@Override
	public User getUser(int userid) {
		// TODO Auto-generated method stub
		return userDAO.getUser(userid);
	}
	@Override
	public void updateRecord(User user) {
		int rowUpdated = userDAO.updateUser(user);
		if(rowUpdated == 1) {
			System.out.println("Record updated successfully");
			
		}
		else {
			System.out.println("Error occured");
		}
		
	}
	@Override
	public User getOneRecord(int userid) {
		User user = userDAO.getOneUser(userid);
		return user;
	}
	@Override
	public List<Project> loadUserProject() {
		List<Project> projectuserList = userDAO.loadProject();
		return projectuserList;
	}
	@Override
	public Project getOneProjectRec(int p_id) {
		Project project = userDAO.getOneProject(p_id);
		return project;
	}
	@Override
	public void updateComment(Project project) {
		int rowUpdated = userDAO.updateComment(project);
		if(rowUpdated == 1) {
			System.out.println("Record updated successfully");
			
		}
		else {
			System.out.println("Error occured");
		}
	}
	@Override
	public void addOneProject(Project projectInfo) {
		userDAO.saveProject(projectInfo);
		
	}
	@Override
	public void updateProj(Project project) {
		int rowUpdated = userDAO.updateComment(project);
		if(rowUpdated == 1) {
			System.out.println("Record updated successfully");
			
		}
		else {
			System.out.println("Error occured");
		}
		
	}
	@Override
	public int deleteProjectRecord(int p_id) {
		userDAO.deleteProject(p_id);
		System.out.println("Student with "+p_id+" is deleted successfully!!");
		return 0;
		
	}
	@Override
	public void updateProgress(Project project) {
		int rowUpdated = userDAO.updateProgress(project);
		if(rowUpdated == 1) {
			System.out.println("Record updated successfully");
			
		}
		else {
			System.out.println("Error occured");
		}
		
	}
	@Override
	public void updatePriority(Project project) {
		int rowUpdated = userDAO.updatePriority(project);
		if(rowUpdated == 1) {
			System.out.println("Record updated successfully");
			
		}
		else {
			System.out.println("Error occured");
		}
		
	}
	@Override
	public void updateLevel(Project project) {
		int rowUpdated = userDAO.updateLevel(project);
		if(rowUpdated == 1) {
			System.out.println("Record updated successfully");
			
		}
		else {
			System.out.println("Error occured");}
		
	} 
	
	

}
