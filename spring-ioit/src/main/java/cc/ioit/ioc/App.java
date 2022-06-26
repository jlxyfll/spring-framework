package cc.ioit.ioc;

import cc.ioit.ioc.config.AppConfigOne;
import cc.ioit.ioc.service.UserService;
import cc.ioit.ioc.config.AppConfig;
import cc.ioit.ioc.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		/**
		 * AbstractApplicationContext#finishBeanFactoryInitialization(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
		 */
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigOne.class);
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService = (UserService) applicationContext.getBean("userService");
		UserService userService = (UserService) applicationContext.getBean(UserServiceImpl.class);
		String userName = userService.getUserName();
		System.out.println(userName);
	}
}
