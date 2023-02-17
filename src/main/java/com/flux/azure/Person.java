package com.flux.azure;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data

public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private String sal;

}
