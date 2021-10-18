package br.com.projetobasico.buildinganapplicationwithspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Essa anotação explicita que essa classe está pronta para trabalhar com o Spring MVC e receber requisições web.
public class HelloController {

    @GetMapping("/") //Quando esse método for chamado, através de uma requisição GET na URL "http://127.0.0.1:8080/", será retornada apenas essa String para o corpo da requisição GET.
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
