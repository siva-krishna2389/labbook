package com.cg.lab1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.cg.lab1.beans.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app=new App();
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	Employee employee=context.getBean(Employee.class);
    	app.display(employee);
    	
    }
    public void display(Employee employee) {
    	System.out.println(employee.getEmployeeName()+"-"+employee.getEmployeeId()+"-"+employee.getSalary()+"-"+employee.getBusinessunit()+"-"+employee.getAge());
    }
}
