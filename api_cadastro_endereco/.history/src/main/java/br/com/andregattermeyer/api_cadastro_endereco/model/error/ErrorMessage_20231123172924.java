package br.com.andregattermeyer.api_cadastro_endereco.model.error;

public class ErrorMessage {

    private String titulo;

    private Integer status;

    private String mensagem;


public ErrorMessage(String titulo, Integer status, String mensagem) {
    this.titulo = titulo;
    this.status = status;
    this.mensagem = mensagem;
}



public String getTitulo() {
    return this.titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public Integer getStatus() {
    return this.status;
}

public void setStatus(Integer status) {
    this.status = status;
}

public String getMensagem() {
    return this.mensagem;
}

public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
}

}
