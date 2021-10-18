package br.com.projetobasico.buildinganapplicationwithspringboot.controller;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //O servidor está começando em uma porta aleatória.
public class HelloControllerIntegrationTest {

    @Autowired //Estamos fazendo a injeção de dependência via "@Autowired".
    private TestRestTemplate template; //Esse template é resistente a falhas, dessa forma, erros HTTP com o código "4xx" e "5xx" não gerarão exceptions e poderão ser detectados através do "ResponseEntity".

    @Test //Anotação que indica que esse método será um teste.
    public void getHello() { //Método que testará o controller.
        ResponseEntity<String> response = template.getForEntity("/", String.class); //O objeto "response" armazenará a resposta do controller quando enviarmos uma requisição do tipo "GET" para a URI "/".
        Assertions.assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!"); //O teste passará se o texto que vier dentro da resposta for igual a "Greetings from Spring Boot!".
    }

}
