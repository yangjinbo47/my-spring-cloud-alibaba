package com.anqing.myspringcloudalibaba.order.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/13
 * @Author: BOBO
 * @Description:
 */
@Entity
@Table(name="t_order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 255)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
