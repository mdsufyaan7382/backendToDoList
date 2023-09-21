package com.hcl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Task;
import com.hcl.service.TaskService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

	@Autowired
	private TaskService s;

	@GetMapping("/")

	public String welcomemsg() {
		return s.Welcome();
	}

//	@GetMapping("/getTask")
//
//	public List<Task> listUser() {
//		return s.getAllTask();
//	}
	@GetMapping("/getAllTask")
	public Iterable<Task> getAlltasks() {
		return s.getAllTask();
	}

//	@PostMapping("/addTask")
//
//	public void addTask(Task t) {
//		s.addAllTask(t);
//	}
	@GetMapping("/task/{id}")
	public Optional<Task> getTask(@PathVariable("id") int taskid) {
		return s.getTaskById(taskid);
	}
	@PostMapping("/addTask")
	public Task addtask(@RequestBody Task t) {
		return s.addAllTask(t);
		//return "task added successfully in to-do list";
	}

//	@PutMapping("/updateTask")
//
//	public void updateTask(Task t) {
//		s.updateAllTask(t);
//	}
	@PutMapping("/updateTask")
	public Task updateTaskDescription(@RequestBody Task t) {
		return s.updateTask(t);
		//return "Task description update Successfully";
	}
	@DeleteMapping("/delete/{taskid}")
	public void deleteTask(@PathVariable("taskid") int taskid) {
		s.delete(taskid);
	}
	@GetMapping("/listCourseByUsername/{username}")
    public List<Task> findTaskByUsername(@PathVariable String username) {
        return s.getAlltaskByUser(username);
    }
	

}
