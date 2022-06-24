package com.bgnc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraTemplateFactoryBean;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
@Configuration
public  class CassandraConfiguration extends AbstractCassandraConfiguration {

    @Value("${spcloud.cassandra.keyspace.name}")
    private String keyspaceName;

    @Value("${spcloud.cassandra.contact.point}")
    private String contactPoint;

    @Value("${spcloud.cassandra.port}")
    private int port;

    @Value("${spcloud.cassandra.username}")
    private String username;

    @Value("${spcloud.cassandra.password}")
    private String password;


    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected String getContactPoints() {
        return contactPoint;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.bgnc"};
    }



    @Bean
    @Override
    public CqlSessionFactoryBean cassandraSession() {
        CqlSessionFactoryBean cassandraSession = super.cassandraSession();
        //super session should be called only once
        cassandraSession.setUsername(username);
        cassandraSession.setPassword(password);
        return cassandraSession;
    }




}