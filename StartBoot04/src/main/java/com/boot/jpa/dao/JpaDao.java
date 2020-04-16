package com.boot.jpa.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.jpa.dto.JpaDto;

@Repository
public interface JpaDao extends JpaRepository<JpaDto, Integer> {

	public List<JpaDto> findAll();
	
	public JpaDto findByMyno(int myno);
	
	public JpaDto save(JpaDto dto);
	
	@Transactional
	public void deleteByMyno(int myno);

	
	
	
}
