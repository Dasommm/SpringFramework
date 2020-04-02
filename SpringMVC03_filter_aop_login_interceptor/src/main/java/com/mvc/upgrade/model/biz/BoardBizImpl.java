package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.dao.BoardDaoImpl;
import com.mvc.upgrade.model.dto.BoardDto;

@Service	//해당 클래스를 객체화 해준다 기능은 없고 그냥 이게 biz객체라고 알려주는 것이다.
public class BoardBizImpl implements BoardBiz {

	@Autowired
	private BoardDao dao = new BoardDaoImpl();
	//private BoardDao dao; 로 해도 된다. 

	@Override
	public List<BoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public BoardDto selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardDto dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int myno) {
		// TODO Auto-generated method stub
		return dao.delete(myno);
	}

}
