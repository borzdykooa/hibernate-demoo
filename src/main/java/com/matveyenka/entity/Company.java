package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"employees"})
@Entity
@Table(name = "company", schema = "employee_storage")
public class Company extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "company", cascade = {CascadeType.ALL})
    private Set<Employee> employees = new HashSet<>();

    public Company(String name) {
        this.name = name;
    }

    public boolean add(Employee employee) {
        return this.employees.add(employee);
    }
}
