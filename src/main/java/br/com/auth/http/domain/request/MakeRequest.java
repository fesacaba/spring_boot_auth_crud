package br.com.auth.http.domain.request;

import br.com.auth.http.domain.enums.TypeMakeLevel;
import br.com.auth.http.domain.response.ExpertResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MakeRequest {

    private String name;
    private String cover;
    private TypeMakeLevel level;
    private Integer duration;
    private ExpertResponse expert;
}
