package com.mybank.demo.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Account {
    private Long id;
    private int accountNumber;
    private BigDecimal balance;
    
    private List<TransactionMy> transactionMyList;
}
