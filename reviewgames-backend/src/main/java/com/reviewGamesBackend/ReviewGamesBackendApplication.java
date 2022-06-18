package com.reviewGamesBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages={ "com.*" })
@EnableTransactionManagement
@EntityScan({ "com.*" })
@ComponentScan({ "com.*" })
@EnableJpaRepositories("com.repository")
public class ReviewGamesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewGamesBackendApplication.class, args);
	}

}
