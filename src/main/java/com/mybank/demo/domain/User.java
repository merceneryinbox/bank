package com.mybank.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", nullable = false, updatable = false)
    public Long userId;

    private String firstName;
    private String lastName;
    
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    private String userName;
    private String password;
    private boolean enabled;
    
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
