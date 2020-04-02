package com.mvc.ex01.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.ex01.model.dto.ExboardDto;

@Repository
public class ExboardDaoImpl implements ExboardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<ExboardDto> selectAll() {
		System.out.println("다오임플 들어옴");
		
		List<ExboardDto> list = null;
		try {
			list = sqlSession.selectList(NAMESPACE+"selectAll");
			System.out.println("다오"+list.get(0).getExno());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : selectAll");
		}
		
		return list;
	}

	@Override
	public ExboardDto selectOne(int exno) {
		
		ExboardDto detailDto = null;
		
		try {
			detailDto = sqlSession.selectOne(NAMESPACE+"selectOne",exno);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error : selectOne");
		}
		
		return detailDto;
	}

	@Override
	public int boardInsert(ExboardDto dto) {
		
		int res = 0;
		try {
			res = sqlSession.insert(NAMESPACE+"insert",dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : insert");
		}
		
		return res;
	}

	@Override
	public int boardUpdate(ExboardDto dto) {

		int res = 0;
		
		try {
			res = sqlSession.update(NAMESPACE+"update",dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : update");
		}
		
		return res;
	}

	@Override
	public int boardDelete(int exno) {

		int res = 0;
		
		try {
			res = sqlSession.delete(NAMESPACE+"delete",exno);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : delete");
		}
		return res;
	}

}
