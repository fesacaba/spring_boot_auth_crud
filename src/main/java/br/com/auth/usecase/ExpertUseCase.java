package br.com.auth.usecase;

import br.com.auth.gateway.database.repository.ExpertRepository;
import br.com.auth.http.domain.request.ExpertRequest;
import br.com.auth.http.domain.response.ExpertResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExpertUseCase {

    @Autowired
    private ExpertRepository expertRepository;

    public void save(ExpertRequest request) {
        expertRepository.save(ExpertRequest.converterRequest(request));
    }

    public ExpertResponse findById(Long id) {
        return ExpertResponse.converter(expertRepository.findById(id).get());
    }
}
