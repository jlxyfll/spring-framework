package cc.ioit.ioc.service.impl;

import cc.ioit.ioc.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class UserServiceImpl implements UserService , InitializingBean {
	@Override
	public String getUserName() {
		return "Hello World";
	}

	public UserServiceImpl() {
		System.out.println("class is \n" + "initialized");
	}

	@PostConstruct
	public void init() {
		System.out.println("bean is initialized");
	}


	public void afterPropertiesSet() {
		System.out.println("UserServiceImpl afterPropertiesSet...");
	}

	public void setPersonService(PersonServiceImpl personService) {
	}
}
