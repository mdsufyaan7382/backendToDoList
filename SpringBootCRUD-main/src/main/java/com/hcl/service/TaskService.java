package com.hcl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import com.hcl.entity.Employee;
import com.hcl.entity.Task;
//import com.hcl.repository.IEmployee;
import com.hcl.repository.ITask;


@org.springframework.stereotype.Service
public class TaskService {

	@Autowired
	 ITask Repo1;
	
	
	public String Welcome() {
		return "Welcome to Spring Boot Task Management System Project with JPA & MYSQL";
}

	
	public List<Task> getAllTask(){
		return Repo1.findAll();
	}
	
	
	public Task addAllTask(Task t) {
		return Repo1.save(t);
	}
//	public void updateTask(Task t) {
//		Repo1.save(t);
//	}
	
	public void delete(int id) {
		Repo1.deleteById(id);
	}
	public Optional<Task> getTaskById(int id) {
		return Repo1.findById(id);		
	}
	  public Task updateTask(Task task) {
	        System.out.println("updates");
	        Task existing_Task = Repo1.findById(task.getTaskid()).orElse(null);
	        existing_Task.setTaskdescription(task.getTaskdescription());
	        existing_Task.setTasktargetdate(task.getTasktargetdate());
	        existing_Task.setUsername(task.getUsername());
	        return Repo1.save(existing_Task);
	    }
	  public List<Task> getAlltaskByUser(String username){
		  return Repo1.findAllByUsername(username);
	  }
	
}
