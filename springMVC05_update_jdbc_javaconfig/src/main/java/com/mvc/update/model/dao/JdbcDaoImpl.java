package com.mvc.update.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc.update.model.dto.JdbcDto;

@Repository
public class JdbcDaoImpl implements JdbcDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<JdbcDto> selectList() {
		
		List<JdbcDto> list = new ArrayList<JdbcDto>();
		String sql = " SELECT * FROM JDBCBOARD ORDER BY SEQ DESC ";
		
		/*
		list = jdbcTemplate.query(sql, new RowMapper<JdbcDto>() {

			@Override
			public JdbcDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				JdbcDto dto = new JdbcDto();
				dto.setSeq(rs.getInt(1));
				dto.setWriter(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setRegdate(rs.getDate(5));
				return dto;
			}
		});
		*/
		
		//java 1.8이상(lambda)
		/*list = jdbcTemplate.query(sql, 
				(rs, rowNum)->{
					JdbcDto dto = new JdbcDto(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getDate(5));
					return null;
				
				});
		*/
		
		list = jdbcTemplate.query(sql, new MyMapper());
		
		return list;
	}

	@Override
	public JdbcDto selectOne(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(JdbcDto dto) {

		int res=0;
		String sql = " INSERT INTO JDBCBOARD VALUES(JDBCBOARDSEQ.NEXTVAL, ?, ?, ?, SYSDATE) ";
		//preparedStatement를 사용하기 때문에 ?로 표시한다
		
		res = jdbcTemplate.update(sql, new Object[] {dto.getWriter(), dto.getTitle(), dto.getContent()});
		
		
		return res;
	}

	@Override
	public int update(JdbcDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int seq) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static final class MyMapper implements RowMapper<JdbcDto>{

		@Override
		public JdbcDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return  new JdbcDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5));
		}
		
	}
	
	
}
