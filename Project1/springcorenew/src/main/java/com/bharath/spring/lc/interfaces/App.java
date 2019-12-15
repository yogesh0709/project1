package com.bharath.spring.lc.interfaces;

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
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       
       Patient emp = (Patient)context.getBean("patientint");
       
       context.registerShutdownHook();
       
    }
}
