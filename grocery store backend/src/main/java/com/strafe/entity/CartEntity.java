package com.strafe.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "carts")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private long productId;
    private int quantity;
}
