package com.qoobico.remindme.server.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Configuration
@EnableJpaRepositories("com.qoobico.remindme.server.repository")
@EnableTransactionManagement
@ComponentScan("com.qoobico.remindme.server")
public class DatabaseConfig {

    @Resource
    private Environment env;
}
