/* POC: Spring State Machine -> https://spring.io/projects/spring-statemachine
 * Author: Jandiro Arao
 * Projeto: Regulatory Afairs
 * Observação: Ter instalado o lombok -> https://projectlombok.org/download
 * Usar o PaymentServiceImplTest com o JUnit para rodar os testes.
 * 
 * */
package br.com.goaheadtech.statemachine.enums;

//aqui colocamos os estados a serem percorridos durante o processo. Usamos esse arquivo e o de eventos para configurar a maquina de estado.
public enum PaymentState {
    NEW, PRE_AUTH, PRE_AUTH_ERROR, AUTH, AUTH_ERROR
}
