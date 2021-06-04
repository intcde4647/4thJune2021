package com.cts.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.demo.model.Company;

public class Main {
public static void main(String args[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	Company comp=(Company)context.getBean("company");
    System.out.println(comp.getNames());

}   
}
