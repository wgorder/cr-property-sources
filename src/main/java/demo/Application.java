package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		context.registerShutdownHook();
		Environment environment = context.getBean(Environment.class);
		System.out.println(environment.getProperty("user.home"));
		System.out.println(environment.getProperty("my.property"));
		MyBean myBean = context.getBean(MyBean.class);
		System.out.println(myBean.getUsername());
	}
}
