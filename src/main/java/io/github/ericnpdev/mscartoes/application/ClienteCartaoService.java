package io.github.ericnpdev.mscartoes.application;

import io.github.ericnpdev.mscartoes.domain.ClienteCartao;
import io.github.ericnpdev.mscartoes.infra.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
