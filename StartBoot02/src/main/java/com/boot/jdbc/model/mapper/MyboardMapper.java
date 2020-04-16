package com.boot.jdbc.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.boot.jdbc.model.dto.MyDto;

//mapper.xml과 같은 기능
@Mapper
public interface MyboardMapper {
	
	@Select(" SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD ORDER BY MYNO DESC ")
	List<MyDto> selectList();

	@Select(" SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD WHERE MYNO = #{myno} ")
	MyDto selectOne(int myno);
	
	@Insert(" INSERT INTO MYBOARD VALUES(MYNOSEQ.NEXTVAL, #{myname}, #{mytitle}, #{mycontent}, SYSDATE) ")
	public int insert(MyDto dto);
	
	@Update(" UPDATE MYBOARD SET MYTITLE =#{mytitle} , MYCONTENT=#{mycontent} WHERE MYNO=#{myno} ")	
	public int update(MyDto dto);
	
	@Delete(" DELETE FROM MYBOARD WHERE MYNO= #{myno} ")
	public int delete(int myno);
	
}
