package com.matveyenka.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseEntity<PK extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(generator = "employee_seq", strategy = GenerationType.SEQUENCE)
//    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq_id",
//            schema = "employee_storage", allocationSize = 1)
    private PK id;
}
