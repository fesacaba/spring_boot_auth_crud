package br.com.auth.http.domain.response;

import br.com.auth.gateway.database.entity.Make;
import br.com.auth.http.domain.enums.TypeMakeLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MakeResponse {

    private Long id;
    private String name;
    private String cover;
    private TypeMakeLevel level;
    private Integer duration;
    private ExpertResponse expert;

    public static MakeResponse converter(Make make) {
        return MakeResponse
                .builder()
                .id(make.getId())
                .name(make.getName())
                .cover(make.getCover())
                .level(make.getLevel())
                .duration(make.getDuration())
                .expert(ExpertResponse.converter(make.getExpert()))
                .build();
    }
}
