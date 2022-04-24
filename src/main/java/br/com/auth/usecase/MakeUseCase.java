package br.com.auth.usecase;

import br.com.auth.gateway.database.entity.Make;
import br.com.auth.gateway.database.repository.MakeRepository;
import br.com.auth.http.domain.request.ExpertRequest;
import br.com.auth.http.domain.request.MakeRequest;
import br.com.auth.http.domain.response.MakeResponse;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class MakeUseCase {

    @Autowired
    private MakeRepository repository;

    public void save(MakeRequest request) {

        repository.save(
                Make
                        .builder()
                        .name(request.getName())
                        .cover(request.getCover())
                        .level(request.getLevel())
                        .duration(request.getDuration())
                        .expert(ExpertRequest.converterResponse(request.getExpert()))
                        .dataCriacao(LocalDateTime.now())
                        .build()
        );
    }

    @SneakyThrows
    public MakeResponse findById(Long id) {

        Optional<Make> entity = repository.findById(id);
        if (entity.isPresent()) {
            return MakeResponse.converter(entity.get());
        } else {
            throw new Exception("Make Not Found");
        }
    }

    public List<MakeResponse> findAll() {
        return repository
                .findAll()
                .stream()
                .map(MakeResponse::converter)
                .collect(Collectors.toList());
    }
}
