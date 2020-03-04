package com.vishal.spring.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.spring.aop.data.Dao;

@Service
public class Bussiness1 {

	@Autowired
	private Dao dao;
	
	public String calculateSomething() {
		return dao.retrieveSomething();
	}
}
