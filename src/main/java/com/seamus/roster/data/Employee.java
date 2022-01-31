package com.seamus.roster.data;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;

    @ManyToOne
    private Business business;

    @OneToMany(mappedBy = "employee")
    private List<Shift> shifts;

    @Override
    public String toString() {
        return String.format("Employee[id=%d, userId=%s, businessId=%s]", id, user.toString(), business.toString());
    }
}
