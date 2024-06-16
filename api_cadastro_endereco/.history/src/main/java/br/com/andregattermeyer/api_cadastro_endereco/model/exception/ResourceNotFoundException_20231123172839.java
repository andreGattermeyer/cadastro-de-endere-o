package br.com.andregattermeyer.api_cadastro_endereco.model.exception;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException (String mensagem){
        super(mensagem);
}
