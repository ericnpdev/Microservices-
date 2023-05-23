package io.github.ericnpdev.mscartoes.infra.repository;


import io.github.ericnpdev.mscartoes.domain.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
}
