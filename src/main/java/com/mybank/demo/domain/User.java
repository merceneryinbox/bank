package com.mybank.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", nullable = false, updatable = false)
    @NonNull
    public Long uid;

    private String firstName;
    private String lastName;
    
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    private String userName;
    private String password;
    private boolean permited;
    
    @OneToOne
    private PrimaryAccount primaryAccount;
    
    @OneToOne
    private SavingsAccount savingsAccount;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Appointment> appointmentList;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Recipient> recipientList;
}
