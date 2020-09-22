package springioc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataResource dataResource=(DataResource) context.getBean("dataResource");
		System.out.println(dataResource);
		
		((ConfigurableApplicationContext)context).close();
	}
}
