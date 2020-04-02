package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.BoardDto;

@Repository	//여기에서 나오는 Exception을 DataAccessException으로 변환한다.

public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoardDto> selectList() {

		List<BoardDto> list = new ArrayList<BoardDto>();
		System.out.println("다오들어옴");		
		try {
			list = sqlSession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : select list");
		}
		
		return list;
	}

	@Override
	public BoardDto selectOne(int myno) {

		BoardDto boardDetail = null;
		
		try {
			boardDetail = sqlSession.selectOne(NAMESPACE+"selectDetail",myno);
			System.out.println("selectOne :"+boardDetail.getMyname());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : select detail");

		}
		
		return boardDetail;
	}

	@Override
	public int insert(BoardDto dto) {

		int res=0;
		
		try {
			res = sqlSession.insert(NAMESPACE+"boardInsert",dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : insert");

		}
		
		return res;

	}

	@Override
	public int update(BoardDto dto) {

		int res = 0;
		
		try {
			res= sqlSession.update(NAMESPACE+"update",dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : update");

		}
		
		return res;

	}

	@Override
	public int delete(int myno) {
		int res = 0;
		
		try {
			res=sqlSession.delete(NAMESPACE+"delete",myno);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : delete");
		}
		
		return res;
	}

}
