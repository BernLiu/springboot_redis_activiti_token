package com.activiti.boot.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activiti.boot.bean.ProcessImgEntity;
import com.activiti.boot.bean.UserEntity;
import com.activiti.boot.dao.sys.ProcessImgRepository;
import com.activiti.boot.service.ProcessImgService;
import com.activiti.boot.utils.DateUtil;
import com.activiti.boot.utils.RedisUtil;

@Service("ProcessImgService")
public class ProcessImgServiceImpl implements ProcessImgService {
	
	@Autowired
	private ProcessImgRepository processImgRepository;
	
	@Autowired
	private RedisUtil redisUtil;

	@Override
	public Long saveProcessImgEntity(String imgContent,String imgName) {
		UserEntity loginUserEntity = getLoginUserEntity();
		ProcessImgEntity pie = new ProcessImgEntity();
		pie.setCreateTime(DateUtil.dateFormat(new Date(), null));
		pie.setCreateUser(String.valueOf(loginUserEntity.getId()));
		pie.setProcessId(1);
		pie.setIsused(1);
		pie.setImgContent(imgContent);
		pie.setImgName(imgName);
		return processImgRepository.saveProcessImg(pie);
	}
	
	private UserEntity getLoginUserEntity() {
		return (UserEntity)redisUtil.get("loginEntity");
	}
}
