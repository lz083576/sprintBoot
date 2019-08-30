package com.jpa.domain;

import lombok.Data;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Source;
import org.hibernate.annotations.SourceType;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "goods")
@Proxy(lazy = false)
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "stock")
    private int stock;

    @Version //版本控制注解
    @Column(name = "gmt_modified", columnDefinition = "timestamp")//注解列名和列类型
    @Source(value = SourceType.DB) //注解值来自数据库
    private Timestamp gmtModified;

}

