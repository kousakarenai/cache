package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class category implements Serializable {
    private Long id;
    private Integer type;
}
