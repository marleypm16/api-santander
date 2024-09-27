package com.dio.labproject.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column(nullable = false,unique = true)
    private String number;
    @Column(nullable = false)
    private String agency;
    @Column(precision = 2, scale = 2)
    private BigDecimal balance;
    @Column(name = "addtional_limit",precision = 2, scale = 2)
    private BigDecimal limit;



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
