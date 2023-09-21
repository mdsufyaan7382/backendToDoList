package com.hcl.entity;

import java.sql.Date;
//import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int taskid;
	private String taskdescription;
	private Date tasktargetdate;
//	private Time tasktargettime;
	private String username;

	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskdescription() {
		return taskdescription;
	}
	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}
	public Date getTasktargetdate() {
		return tasktargetdate;
	}
	public void setTasktargetdate(Date tasktargetdate) {
		this.tasktargetdate = tasktargetdate;
	}
//	public Time getTasktargettime() {
//		return tasktargettime;
//	}
//	public void setTasktargettime(Time tasktargettime) {
//		this.tasktargettime = tasktargettime;
//	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public static Object findById(int taskid2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
	

}
