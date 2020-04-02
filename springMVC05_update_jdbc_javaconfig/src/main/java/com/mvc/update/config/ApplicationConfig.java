package com.mvc.update.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:sqls/db.properties")
public class ApplicationConfig {
	//@propertySource = xml에 <property name="location" value="classpath:sqls/db.properties" />
	
	@Value("${driver}")	private String driver;
	@Value("${url}")	private String url;
	@Value("${user}")	private String user;
	@Value("${pw}")	private String pw;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(pw);
		
		
		return dataSource;		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
}
