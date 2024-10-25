package com.lti.test.mod10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.lti.test.mod9.ConfigurationClass;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Student s1 = ac.getBean("student", Student.class);
        System.out.println(s1);
        
        System.out.println( "Project Ended!" );
    }
}
