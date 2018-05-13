package com.matveyenka.dao;

import com.matveyenka.entity.*;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

public class ContactTest extends BaseDaoTest {





    @Test
    public void checkSave() {
        Programmer asdf = new Programmer("asdf", Gender.MALE, Language.RUBY);
        Contact contact = new Contact("234234", asdf);
        save(asdf, contact);

        try (Session session = FACTORY.openSession()) {
            Contact contact1 = session.find(Contact.class, 1);
            Long id = contact1.getEmployee().getId();
            Programmer reference = session.getReference(Programmer.class, id);
            System.out.println();
        }
    }
}
