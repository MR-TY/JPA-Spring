package com.ty.testspring;




import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.testspring.entities.Person;
import com.ty.testspring.service.PersonService;

public class TestSpring {
	private ApplicationContext applicationContext;
	private PersonService personService;
	{
		applicationContext = new ClassPathXmlApplicationContext("applicationContex.xml");
		personService = applicationContext.getBean(PersonService.class);
	}
	@Test
	public void test() {
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		System.out.println(dataSource);
	}
	@Test
	public void test1(){
		Person person = new Person();
		person.setAge(1);
		person.setEmail("@123");
		person.setLastName("yu");
		
		Person person1 = new Person();
		person1.setAge(12);
		person1.setEmail("@1234");
		person1.setLastName("hu");
		
		personService.save(person, person1);
	}
}
