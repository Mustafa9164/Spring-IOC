package com.lti.test.mod1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        
        BeanFactory bf=new ClassPathXmlApplicationContext("com/lti/test/mod1/config1.xml");
        Student std = (Student) bf.getBean("myStudent");
        Student std2 = (Student) bf.getBean("myStudent2");
        
        System.out.println(std);
        System.out.println(std2);
        
        
        System.out.println( "Project Ended!" );
    }
}
