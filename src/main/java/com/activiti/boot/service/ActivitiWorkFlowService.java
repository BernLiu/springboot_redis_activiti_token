package com.activiti.boot.service;

import java.util.List;
import java.util.Map;

import com.activiti.boot.bean.AcitvitiWorkFlowInst;

public interface ActivitiWorkFlowService {
	
	/**
	 * 创建并启动流程实例
	 * @param workflowDefName (流程定义名称)
	 * @return
	 */
	public AcitvitiWorkFlowInst createAndStartWorkFlowInst(String workflowDefName);
	
	/**
	 * 创建启动流程实例
	 * @param workflowDefName
	 * @param variables
	 * @return
	 */
	public AcitvitiWorkFlowInst createAndStartWorkFlowInst(String workflowDefName,Map<String,Object> variables);
	
	/**
	 * 
	 * @param workflowDefName (流程定义名称)
	 * @param workflowInsName (流程实例名称)
	 * @param workflwoInsDesc (流程实例描述)
	 * @return
	 */
	public AcitvitiWorkFlowInst createAndStartWorkFlowInst(String workflowDefName,String workflowInsName, String workflwoInsDesc);

	/**
	 * 创建启动流程实例
	 * @param workflowDefName
	 * @return
	 */
	public AcitvitiWorkFlowInst createStartWfiAndFinishFirst(String workflowDefName);
	
	/**
	 * 创建启动流程实例完成一个节点
	 * @param workflowDefName
	 * @param variables
	 * @return
	 */
	public AcitvitiWorkFlowInst createStartWfiAndFinishFirst(String workflowDefName,Map<String,Object> variables);
	
	/**
	 * 创建流程实例
	 * @param workflwoDefName  (流程定义名称)
	 * @param workflowInstName (流程实例名称)
	 * @param workflowInsDesc  (流程实例描述)
	 * @return
	 */
	public AcitvitiWorkFlowInst createWorkflowInst(String workflwoDefName,String workflowInstName,String workflowInsDesc);

	/**
	 * 部署流程
	 * @param name
	 * @param content
	 * @return
	 */
	public String deployWorkflow(String name,String content);
	
	/**
	 * 查询所有的流程定义
	 * @return
	 */
	public List<AcitvitiWorkFlowInst> fetchAllWorkflowDef();
	
	/**
	 * 查询所有的流程实例
	 * @return
	 */
	public List<AcitvitiWorkFlowInst> fetchAllWorkflowInst();
}
