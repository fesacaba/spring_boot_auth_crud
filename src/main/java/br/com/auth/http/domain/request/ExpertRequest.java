package br.com.auth.http.domain.request;

import br.com.auth.gateway.database.entity.Expert;
import br.com.auth.http.domain.response.ExpertResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExpertRequest {

    private String nome;
    private String photo;
    private String social;

    public static Expert converterResponse(ExpertResponse expert) {
        return Expert
                .builder()
                .id(expert.getId())
                .nome(expert.getNome())
                .photo(expert.getPhoto())
                .social(expert.getSocial())
                .build();
    }

    public static Expert converterRequest(ExpertRequest expert) {
        return Expert
                .builder()
                .nome(expert.getNome())
                .photo(expert.getPhoto())
                .social(expert.getSocial())
                .dataCriacao(LocalDateTime.now())
                .build();
    }
}
