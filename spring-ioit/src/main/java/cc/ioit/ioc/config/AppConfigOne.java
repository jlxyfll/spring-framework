package cc.ioit.ioc.config;

import cc.ioit.ioc.service.PersonService;
import cc.ioit.ioc.service.UserService;
import cc.ioit.ioc.service.impl.PersonServiceImpl;
import cc.ioit.ioc.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigOne {
	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}
	@Bean
	public PersonService personService() {
		return new PersonServiceImpl();
	}
}
