package com.mvc.emp.dao;

import java.util.List;

import com.mvc.emp.dto.EmpDto;

public interface EmpDao {
	
	String NAMESPACE = "emp.";

	public List<EmpDto> selectAll();
	
}
