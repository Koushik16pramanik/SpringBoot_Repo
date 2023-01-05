package org.anudip;

import org.anudip.pojo.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("-------------dependency pulling/searching---------------");
    	System.out.println("--------------setter approach--------------");
    	Student s1= new Student();
        System.out.println(s1);
        s1.setId(10);
        s1.setName("Koushik");
        System.out.println(s1);
        System.out.println("-----------------constructor approch-------------");
        Student s2 = new Student(12, "akash");
        System.out.println(s2);
    }
}
