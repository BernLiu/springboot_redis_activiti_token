package com.activiti.boot.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.activiti.boot.service.ActivitiWorkFlowService;
import com.activiti.boot.service.ProcessImgService;
import com.activiti.boot.utils.Base64Util;

@RestController
@RequestMapping("/abd/fileupload")
public class FileUploadController {
	
	@Value("${file.temp.path}")
	private String fileTempPaht;
	
	@Autowired
	private ProcessImgService processImgService;
	@Autowired
	private ActivitiWorkFlowService activitiWorkFlowService;
	

	@PostMapping("/commonfileupload")
	@SuppressWarnings("rawtypes")
	private Map<String, Object> commonFileUpload(HttpServletRequest request) throws IOException{
		Map<String, Object> json = new HashMap<>();
		request.setCharacterEncoding("UTF-8");
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		/**页面空间的文件流*/
		MultipartFile multipartFile = null;
		Map map = multipartRequest.getFileMap();
		for( Iterator i = map.keySet().iterator(); i.hasNext();) {
				Object next = i.next();
				multipartFile =(MultipartFile) map.get(next);
		}
		/**获取文件的后缀名*/
		String filename = multipartFile.getOriginalFilename();
		try {
			 InputStream inputStream = multipartFile.getInputStream();
			 String base64FromInputStream = Base64Util.getBase64FromInputStream(inputStream);
			 //部署流程图
			 activitiWorkFlowService.deployActivitiWorkflow(filename, inputStream);
			 //		 Long id = processImgService.saveProcessImgEntity(base64FromInputStream,filename);
			 json.put("SUCCESS", true);
			 json.put("MESSAGE", "UPLOAD_HAD_DONE");
	//		 json.put("ID",id);
			 return json;
		}catch(Exception e) {
			 json.put("SUCCESS", false);
			 json.put("MESSAGE", "UPLOAD_HAD_FAIL");
			 return json;
		}
	}
}
