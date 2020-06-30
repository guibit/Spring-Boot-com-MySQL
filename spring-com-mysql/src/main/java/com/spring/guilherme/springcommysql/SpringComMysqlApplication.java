package com.spring.guilherme.springcommysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})

@SpringBootApplication(scanBasePackages = "com.spring.guilherme.springcommysql")
@EntityScan(basePackages = "com.spring.guilherme.springcommysql.model")
public class SpringComMysqlApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringComMysqlApplication.class, args);
	}

}
