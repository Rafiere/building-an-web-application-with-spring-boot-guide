package br.com.projetobasico.buildinganapplicationwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Essa tag possui as tags "@Configuration", que define essa classe como um bean de definições para o application context, "@EnableAutoConfiguration", que diz para o Spring Boot adicionar beans baseados na configuração do classpath e "@ComponentScan", que diz para o Spring procurar por outros componentes, configurações e serviços, ou seja, scannear o projeto.
public class BuildingAnApplicationWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildingAnApplicationWithSpringBootApplication.class, args); //Serve para iniciar a aplicação.
	}

}
