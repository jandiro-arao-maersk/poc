/* POC: Spring State Machine -> https://spring.io/projects/spring-statemachine
 * Author: Jandiro Arao
 * Projeto: Regulatory Afairs
 * Observação: Ter instalado o lombok -> https://projectlombok.org/download
 * Usar o PaymentServiceImplTest com o JUnit para rodar os testes.
 * 
 * */
package br.com.goaheadtech.statemachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateMachineApplication {

    public static void main(String[] args) {
        SpringApplication.run(StateMachineApplication.class, args);
    }

}
