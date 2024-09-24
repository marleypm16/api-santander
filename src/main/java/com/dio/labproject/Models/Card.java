package com.dio.labproject.Models;

import java.math.BigDecimal;

public class Card {
    private Long id;
    private String number;
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
