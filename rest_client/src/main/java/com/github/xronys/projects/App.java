package com.github.xronys.projects;

import com.github.xronys.projects.configuration.Config;
import com.github.xronys.projects.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);

   /*     List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee empById = communication.getEmployee(1);
        System.out.println(empById);

        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
        emp.setId(6);
        communication.saveEmployee(emp);

        communication.deleteEmployee(6);*/


    }
}
