package br.com.andregattermeyer.api_cadastro_endereco.service;

import org.springframework.beans.factory.annotation.Autowired;

@Ser
public class EnderecoService {
    
            @Autowired
        private ProductRepository productRepository;

        /**
         * Método para retornar uma lista de produtos.
         * @return Lista de produtos.
         */
        public List<Product> obterTodos() {
                return productRepository.findAll();
        }

        /**
         * Método que retorna o produto encontrado pelo seu id.
         * @param id do Product que será localizado.
         * @return Retorna um produto caso tenga sido encontrado.
         */
        public Optional <Product> obterPorId(Integer id) {
                return productRepository.findById(id);
        }

        public Product adicionar(Product product) {

                return productRepository.save(product);
        }

        /**
        *Método para deletar o Product por id.
        * @param id do Product a ser deletado.
        */
        public void deletar(Integer id) {
                productRepository.deleteById(id);
        }

         /**
     * Método para atualizar o product na lista.
     * @param Product que será atualizado.
     * @param id do produto.
     * @return Retorna o produto após atualizar a lista.
     */
    public Product atualizar(Integer id, Product product) {

        //Poderia ter alguma validação no ID.
        product.setId(id);

        return productRepository.save(product);
    }
}
