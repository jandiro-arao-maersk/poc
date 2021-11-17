/* POC: Spring State Machine -> https://spring.io/projects/spring-statemachine
 * Author: Jandiro Arao
 * Projeto: Regulatory Afairs
 * Observação: Ter instalado o lombok -> https://projectlombok.org/download
 * Usar o PaymentServiceImplTest com o JUnit para rodar os testes.
 * 
 * */

package br.com.goaheadtech.statemachine.model;

import br.com.goaheadtech.statemachine.enums.PaymentState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
//Objeto de Pagamento que vai persistir no DB.
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue
    private Long id;
//Buscar o estado
    @Enumerated(EnumType.STRING)//String para que vc receba um varchar ao invés de um numero.
    private PaymentState state;
//buscar a quantidade
    private BigDecimal amount;
}
