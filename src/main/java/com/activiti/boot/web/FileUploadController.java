package com.activiti.boot.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.boot.exception.CommonException;

@RestController
@RequestMapping("/abd/fileupload")
public class FileUploadController {
	
	@Value("${file.temp.path}")
	private String fileTempPaht;

	@PostMapping("/commonfileupload")
	private Map<String, Object> commonFileUpload(HttpServletRequest request){
		Map<String, Object> map = new HashMap<>();
		try {
			ServletInputStream inputStream = request.getInputStream();
			String tempFilePath = request.getServletContext().getRealPath(fileTempPaht);
			File targetFile = new File(tempFilePath);
			//上传文件服务器
			Files.copy(inputStream, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			throw new CommonException("File上传失败");
		}
		return map;
	}
}
