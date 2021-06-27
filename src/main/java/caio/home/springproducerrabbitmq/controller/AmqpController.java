package caio.home.springproducerrabbitmq.controller;

import caio.home.springproducerrabbitmq.dto.Message;
import caio.home.springproducerrabbitmq.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rabbitmq")
public class AmqpController {

    @Autowired
    private AmqpService amqpService;

    @PostMapping
    public void sendMessage(@RequestBody Message message) {

     amqpService.sendToConsumer(message);

    }

}
