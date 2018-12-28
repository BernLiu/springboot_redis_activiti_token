package com.activiti.boot.bean;

import java.util.Date;
import java.util.Map;

public class AcitvitiWorkFlowInst {
	private Long workFlowInstId; //流程实例 ID
	
	private String parentWorkflowInstNo; //父流程实例 ID
	
	private String excutionNo;  //流程执行no
	
	private String workflowInstNo; //流程实例no
	
	private String workflowInstName; //流程实例名称
	
	private String workflowDefName;  //流程定义名称
	
	private String workflowVersion; //流程定义版本
	
	private Date createDate;
	
	private Date startDate;
	
	private String status;
	
	private Date endDate;
	
	private String launcher; //流程发起者
	
	private Map<String,Object> variables;  //流程变量
	
	private String currentAcitviti; //当前节点名称

	public Long getWorkFlowInstId() {
		return workFlowInstId;
	}

	public void setWorkFlowInstId(Long workFlowInstId) {
		this.workFlowInstId = workFlowInstId;
	}

	public String getParentWorkflowInstNo() {
		return parentWorkflowInstNo;
	}

	public void setParentWorkflowInstNo(String parentWorkflowInstNo) {
		this.parentWorkflowInstNo = parentWorkflowInstNo;
	}

	public String getExcutionNo() {
		return excutionNo;
	}

	public void setExcutionNo(String excutionNo) {
		this.excutionNo = excutionNo;
	}

	public String getWorkflowInstNo() {
		return workflowInstNo;
	}

	public void setWorkflowInstNo(String workflowInstNo) {
		this.workflowInstNo = workflowInstNo;
	}

	public String getWorkflowInstName() {
		return workflowInstName;
	}

	public void setWorkflowInstName(String workflowInstName) {
		this.workflowInstName = workflowInstName;
	}

	public String getWorkflowDefName() {
		return workflowDefName;
	}

	public void setWorkflowDefName(String workflowDefName) {
		this.workflowDefName = workflowDefName;
	}

	public String getWorkflowVersion() {
		return workflowVersion;
	}

	public void setWorkflowVersion(String workflowVersion) {
		this.workflowVersion = workflowVersion;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLauncher() {
		return launcher;
	}

	public void setLauncher(String launcher) {
		this.launcher = launcher;
	}

	public Map<String, Object> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Object> variables) {
		this.variables = variables;
	}

	public String getCurrentAcitviti() {
		return currentAcitviti;
	}

	public void setCurrentAcitviti(String currentAcitviti) {
		this.currentAcitviti = currentAcitviti;
	}
	
	
	
}
