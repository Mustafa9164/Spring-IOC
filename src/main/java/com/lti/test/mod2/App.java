package com.lti.test.mod2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        
        BeanFactory bf=new ClassPathXmlApplicationContext("com/lti/test/mod2/config2.xml");
        
        Employee emp = bf.getBean("myEMp",Employee.class);
        System.out.println(emp.getNames());
        System.out.println( "Project Ended!" );
    }
}
