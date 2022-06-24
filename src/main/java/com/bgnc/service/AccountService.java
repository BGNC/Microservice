package com.bgnc.service;

import com.bgnc.model.Account;

import com.bgnc.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class AccountService {

    private  AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public Account get(String id){

        return  accountRepository.findById(id).orElseThrow(()-> new IllegalArgumentException());

    }
    public Account save(Account account){

        return accountRepository.save(account);
    }
    public Account update(String id ,Account account){

        Assert.isNull(id,"Id could not be null");
        return accountRepository.save(account);

    }


    public void delete(String id){

        accountRepository.deleteById(id);

    }


}
