package br.com.auth.http.v1;

import br.com.auth.http.domain.request.AccountRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/account")
@Api(tags = "Account", produces = APPLICATION_JSON_VALUE)
public class AccountWS {


    @ApiOperation(value = "Create Account")
    @PostMapping(path = "/create-account", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void createAccount(@RequestBody AccountRequest request) {
        log.info("****[CONTROLLER - AccountWS - createAccount()]****");
        log.info(request.toString());
    }
}
