package com.SpringJdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic
{
	public static void main(String args[])
	{
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		CreateTable st =(CreateTable)factory.getBean("id3");
		st.createTable1();
	}
}