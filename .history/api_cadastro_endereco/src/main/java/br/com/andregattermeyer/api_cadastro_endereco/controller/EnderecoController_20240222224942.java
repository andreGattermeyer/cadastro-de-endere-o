package br.com.andregattermeyer.api_cadastro_endereco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andregattermeyer.api_cadastro_endereco.model.Endereco;
import br.com.andregattermeyer.api_cadastro_endereco.service.EnderecoService;

@RestController
@RequestMapping("api/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> findAll() {
        return enderecoService.obterTodos();
    }

    @PostMapping("/cadastrar_endereco")
    public Endereco save(@RequestBody Endereco endereco) {
        return enderecoService.adicionar(endereco);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable Integer id) {
        return enderecoService.obterPorId(id)
                .map(p -> ResponseEntity
                .ok()
                .body(p))
                .orElseThrow(() -> new IllegalArgumentException("Id não existe"));
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id) {
        enderecoService.deletar(id);
        return "Endereco com id: " + id + " foi deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public Endereco save(@RequestBody Endereco endereco, @PathVariable Integer id) {
        return enderecoService.atualizar(id, endereco);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> findByCep(@PathVariable String cep) {
        return enderecoService.obterPorId(id)
                .map(p -> ResponseEntity
                .ok()
                .body(p))
                .orElseThrow(() -> new IllegalArgumentException("Id não existe"));
    }

}
