package br.com.andregattermeyer.api_cadastro_endereco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andregattermeyer.api_cadastro_endereco.model.Endereco;
import br.com.andregattermeyer.api_cadastro_endereco.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    /**
     * Método para retornar uma lista de produtos.
     * 
     * @return Lista de produtos.
     */
    public List<Endereco> obterTodos() {
        return enderecoRepository.findAll();
    }

    /**
     * Método que retorna o produto encontrado pelo seu id.
     * 
     * @param id do Endereco que será localizado.
     * @return Retorna um produto caso tenga sido encontrado.
     */
    public Optional<Endereco> obterPorId(Integer id) {
        return enderecoRepository.findById(id);
    }

    public Endereco adicionar(Endereco endereco) {

        return EnderecoRepository.save(product);
    }

    /**
     * Método para deletar o Product por id.
     * 
     * @param id do Product a ser deletado.
     */
    public void deletar(Integer id) {
        productRepository.deleteById(id);
    }

    /**
     * Método para atualizar o product na lista.
     * 
     * @param Product que será atualizado.
     * @param id      do produto.
     * @return Retorna o produto após atualizar a lista.
     */
    public Product atualizar(Integer id, Product product) {

        // Poderia ter alguma validação no ID.
        product.setId(id);

        return productRepository.save(product);
    }
}
