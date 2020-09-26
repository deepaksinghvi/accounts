package com.biz.accounts.service;

import com.biz.accounts.domain.*;
import com.biz.accounts.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository repository;

    @Override
    public Account createAccount(Account account) {
        return repository.saveAndFlush(account);
    }

    @Override
    public Optional<Account> getAccount(String tenantId, String accountId) {
        return repository.findAccount(tenantId,accountId);
    }

    @Override
    public List<Account> getAccounts() {
        return repository.findAll();
    }
}
