package com.seamus.roster.data;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    private User owner;
    @OneToMany(mappedBy = "business")
    private List<Employee> employees;

    @Override
    public String toString() {
        return String.format("Business[id=%d, name=%s, owner=%s]", id, name, owner);
    }
}
