package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "db_counter")
public class DbCount {
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private Integer name;

    @Column(name = "regDate")
    private Integer regDate;

    @Column(name = "model")
    private Integer model;

    @Column(name = "brand")
    private Integer brand;
}
