package br.com.projetobasico.buildinganapplicationwithspringboot.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest //Estamos iniciando o contexto da aplicação que será utilizado nos testes.
@AutoConfigureMockMvc //Habilita toda a configuração automática para o "MockMvc".
class HelloControllerTest {

    //Para testarmos o controller, deveremos realizar uma requisição e testar vários aspectos dessa e da resposta que será gerada pelo controller.

    @Autowired //Essa anotação permite a realização da injeção de dependências.
    private MockMvc mvc; //Ao utilizarmos um "MockMvc", podemos testar vários aspectos da requisição, como o status HTTP retornado, os dados retornados no header, o conteúdo retornado pela requisição, dentre outros.

    @Test //Estamos explicitando que o método abaixo pode ser executado como um teste.
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/") //O método "perform()" executa uma requisição, nesse caso, uma requisição do tipo "GET", após isso, efetua algumas verificações com os valores dessa requisição.
                .accept(MediaType.APPLICATION_JSON)) //Definindo que essa requisição vai aceitar apenas valores no formato "JSON".
                .andExpect(status().isOk()) //Essa requisição está esperando o status HTTP "200", que é "OK".
                .andExpect(content().string(Matchers.equalTo("Greetings from Spring Boot!"))); //Além de esperar os testes acima, essa requisição também espera um texto, do tipo "String", cujo valor será "Greetings from Spring Boot!". Não deveremos colocar textos com acentos pois um erro de codificação, que eu não consegui resolver, será gerado.
    }
}