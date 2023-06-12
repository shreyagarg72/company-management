package org.ncu.company_manage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.ncu.company_manage.DAO.UserDAO;
import org.ncu.company_manage.Service.UserService;
import org.ncu.company_manage.api.Project;
import org.ncu.company_manage.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	// get the admin login page
	// where we have to sign in
	@GetMapping(value = "admin")
	public String adminPage() {
		return "adminLogin";
	}

	// open user register where we get option of sign in
	// as well as sign up
	@RequestMapping(value = "user")
	public String userPage() {
		return "userRegister";
	}

	// to get the user registered
	@GetMapping(value = "registerMe")
	public String doRegister(Model model) {
		model.addAttribute("user", new User());
		return "userRegisterPage";
	}

	// to save the user details in database
	@GetMapping(value = "save-user")
	public String saveUser(User user) {
		System.out.println(user);
		userService.addOneUser(user);
		return "redirect:/user";
	}

	// User login
	@PostMapping("process-login")
	public String checkUser(@RequestParam("username") String username, @RequestParam("userpass") String userpass) {
		boolean loginflag = userDAO.validateUser(username, userpass);
		if (loginflag == true) {
			return "user-success";
		} else {
			return "redirect:/user";
		}
	}

	// admin login
	@PostMapping("process-adminlogin")
	public String checkAdmin(@RequestParam("adminname") String adminname, @RequestParam("adminpass") String adminpass) {
		boolean loginflag = userDAO.validateAdmin(adminname, adminpass);
		if (loginflag == true) {
			return "admin-success";
		} else {
			return "redirect:/admin";
		}
	}

	// show user
	@GetMapping(value = "/showUser")
	public String showUserList(Model model) {
		// now calling service earlier dao
		List<User> userList = userService.loadUsers();
		for (User tempUser : userList) {
			System.out.println(tempUser);
		}
		model.addAttribute("user", userList);

		return "user-list";
	}
	
// trial one
	
	
//	@GetMapping("/updateForm")
//	public String showUpdateForm(@RequestParam("userid") int userid) {
//		System.out.println("Getting the User data for id: " + userid);
//		userService.getOneRecord(userid);
//		/* send the student object to view */
//		return "update-userform";
//	}
//	
	
	@GetMapping("/updateForm")
	public String showUpdateForm(@RequestParam("userid") int userid , @ModelAttribute("user") User user, Model model) {
		System.out.println("Getting the User data for id: " + userid);
		user = userService.getOneRecord(userid);
		/* send the student object to view */
		model.addAttribute(user);
		return "update-userform";
	}

	@RequestMapping(value = "/processUpdate", method = RequestMethod.POST)
	public String processUpdateForm(@ModelAttribute("user") User user) {
		userService.updateRecord(user);
		return "redirect:/showUser";
	}

    // show projects

	@GetMapping(value = "/view-user-project")
	public String userProject(Model model) {
		// now calling service earlier dao
		List<Project> projectuserList = userService.loadUserProject();
		for (Project tempUser : projectuserList) {
			System.out.println(tempUser);
		}
		model.addAttribute("project", projectuserList);

		return "user-projectList";
	}
	// add comment
	@GetMapping("/addComment")
	public String addCom(@RequestParam("p_id") int p_id, @ModelAttribute("project") Project project, Model model) {
		System.out.println("Getting the project data for id: " + p_id);
		project = userService.getOneProjectRec(p_id);
		/* send the student object to view */
		model.addAttribute(project);
		return "add-project-comment";
	}
	
	@RequestMapping(value = "/processAddComment", method = RequestMethod.POST)
	public String processAddCom(@ModelAttribute("project") Project project) {
		userService.updateComment(project);
		return "redirect:/view-user-project";
	}

	// show project in Admin
	@GetMapping(value = "/mainProjectView")
	public String adminProject(Model model) {
		// now calling service earlier dao
		List<Project> projectuserList = userService.loadUserProject();
		for (Project tempUser : projectuserList) {
			System.out.println(tempUser);
		}
		model.addAttribute("project", projectuserList);

		return "admin-projectList";
	}
	// show add project
	@GetMapping(value = "/showAddProjectPage")
	public String addProject(Model model) {
//		model.addAttribute("student",new Student());
// can be a method but not safe
		Project project = new Project();
		model.addAttribute("project", project);

		return "add-project";
	}
	//save project
	@GetMapping(value = "save-project")
	public String saveProject(Project project) {
		System.out.println(project);
		userService.addOneProject(project);
		return "redirect:/mainProjectView";
	}
	// update project
	@GetMapping("/updateProject")
	public String showUpdateProject(@RequestParam("p_id") int p_id, @ModelAttribute("project") Project project, Model model) {
		System.out.println("Getting the User data for id: " + p_id);
		project = userService.getOneProjectRec(p_id);
		/* send the student object to view */
		model.addAttribute(project);
		return "update-project";
	}
	// update project particular detail
	@RequestMapping(value = "/processUpdateProject", method = RequestMethod.POST)
	public String processUpdateP(@ModelAttribute("project") Project project) {
		userService.updateProj(project);
		return "redirect:/mainProjectView";
	}
	
	//delete project
	@RequestMapping(value = "/deleteProject", method = RequestMethod.GET)
	public String deleteProject(@RequestParam("p_id")int p_id) {
		userService.deleteProjectRecord(p_id);
		return "redirect:/mainProjectView";
	}
	
	// update progress
	
		@GetMapping("/updateProgress")
		public String addProgress(@RequestParam("p_id") int p_id, @ModelAttribute("project") Project project, Model model) {
			System.out.println("Getting the project data for id: " + p_id);
			project = userService.getOneProjectRec(p_id);
			/* send the student object to view */
			model.addAttribute(project);
			return "update-project-progress";
		}
		
		@RequestMapping(value = "/process", method = RequestMethod.POST)
		public String processAddProgress(@ModelAttribute("project") Project project) {
			userService.updateProgress(project);
			return "redirect:/mainProjectView";
		}
		
		// update priority
		@GetMapping("/updatePriority")
		public String addPriority(@RequestParam("p_id") int p_id, @ModelAttribute("project") Project project, Model model) {
			System.out.println("Getting the project data for id: " + p_id);
			project = userService.getOneProjectRec(p_id);
			/* send the student object to view */
			model.addAttribute(project);
			return "update-project-priority";
		}
		
		@RequestMapping(value = "/processPrior", method = RequestMethod.POST)
		public String processAddPriority(@ModelAttribute("project") Project project) {
			userService.updatePriority(project);
			return "redirect:/mainProjectView";
		}
		// update level
		@GetMapping("/updateLevel")
		public String addLevel(@RequestParam("p_id") int p_id, @ModelAttribute("project") Project project, Model model) {
			System.out.println("Getting the project data for id: " + p_id);
			project = userService.getOneProjectRec(p_id);
			/* send the student object to view */
			model.addAttribute(project);
			return "update-project-level";
		}
		
		@RequestMapping(value = "/processlevel", method = RequestMethod.POST)
		public String processAddLevel(@ModelAttribute("project") Project project) {
			userService.updateLevel(project);
			return "redirect:/mainProjectView";
		}
		
		@GetMapping(value = "updateProfile")
		public String doUpdate() {
			return "userupdate";
		}

		}
