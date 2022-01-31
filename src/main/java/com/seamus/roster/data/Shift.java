package com.seamus.roster.data;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Employee employee;
    private Timestamp startTime;
    private Timestamp endTime;
    private String notes;

    @Override
    public String toString() {
        return String.format("Shift[id=%d, employee=%s, startTime=%s, endTime=%s, notes='%s'", id, employee.toString(), startTime.toString(), endTime.toString(), notes);
    }
}
