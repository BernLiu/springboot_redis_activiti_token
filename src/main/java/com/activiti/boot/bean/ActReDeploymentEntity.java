package com.activiti.boot.bean;

import java.io.Serializable;
import java.util.Date;

public class ActReDeploymentEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ID_;
	private String NAME_;
	private String CATEGORY_;
	private String KEY_;
	private String TENANT_ID_;
	private Date DEPLOY_TIME_;
	private String ENGINE_VERSION_;
	public String getID_() {
		return ID_;
	}
	public void setID_(String iD_) {
		ID_ = iD_;
	}
	public String getNAME_() {
		return NAME_;
	}
	public void setNAME_(String nAME_) {
		NAME_ = nAME_;
	}
	public String getCATEGORY_() {
		return CATEGORY_;
	}
	public void setCATEGORY_(String cATEGORY_) {
		CATEGORY_ = cATEGORY_;
	}
	public String getKEY_() {
		return KEY_;
	}
	public void setKEY_(String kEY_) {
		KEY_ = kEY_;
	}
	public String getTENANT_ID_() {
		return TENANT_ID_;
	}
	public void setTENANT_ID_(String tENANT_ID_) {
		TENANT_ID_ = tENANT_ID_;
	}
	public Date getDEPLOY_TIME_() {
		return DEPLOY_TIME_;
	}
	public void setDEPLOY_TIME_(Date dEPLOY_TIME_) {
		DEPLOY_TIME_ = dEPLOY_TIME_;
	}
	public String getENGINE_VERSION_() {
		return ENGINE_VERSION_;
	}
	public void setENGINE_VERSION_(String eNGINE_VERSION_) {
		ENGINE_VERSION_ = eNGINE_VERSION_;
	}
	
	
}
