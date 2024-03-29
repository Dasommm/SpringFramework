package com.mvc.updown;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.mvc.updown.validate.FileValidator;
import com.mvc.updown.validate.UploadFile;

@Controller
public class HomeController{

	@Autowired
	private FileValidator fileValidator;
	
	@RequestMapping("/form")
	public String uploadForm() {
		return "upload";
	}
	
	@RequestMapping("/upload")
	public String fileUpload(HttpServletRequest request, Model model, 
							 UploadFile uploadFile, BindingResult result) {
		//BindingResult : 매개변수를 Bean 에 binding 할 때 발생한 오류 정보를 받는 기능
	      // BindingResult : 발생한 오류 정보를 받기 위한 객체
	      // uploadFile(uploadform에서 담겨온 애들)에 대해 유효성 검사를 하고 오류가 있는 경우 result에 오류 등록
		
		
		fileValidator.validate(uploadFile, result);   //검증
		if(result.hasErrors()) {         //한 글자씩 읽으면서 에러 검증하여 error가 있을 시 upload.jsp로 return
			return "upload";
		}
		
		MultipartFile file = uploadFile.getMpfile();
		String name = file.getOriginalFilename();	//업로드한 실제 파일명
		
		//DTO에 set
		UploadFile fileObj = new UploadFile();
		fileObj.setName(name);
		fileObj.setDesc(uploadFile.getDesc());
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
		       // 파일 내용을 읽기 위해 InputStream을 얻어옴
			inputStream = file.getInputStream();
	         // 파일이 저장될 실제 서버상의 경로 생성
			String path = WebUtils.getRealPath(request.getSession().getServletContext(), 
												"/resources/storage");
			
			System.out.println("업로드 될 실제 경로 : " + path);
			
			//경로가 존재하지 않으면 생성
			File storage = new File(path);
			if(!storage.exists()) {
				storage.mkdir();
			}
			
			//파일이 존재하지 않으면 생성
			File newFile = new File(path + "/" + name);
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			
			 // 지정한 파일로 OutputStream을 생성
			outputStream = new FileOutputStream(newFile);
			
			//위의 코드까지는 껍데기를 만들고 아래부터는 파일을 만들고 있다. 
			int read = 0;  // 읽은 데이터의 크기
			byte[]b = new byte[(int)file.getSize()]; // InputStream에서 b의 배열크기만큼씩 읽어서 int 값으로 반환한다.
			while((read = inputStream.read(b)) != -1) {    // //바이트 데이터를 리턴하거나 스트림의 끝에 도달하면 -1을 리턴, -1은 없을 때 까지 
				outputStream.write(b, 0, read); // write(byte buf[], int index, int size) : byte의 index 위치부터 size만큼의 바이트를 출력한다.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		model.addAttribute("fileObj", fileObj);
		return "download";
	}

	
	@RequestMapping("/download")
	@ResponseBody
	public byte[] fileDownload(HttpServletRequest request,
								HttpServletResponse response, String name) {
		//@responseBody : ViewResolver 거치치 않고 response 객체에 담아서 준다. 
		//stream :연속적인 데이터들의 흐름 : 바이트가 기본
		byte[] down = null;
		
		String path;
		try {
			path = WebUtils.getRealPath(request.getSession().getServletContext(), 
												"/resources/storage");
			
			File file = new File(path + "/" + name);
			
			down = FileCopyUtils.copyToByteArray(file);
			String filename = new String(file.getName().getBytes(), "8859_1");	
			//8859_1로 인코딩을 바꿔준다.
			
			response.setHeader("Content-Disposition", "attachment; filename=\""+filename+"\"");
			//Content-disposition, attachment : 파일을 다운로드 하겠다.
			response.setContentLength(down.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return down;
	}
}
