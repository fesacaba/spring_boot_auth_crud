package br.com.auth.http.v1;

import br.com.auth.http.domain.request.MakeRequest;
import br.com.auth.http.domain.response.MakeResponse;
import br.com.auth.usecase.MakeUseCase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/make")
@Api(tags = "Make", produces = APPLICATION_JSON_VALUE)
public class MakeController {

    @Autowired
    private MakeUseCase makeUseCase;


    @GetMapping("/list-all")
    @ResponseStatus(HttpStatus.OK)
    public List<MakeResponse> list() {
        return makeUseCase.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MakeResponse findById(
            @PathVariable("id") @ApiParam(example = "2") Long id
    ) {
        log.info("****[CONTROLLER - MakeController - findById()]****");
        return makeUseCase.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(
            @RequestBody MakeRequest request
    ) {
        log.info("****[CONTROLLER - MakeController - save()]****");
        makeUseCase.save(request);
    }
}
