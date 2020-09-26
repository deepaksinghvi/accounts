package com.biz.accounts.api;

import com.biz.accounts.domain.*;
import com.biz.accounts.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController

public class AccountController {

    @Autowired
    private AccountService accountService;


    @PostMapping(value = "/account", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        return new ResponseEntity(accountService.createAccount(account), HttpStatus.CREATED);
    }

    @GetMapping(value = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Account>> getAccounts() {
        return new ResponseEntity(accountService.getAccounts(), HttpStatus.OK);
    }

    @GetMapping(value = "/account/{tenantId}/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Account> getTenant(@PathVariable String tenantId, @PathVariable  String accountId) {
        return new ResponseEntity(accountService.getAccount(tenantId, accountId), HttpStatus.OK);
    }

}
