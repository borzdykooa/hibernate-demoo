package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "meeting", schema = "employee_storage")
public class Meeting extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "meetings")
    private Set<Employee> employees = new HashSet<>();
}
