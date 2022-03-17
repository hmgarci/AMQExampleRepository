package co.com.globant.validateaccount.service;

import co.com.globant.validateaccount.resource.ProducerResource;
import org.springframework.stereotype.Service;

@Service
public class ValidateAccountService {

    private ProducerResource producerResource;

    public ValidateAccountService(ProducerResource producerResource) {
        this.producerResource = producerResource;
    }

    public String validateAccount(String message){
        return producerResource.sendMessageToQueue(message);
    }
}
