package com.example.demo.services;

import com.example.demo.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService{
    private final AccountRepository accountRepository;

    @Override
    public void withdrawMoney(BigDecimal amount, Long id) {

    }

    @Override
    public void transferMoney(BigDecimal amount, Long id) {

    }

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository=accountRepository;
    }
}
