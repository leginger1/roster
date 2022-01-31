package com.seamus.roster.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;

    @OneToOne
    private Business business;

    @Override
    public String toString() {
        return String.format("Employee[id=%d, userId=%d, businessId=%id]", id, user.toString(), business.toString());
    }
}
