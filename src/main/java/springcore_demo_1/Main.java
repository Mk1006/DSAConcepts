package springcore_demo_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		try {
			context = new ClassPathXmlApplicationContext("beans.xml");
			HelloBean hlw = (HelloBean) context.getBean("HelloBean");
			hlw.sayHello();
		} 
		catch (Exception e) {
			System.out.println("Exception occured!!!");
			System.out.println(e);
		}
	}
}
