package com.mybank.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class PrimaryTransaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private Date date;
    private String discriprion;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;
    
    @ManyToOne
    @JoinColumn(name = "primary_account_id")
    private PrimaryAccount primaryAccount;
    
    public PrimaryTransaction() {
    
    }
    
    public PrimaryTransaction(Long id, Date date, String discriprion, String type, String status, double amount,
                              BigDecimal availableBalance, PrimaryAccount primaryAccount) {
        
        this.id = id;
        this.date = date;
        this.discriprion = discriprion;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.primaryAccount = primaryAccount;
    }
}
