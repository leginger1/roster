package com.seamus.roster.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long businessId;

    @Override
    public String toString() {
        return String.format("Employee[id=%d, userId=%d, businessId=%id]", id, userId, businessId);
    }
}
