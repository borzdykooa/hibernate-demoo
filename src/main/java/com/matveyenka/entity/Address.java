package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class Address {

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;
}
