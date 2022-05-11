package com.example.demo.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private BigDecimal balance;

    @ManyToOne
    private User account;

    public Account(){}

    public Account(BigDecimal balance, User account) {
        this.balance = balance;
        this.account = account;
    }
}
