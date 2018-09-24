package com.mybank.demo.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TransactionMy {
    private Long id;
    private Date date;
    private String discription;
    private String type;
    private double amount;
    private BigDecimal availableMoney;
    
    public TransactionMy() {
    
    }
}
