package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employee {

    @Column(name = "project_name")
    private String projectName;

    public Manager(String name, Gender gender, String projectName) {
        super(name, gender);
        this.projectName = projectName;
    }
}
