package com.bharath.spring.dependencycheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context4 = new ClassPathXmlApplicationContext("com/bharath/spring/dependencycheck/config.xml");
       
       Prescription emp = (Prescription)context4.getBean("prescription");
       
       System.out.println(emp.toString());
       
    }
}
