package com.sachin.jnditest.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JNDIController {
		
	@Autowired
	private DataSource dataSource;
	
	@GetMapping("/test")
	public String test() {
		try {
			return "your datasource connected to user:"+dataSource.getConnection().getMetaData().getUserName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
