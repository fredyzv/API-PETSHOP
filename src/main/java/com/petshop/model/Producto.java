package com.petshop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="producto")
public class Producto {

    @Id
    private int cod_prod;
    private int cod_cate;
    private String desc_prod;
    private double precio;
    private int stock;
    private int cod_est;
    private String img;
}
