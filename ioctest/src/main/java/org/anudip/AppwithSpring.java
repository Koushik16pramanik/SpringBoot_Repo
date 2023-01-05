package org.anudip;

import org.anudip.pojo.Student;
import org.anudip.pojo.StudentDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppwithSpring {

	public static void main(String[] args) {
		
		System.out.println("----------in main-----------");
		ApplicationContext app = new ClassPathXmlApplicationContext("Pallabi.xml");
		Student ss= (Student) app.getBean("x");
		System.out.println(ss);
		System.out.println("---------------------------");
		
		Student ss2= (Student) app.getBean("y");
		System.out.println(ss2);
		
		StudentDetails ss3= (StudentDetails) app.getBean("z");
		System.out.println(ss3);

	}

}
