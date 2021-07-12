package com.example.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Table(name = "db_counter")
public class Account {

    @Column(name = "id")
    private Long id;

    private String name;
    private Date regDate;
    private String model;
    private String brand;
}
