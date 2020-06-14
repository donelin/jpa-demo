package com.donelin.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_user_role")
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long roleId;

}
