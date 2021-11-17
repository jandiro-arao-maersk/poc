/* POC: Spring State Machine -> https://spring.io/projects/spring-statemachine
 * Author: Jandiro Arao
 * Projeto: Regulatory Afairs
 * Observação: Ter instalado o lombok -> https://projectlombok.org/download
 * Usar o PaymentServiceImplTest com o JUnit para rodar os testes.
 * 
 * */

package br.com.goaheadtech.statemachine.repository;

import br.com.goaheadtech.statemachine.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

//Essa classe configura o springdata  JPA Repository (nos dá acesso a camada de persistencia)
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
