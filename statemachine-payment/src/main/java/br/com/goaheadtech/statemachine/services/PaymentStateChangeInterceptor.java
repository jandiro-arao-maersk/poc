/* POC: Spring State Machine -> https://spring.io/projects/spring-statemachine
 * Author: Jandiro Arao
 * Projeto: Regulatory Afairs
 * Observação: Ter instalado o lombok -> https://projectlombok.org/download
 * Usar o PaymentServiceImplTest com o JUnit para rodar os testes.
 * 
 * */

package br.com.goaheadtech.statemachine.services;

import br.com.goaheadtech.statemachine.model.Payment;
import br.com.goaheadtech.statemachine.enums.PaymentEvent;
import br.com.goaheadtech.statemachine.enums.PaymentState;
import br.com.goaheadtech.statemachine.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.StateMachineInterceptorAdapter;
import org.springframework.statemachine.transition.Transition;
import org.springframework.stereotype.Component;

import java.util.Optional;


@RequiredArgsConstructor
@Component
public class PaymentStateChangeInterceptor extends StateMachineInterceptorAdapter<PaymentState, PaymentEvent> {

    private final PaymentRepository paymentRepository;

    @Override
    public void preStateChange(State<PaymentState, PaymentEvent> state, Message<PaymentEvent> message,
                               Transition<PaymentState, PaymentEvent> transition, StateMachine<PaymentState, PaymentEvent> stateMachine) {

        Optional.ofNullable(message).ifPresent(msg -> {
            Optional.ofNullable(Long.class.cast(msg.getHeaders().getOrDefault(PaymentServiceImpl.PAYMENT_ID_HEADER, -1L)))
                    .ifPresent(paymentId -> {
                        Payment payment = paymentRepository.getOne(paymentId);
                        payment.setState(state.getId());
                        paymentRepository.save(payment);
                    });
        });
    }
}
