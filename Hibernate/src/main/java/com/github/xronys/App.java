package com.github.xronys;

import com.github.xronys.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Igor", "Kosachev", "IT", 100_000);
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
        }
        catch (Exception e) {
        }

    }
}
