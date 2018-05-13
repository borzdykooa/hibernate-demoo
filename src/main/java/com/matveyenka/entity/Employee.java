package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
public abstract class Employee extends BaseEntity<Long> {

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
