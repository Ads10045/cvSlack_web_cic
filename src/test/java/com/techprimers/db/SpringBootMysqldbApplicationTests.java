package com.techprimers.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.techprimers.db.model.Users;
import com.techprimers.db.resource.UsersResource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMysqldbApplicationTests {

	UsersResource service;
	
	
	@Test
	public void contextLoads() {
		
		
		
		Users user = new Users();
		service.persist(user);
		
	}

}
