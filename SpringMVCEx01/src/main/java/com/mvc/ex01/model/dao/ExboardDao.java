package com.mvc.ex01.model.dao;

import java.util.List;

import com.mvc.ex01.model.dto.ExboardDto;

public interface ExboardDao {
	
	String NAMESPACE = "exboard.";

	public List<ExboardDto> selectAll();
	public ExboardDto selectOne(int exno);
	public int boardInsert(ExboardDto dto);
	public int boardUpdate(ExboardDto dto);
	public int boardDelete(int exno);
	
}
