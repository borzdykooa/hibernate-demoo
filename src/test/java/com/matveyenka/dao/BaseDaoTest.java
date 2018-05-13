package com.matveyenka.dao;

import com.matveyenka.entity.BaseEntity;
import org.hamcrest.core.IsCollectionContaining;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertNotNull;

public class BaseDaoTest {

    protected static final SessionFactory FACTORY = new Configuration().configure().buildSessionFactory();

    @AfterClass
    public static void after() {
        FACTORY.close();
    }

    public <T extends BaseEntity<?>> void save(T... object) {
        try (Session session = FACTORY.openSession()) {
            session.beginTransaction();

            Arrays.asList(object).forEach(it -> {
                session.persist(it);
                assertNotNull("Entity is not saved", it.getId());
            });

            session.getTransaction().commit();
        }
    }
}
