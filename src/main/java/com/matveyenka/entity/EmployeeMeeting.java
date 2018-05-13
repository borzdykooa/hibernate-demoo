package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "employee_meeting", schema = "employee_storage")
public class EmployeeMeeting extends BaseEntity<Long> {

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @Column(name = "meeting_date")
    private LocalDateTime meetingDate;
}
