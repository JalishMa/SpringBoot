package com.bob.springbootdata.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table( name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String password;



}
