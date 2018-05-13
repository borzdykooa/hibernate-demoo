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
@Table(name = "multiple", schema = "employee_storage")
public class Multiple {

    @EmbeddedId
    @Column(unique = true, nullable = false)
    private ManyIds id;

    @Column(name = "name")
    private String name;
}
