package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@SecondaryTable(name = "qa", schema = "employee_storage")
@DiscriminatorValue("QA")
public class Qa extends Employee {

    @Column(table = "qa", name = "surname")
    private String surname;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    public Qa(String name, Gender gender, String surname) {
        super(name, gender);
        this.surname = surname;
    }

    public Qa(String name, Gender gender, String surname, User user) {
        super(name, gender);
        this.surname = surname;
        this.user = user;
    }
}
