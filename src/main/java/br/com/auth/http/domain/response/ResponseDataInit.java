package br.com.auth.http.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDataInit {

    private String id;
    private String name;
    private Boolean showFatca;
    private Boolean showAccountTerm;
    private BigDecimal limit;
    private String phoneNumber;

}
