package br.com.springdockerterraformaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableFeignClients
@SpringBootApplication
public class SpringDockerTerraformAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerTerraformAwsApplication.class, args);
	}

}
