/* POC: Spring State Machine -> https://spring.io/projects/spring-statemachine
 * Author: Jandiro Arao
 * Projeto: Regulatory Afairs
 * Observação: Ter instalado o lombok -> https://projectlombok.org/download
 * Usar o PaymentServiceImplTest com o JUnit para rodar os testes.
 * 
 * */
package br.com.goaheadtech.statemachine.enums;

//aqui colocamos os eventos que provocam a mudança de estado da maquina
public enum PaymentEvent {
    PRE_AUTHORIZE, PRE_AUTH_APPROVED, PRE_AUTH_DECLINED, AUTHORIZE, AUTH_APPROVED, AUTH_DECLINED
}
