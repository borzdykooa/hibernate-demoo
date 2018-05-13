package com.matveyenka.dao;

import com.matveyenka.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

public class EmployeeDaoTest extends BaseDaoTest {
//
//    @AfterClass
//    public static void after() {
//        FACTORY.close();
//    }
//
//    @Before
//    public void clean() {
//        try (Session session = FACTORY.openSession()) {
//            session.beginTransaction();
//            session.createQuery("delete from Employee").executeUpdate();
//            session.getTransaction().commit();
//        }
//    }
//
//    @Test
//    public void checkSaveEntity() {
//        Employee ivan = new Employee("Ivan", Gender.MALE, new Address(), new Address());
//        try (Session session = FACTORY.openSession()) {
//            Serializable employeeId = session.save(ivan);
//            assertNotNull("Id is null", employeeId);
//        }
//    }
//
//    @Test
//    public void checkFindEmployee() {
//        Employee petr = new Employee("Petr", Gender.MALE, new Address(), new Address());
//        try (Session session = FACTORY.openSession()) {
//            Serializable employeeId = session.save(petr);
//            assertNotNull("Id is null", employeeId);
//
//            Employee employee = session.find(Employee.class, employeeId);
//            assertNotNull("Entity is null!", employee);
//        }
//    }

    @Test
    public void checkSaveEntity() {
        save(new Qa("adf", Gender.MALE, "adsf"));
    }

    @Test
    public void testQaSaving() {
        User ivan = new User("Ivan");
        Qa qa = new Qa("Test", Gender.MALE, "TestS", ivan);
        save(qa);
    }

    @Test
    public void test() {
        try (Session session = FACTORY.openSession()) {
            session.beginTransaction();
            Manager svate = new Manager("Svate", Gender.FEMALE, "First Project");
            session.save(svate);

            Programmer ivan = new Programmer("Ivan", Gender.MALE, Language.JAVA);
            session.save(ivan);

            Qa qa = new Qa("Max", Gender.MALE, "Ivanov");
            session.save(qa);

            session.getTransaction().commit();
        }

        try (Session session = FACTORY.openSession()) {
            List<Employee> list = session.createQuery("select e from Employee e", Employee.class).list();
            System.out.println();
        }
    }
}
