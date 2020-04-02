package com.mvc.ex01.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.ex01.model.dao.ExboardDao;
import com.mvc.ex01.model.dto.ExboardDto;

@Service
public class ExboardBizImpl implements ExboardBiz {

	@Autowired
	private ExboardDao dao;
	
	@Override
	public List<ExboardDto> selectAll() {
		System.out.println("비즈 들어옴");
		return dao.selectAll();
	}

	@Override
	public ExboardDto selectOne(int exno) {
		return dao.selectOne(exno);
	}

	@Override
	public int boardInsert(ExboardDto dto) {
		return dao.boardInsert(dto);
	}

	@Override
	public int boardUpdate(ExboardDto dto) {
		return dao.boardUpdate(dto);
	}

	@Override
	public int boardDelete(int exno) {
		return dao.boardDelete(exno);
	}

}
