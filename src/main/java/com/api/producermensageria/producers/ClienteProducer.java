package com.api.producermensageria.producers;

import com.api.producermensageria.dtos.Cliente;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClienteProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.queue}")
    private String queue;

    public void produzirMensagem(Cliente cliente){

        /**Envio para fila em formato de Bytes*/
        /**Message message = new Message(cliente.toString().getBytes());
        rabbitTemplate.send(queue, message);
         */

        /**Envio via conversão para json (configurar os beans em configs)*/
        rabbitTemplate.convertAndSend(queue, cliente);

    }

}
