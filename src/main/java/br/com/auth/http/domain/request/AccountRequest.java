package br.com.auth.http.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {

    private Long propostaDeFinanciamento;
    private Integer dueDate;
    private Boolean termoAceite;
}
