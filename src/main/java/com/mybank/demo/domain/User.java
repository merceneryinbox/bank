package com.mybank.demo.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Tolerate;

@Data()
public class User {
    
    @NonNull
    public Long uid;
    @NonNull
    private String uname;
    @NonNull
    private String upass;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;
    @NonNull
    private boolean permited;
    @NonNull
    private Account uAccount;
    
}
