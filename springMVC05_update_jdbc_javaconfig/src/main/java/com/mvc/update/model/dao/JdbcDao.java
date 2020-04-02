package com.mvc.update.model.dao;

import java.util.List;

import com.mvc.update.model.dto.JdbcDto;

public interface JdbcDao {

	public List<JdbcDto> selectList();
	public JdbcDto selectOne(int seq);
	public int insert(JdbcDto dto);
	public int update(JdbcDto dto);
	public int delete(int seq);
	
}
