package com.bharath.spring.innerbean;

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
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/innerbean/config.xml");
       
       Employee emp = (Employee)context.getBean("employee");
       
       System.out.println(emp.toString());
       
    }
}
