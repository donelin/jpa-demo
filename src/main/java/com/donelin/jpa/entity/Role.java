package com.donelin.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean enbale;
}
