package com.bgnc.service;

import com.bgnc.model.Account;

import org.springframework.stereotype.Service;

@Service
public class AccountService {


    public Account get(String id){

        return  new Account("Test-id");

    }
    public Account save(Account account){

        return new Account("Test2-id");
    }
    public Account update(Account account){

        return new Account("Test3-id");

    }


    public void delete(String id){

    }


}
