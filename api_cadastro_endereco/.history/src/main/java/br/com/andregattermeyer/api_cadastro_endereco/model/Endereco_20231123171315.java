package br.com.andregattermeyer.api_cadastro_endereco.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Endereco {

    @Id
    private Integer id;

    private String cep;

    private String logradouro;

    private String complemento;

    private String bairro;

    private String cidade;

    private String uf;
}
