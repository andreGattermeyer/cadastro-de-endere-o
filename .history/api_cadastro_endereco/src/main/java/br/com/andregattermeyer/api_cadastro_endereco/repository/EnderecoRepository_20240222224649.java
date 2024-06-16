package br.com.andregattermeyer.api_cadastro_endereco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andregattermeyer.api_cadastro_endereco.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
    Optional<Endereco> findByCep(String cep);

}
