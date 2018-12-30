package com.activiti.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activiti.boot.dao.SysMenuRepository;
import com.activiti.boot.service.SysMenuService;

@Service("SysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
	
	@Autowired
	private SysMenuRepository sysMenuRepository;

	@Override
	public String getViewPathByReqUrl(String reqUrl) {
		
		return sysMenuRepository.getViewPathByReqUrl(reqUrl);
	}

}
