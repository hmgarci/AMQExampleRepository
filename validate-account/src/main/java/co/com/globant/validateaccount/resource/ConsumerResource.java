package co.com.globant.validateaccount.resource;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ConsumerResource {

    Logger logger = Logger.getLogger("ConsumerResource");

    @JmsListener(destination = "validate-account.queue")
    public void consumeMessageToQueue(String message){
        logger.info("---------- The message from the queue is: " .concat(message).concat("----------------"));
    }
}
