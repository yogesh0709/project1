package com.bharath.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       
       Employee emp = (Employee)context.getBean("employee");
       
       System.out.println(emp.toString());
    }
}
