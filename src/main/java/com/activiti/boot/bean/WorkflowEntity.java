package com.activiti.boot.bean;

import java.io.File;

public class WorkflowEntity {

	private File file;  //流程定义部署文件
	
	private Long id;    //申请单ID
	
	private String filename;  //部署文件名称
	private String deploymentId;   //部署对象ID
	private String imageName;    //资源文件名称
	private String taskId;     //任务ID
	private String outcome;  //连线名称
	private String comment;  //备注
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDeploymentId() {
		return deploymentId;
	}
	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
