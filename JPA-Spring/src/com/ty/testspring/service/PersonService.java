package com.ty.testspring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.testspring.dao.PersonDao;
import com.ty.testspring.entities.Person;

@Service
public class PersonService {
	@Resource
	private PersonDao personDao;
	@Transactional
	public void save(Person person1,Person person2){
		personDao.save(person1);
		personDao.save(person2);
	}
}
