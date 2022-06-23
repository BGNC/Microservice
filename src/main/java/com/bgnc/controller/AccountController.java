package com.bgnc.controller;

import com.bgnc.model.Account;
import com.bgnc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable String id){

        return ResponseEntity.ok(accountService.get(id));

    }

    @PostMapping()
    public ResponseEntity<Account> save(@RequestBody Account account){

        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping
    public ResponseEntity<Account> update(@RequestBody Account account){

        return ResponseEntity.ok(accountService.update(account));

    }


    @DeleteMapping
    public void delete(String id){

        accountService.delete(id);
    }
}
