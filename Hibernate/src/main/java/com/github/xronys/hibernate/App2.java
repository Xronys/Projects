package com.github.xronys.hibernate;

import com.github.xronys.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App2
{
    public static void main( String[] args )
    {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Petr", "Petrov", "IT", 100_000);
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
        }
        catch (Exception e) {
        }
    }
}
