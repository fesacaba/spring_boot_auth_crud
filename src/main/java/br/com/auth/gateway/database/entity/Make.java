package br.com.auth.gateway.database.entity;

import br.com.auth.http.domain.enums.TypeMakeLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_MAKE")
public class Make {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COVER")
    private String cover;

    @Enumerated(EnumType.STRING)
    @Column(name = "LEVEL")
    private TypeMakeLevel level;

    @Column(name = "DURATION")
    private Integer duration;

    @OneToOne
    @JoinColumn(name = "expert_id")
    private Expert expert;

    @Column(name = "DATA_CRIACAO")
    private LocalDateTime dataCriacao;
}
