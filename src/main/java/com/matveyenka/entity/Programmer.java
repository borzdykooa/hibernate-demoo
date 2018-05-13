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
@DiscriminatorValue("PROGRAMMER")
public class Programmer extends Employee {

    @Column(name = "language")
    @Enumerated(EnumType.STRING)
    private Language language;

    public Programmer(String name, Gender gender, Language language) {
        super(name, gender);
        this.language = language;
    }
}
