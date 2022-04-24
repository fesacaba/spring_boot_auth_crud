package br.com.auth.gateway.database.repository;

import br.com.auth.gateway.database.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<Expert, Long> {
}
