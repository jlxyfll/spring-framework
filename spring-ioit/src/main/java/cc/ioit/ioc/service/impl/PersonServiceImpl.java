package cc.ioit.ioc.service.impl;

import cc.ioit.ioc.service.PersonService;

public class PersonServiceImpl implements PersonService {
	@Override
	public String getUserName() {
		return "Person";
	}

	public void setUserService(UserServiceImpl userService) {

	}
}
