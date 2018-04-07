package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main (String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}
