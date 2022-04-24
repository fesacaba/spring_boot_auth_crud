package br.com.auth.gateway.database.repository;

import br.com.auth.gateway.database.entity.Make;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeRepository extends JpaRepository<Make, Long> {
}
