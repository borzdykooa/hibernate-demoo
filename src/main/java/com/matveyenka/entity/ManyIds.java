package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ManyIds implements Serializable {

    @Column(name = "first_id")
    private Long firstId;

    @Column(name = "second_id")
    private Long secondId;
}
