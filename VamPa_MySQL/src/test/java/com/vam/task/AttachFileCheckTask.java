package com.vam.task;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.vam.mapper.AdminMapper;
import com.vam.model.AttachImageVO;

import lombok.extern.log4j.Log4j;

@Component
@Log4j
public class AttachFileCheckTask {

	@Autowired
	private AdminMapper mapper;
	
	private String getFolderYesterDay() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, -1);
		
		String str = sdf.format(cal.getTime());
		
		return str.replace("-", File.separator);
	}	
	
	@Scheduled(cron="0 * * * * *")
	public void checkFiles() throws Exception{	
		
		log.warn("File Check Task Run..........");
		log.warn(new Date());
		log.warn("========================================");		
		
		// DB에 저장된 파일 리스트
		List<AttachImageVO> fileList = mapper.checkFileList();		
		
		
		// 비교 기준 파일 리스트(Path객체)
		List<Path> checkFilePath = new ArrayList<Path>();
			//원본 이미지
		fileList.forEach(vo -> {
			Path path = Paths.get("C:\\upload", vo.getUploadPath(), vo.getUuid() + "_" + vo.getFileName());
			checkFilePath.add(path);
		});		
			//썸네일 이미지
		fileList.forEach(vo -> {
			Path path = Paths.get("C:\\upload", vo.getUploadPath(), "s_" +  vo.getUuid() + "_" + vo.getFileName());
			checkFilePath.add(path);
		});
		
		
		// 디렉토리 파일 리스트
		File targetDir = Paths.get("C:\\upload", getFolderYesterDay()).toFile();
		File[] targetFile = targetDir.listFiles();
		
		
		// 삭제 대상 파일 리스트(분류)
		List<File> removeFileList = new ArrayList<File>(Arrays.asList(targetFile));		
		for(File file : targetFile){
			checkFilePath.forEach(checkFile ->{
				if(file.toPath().equals(checkFile)) 
					removeFileList.remove(file);	
			});
		}
		
		
		// 삭제 대상 파일 제거
		log.warn("file Delete : ");
		for(File file : removeFileList) {
			log.warn(file);
			file.delete();
		}		
		
		log.warn("========================================");
		
	}
	
	
}
