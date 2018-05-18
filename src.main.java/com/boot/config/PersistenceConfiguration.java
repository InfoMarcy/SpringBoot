package com.boot.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersistenceConfiguration {
//use for adding a dataSource for the application 	
@Bean
@ConfigurationProperties(prefix="spring.datasource")
@Primary // sets the dataSource as primary or default 
public DataSource dataSource(){
	
	return DataSourceBuilder.create().build();
}

// adding a new dataSource
//@Bean
//@ConfigurationProperties(prefix="datasource.flyway")
//@Primary // sets the dataSource as primary or default 
//@FlywayDataSource // allows spring to recognized that this is a flyWay dataSource
//public DataSource flywaydataSource(){
//	
//	return DataSourceBuilder.create().build();
//}
}
