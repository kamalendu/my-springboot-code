package com.selfstudy.springboot.myspringbootcode.config;

import com.mongodb.MongoClient;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Configuration
@EnableMongoRepositories(basePackages = "com.selfstudy.springboot.myspringbootcode.nosql_model")
public class MongoDBConfig extends AbstractMongoConfiguration {

    @Override
    public MongoClient mongoClient() {
        return new MongoClient("localhost",27017);
    }

    @Override
    protected String getDatabaseName() {
        return "spring_code_mongo";
    }
    
}