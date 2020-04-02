package com.mvc.update.model.biz;

import java.util.List;

import com.mvc.update.model.dto.JdbcDto;

public interface JdbcBiz {

	public List<JdbcDto> selectList();
	public JdbcDto selectOne(int seq);
	public int insert(JdbcDto dto);
	public int update(JdbcDto dto);
	public int delete(int seq);
	
}
