package co.com.globant.validateaccount.resource;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class ProducerResource {

    private JmsTemplate jmsTemplate;
    private Queue queue;

    public ProducerResource(JmsTemplate jmsTemplate, Queue queue) {
        this.jmsTemplate = jmsTemplate;
        this.queue = queue;
    }

    public String sendMessageToQueue(String message){
        jmsTemplate.convertAndSend(queue, message);
        return "The message was send successfull";
    }

}
