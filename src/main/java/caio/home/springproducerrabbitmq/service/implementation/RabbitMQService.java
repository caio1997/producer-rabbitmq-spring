package caio.home.springproducerrabbitmq.service.implementation;

import caio.home.springproducerrabbitmq.amqp.AmqpProducer;
import caio.home.springproducerrabbitmq.dto.Message;
import caio.home.springproducerrabbitmq.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {

        amqp.producer(message);

    }
}
