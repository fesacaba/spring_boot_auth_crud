package br.com.auth.http.v1;

import br.com.auth.http.domain.request.ExpertRequest;
import br.com.auth.http.domain.response.ExpertResponse;
import br.com.auth.usecase.ExpertUseCase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/expert")
@Api(tags = "Expert", produces = APPLICATION_JSON_VALUE)
public class ExpertController {

    @Autowired
    private ExpertUseCase expertUseCase;

    @ApiOperation(value = "Find Expert By Id")
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ExpertResponse findById(
            @PathVariable("id") @ApiParam(example = "1") Long id
    ) {
        log.info("****[CONTROLLER - ExpertController - findById()]****");
        return expertUseCase.findById(id);
    }

    @ApiOperation(value = "Save Expert")
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(
            @RequestBody ExpertRequest request
    ) {
        log.info("****[CONTROLLER - ExpertController - save()]****");
        expertUseCase.save(request);
    }
}
