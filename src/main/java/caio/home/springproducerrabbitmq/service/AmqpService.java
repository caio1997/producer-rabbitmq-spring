package caio.home.springproducerrabbitmq.service;

import caio.home.springproducerrabbitmq.dto.Message;

public interface AmqpService {

    void sendToConsumer(Message message);

}
