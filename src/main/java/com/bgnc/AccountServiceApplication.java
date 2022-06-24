package com.bgnc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

import java.io.Serializable;

@SpringBootApplication
public class AccountServiceApplication implements Serializable {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }


}
