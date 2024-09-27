package com.dio.labproject.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(nullable = false, unique = true)
    private String number;

    @Column(name = "avaible_limit",precision = 2, scale = 2)

    private BigDecimal limit;



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Number getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
