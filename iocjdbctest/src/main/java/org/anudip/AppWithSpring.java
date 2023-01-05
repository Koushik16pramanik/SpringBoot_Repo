package org.anudip;

import org.anudip.pojo.MyJdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppWithSpring {

	public static void main(String[] args) {

		System.out.println("--------in main-------------");
		ApplicationContext app = new ClassPathXmlApplicationContext("pallabi.xml");
//		Student ss = (Student) app.getBean("x");
//		System.out.println(ss);
//		ss.call();
//
//		System.out.println("------------------");
//
//		Student ss2 = (Student) app.getBean("y");
//		System.out.println(ss2);
//
//		StudentDetails ss3 = (StudentDetails) app.getBean("z");
//		System.out.println(ss3);
//		System.out.println(ss3.getName() + " stays in the city " + ss3.getAddr().getCity()
//				+ " and stays in the country " + ss3.getAddr().getCountry());

		MyJdbc mb = (MyJdbc) app.getBean("mb2");
		mb.createTable();

	}

}
