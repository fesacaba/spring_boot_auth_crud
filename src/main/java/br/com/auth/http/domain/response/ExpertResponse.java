package br.com.auth.http.domain.response;

import br.com.auth.gateway.database.entity.Expert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExpertResponse {

    private Long id;
    private String nome;
    private String photo;
    private String social;

    public static ExpertResponse converter(Expert expert) {
        return ExpertResponse
                .builder()
                .id(expert.getId())
                .nome(expert.getNome())
                .photo(expert.getPhoto())
                .social(expert.getSocial())
                .build();
    }
}
