package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "users", schema = "employee_storage")
public class User extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;
}
