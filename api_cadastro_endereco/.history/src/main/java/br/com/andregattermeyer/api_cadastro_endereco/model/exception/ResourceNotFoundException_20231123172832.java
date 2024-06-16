package br.com.andregattermeyer.api_cadastro_endereco.model.exception;

public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException (String mensagem){
        super(mensagem);
}
