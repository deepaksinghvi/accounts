package com.biz.accounts.service;

import com.biz.accounts.domain.*;

import java.util.*;

public interface AccountService {
    public Account createAccount(Account account);
    public Optional<Account> getAccount(String tenantId, String accountId);
    public List<Account> getAccounts();

}
