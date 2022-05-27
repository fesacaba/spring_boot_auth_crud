package br.com.auth.http.v1;

import br.com.auth.http.domain.request.SendPinRequest;
import br.com.auth.http.domain.request.ValidPinRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/pin")
@Api(tags = "Pin", produces = APPLICATION_JSON_VALUE)
public class PinWS {


    @ApiOperation(value = "Send Pin")
    @PostMapping(path = "/send", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void send(@RequestBody SendPinRequest request) {
        log.info("****[CONTROLLER - PinWS - send()]****");
        log.info(request.toString());
    }

    @ApiOperation(value = "Valid Pin")
    @PostMapping(path = "/valid", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity valid(@RequestBody ValidPinRequest request) {
        log.info("****[CONTROLLER - PinWS - valid()]****");
        log.info(request.toString());
        if (!request.getPin().equals("111111")) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
