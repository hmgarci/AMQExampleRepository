package co.com.globant.validateaccount.controller;
import co.com.globant.validateaccount.service.ValidateAccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidaAccountController {

    private ValidateAccountService validateAccountService;

    public ValidaAccountController(ValidateAccountService validateAccountService) {
        this.validateAccountService = validateAccountService;
    }

    @PostMapping("/validate-account")
    public String validateAccount(@RequestBody String request){
        return validateAccountService.validateAccount(request);
    }
}
