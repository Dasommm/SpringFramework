package com.mvc.updown.validate;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {	//validate를 지원하는지 ?
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		UploadFile file = (UploadFile) target;
		
		if(file.getMpfile().getSize() == 0) {
			errors.rejectValue("mpfile", "fileNPE","Please select a file");
			//만일 에러가 발생하면 errors가 잡아서 되돌려줄것이다. 
			//mptile에서 fileNPE가 있으면 please...를 되돌려줄거다. 
		}
		
	}

}
