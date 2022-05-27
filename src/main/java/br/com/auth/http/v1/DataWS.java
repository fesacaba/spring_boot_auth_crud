package br.com.auth.http.v1;

import br.com.auth.http.domain.response.ResponseDataInit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/data")
@Api(tags = "Make", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class DataWS {


    @ApiOperation(value = "Init data")
    @GetMapping(path = "/init-data/{id}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseDataInit initData(
            @PathVariable("id") @ApiParam(example = "100") String id
    ) {
        log.info("****[CONTROLLER - DataWS - initData()]****");

        return ResponseDataInit
                .builder()
                .id(id)
                .name("Felipe de Castro")
                .showFatca(true)
                .showAccountTerm(true)
                .phoneNumber("11".concat("972026904"))
                .limit(new BigDecimal("100"))
                .build();
    }
}
