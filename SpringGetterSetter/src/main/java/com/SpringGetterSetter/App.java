package com.SpringGetterSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.entity.Student;

public class App {
    public static void main( String[] args ) {
       ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
       //Resource res = new ClassPathResource("applicationContext.xml"); 
	   //BeanFactory b = new XmlBeanFactory(res);
       Student s = (Student) c.getBean("studentdetails");
       s.display();
    }
}
