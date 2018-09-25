package com.mybank.demo.domain;


import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {
    private Long id;
    private int accountNumber;
    private BigDecimal balance;

    private List<SavingsTransaction> savingsTransactionList;
}
