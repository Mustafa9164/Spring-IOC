package com.lti.test.mod4;

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
        
        BeanFactory bf=new ClassPathXmlApplicationContext("com/lti/test/mod4/config4.xml");
        
        Person person = bf.getBean("myPerson", Person.class);
        System.out.println(person);
        System.out.println( "Project Ended!" );

    }
}
