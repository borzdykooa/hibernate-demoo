package com.matveyenka;

import com.matveyenka.entity.*;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;
import java.util.Set;

public class ApplicationDemo {

    /**
     *  fatal -> error -> warn -> info -> debug
     *
     * @param args
     */
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();

//            Employee employee = session.find(Employee.class, 3L);
//            Meeting meeting = session.find(Meeting.class, 1L);

//            EmployeeMeeting employeeMeeting = new EmployeeMeeting(employee, meeting, LocalDateTime.now());
//            session.save(employeeMeeting);

            session.getTransaction().commit();
        }

    }

//    private static void test2(Session session) {
//        Employee employee = session.find(Employee.class, 3L);
//        Contact contact = new Contact("412341234", "12341234", employee);
//        session.save(contact);
//    }
//
//    private static void test(Session session) {
//        Company godel = new Company("Godel");
//        session.save(godel);
//
////        Employee employee = new Employee("Ivan", Gender.MALE, godel);
////        session.save(employee);
//    }
}
