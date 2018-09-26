package com.mybank.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String location;
    private String discription;
    private boolean confirmed;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
}
