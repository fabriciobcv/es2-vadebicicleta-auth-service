package com.es2.groupC.vadebicicletaauthservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class CiclistaDTO {

    private Long id;
    private String email;
    private String nome;
    private String CPF;
    private String passaporte;
    private String pais;
    private String senha;
    private String numeroCC;
    private String nomeCC;
    private String validadeCC;
    private String codigoCC;
    private String fotoDocumento;

    public CiclistaDTO() { super();}

    public CiclistaDTO(String email, String nome, String CPF, String passaporte, String pais, String senha, String numeroCC, String nomeCC, String validadeCC, String codigoCC, String fotoDocumento) {
        this.email = email;
        this.nome = nome;
        this.CPF = CPF;
        this.passaporte = passaporte;
        this.pais = pais;
        this.senha = senha;
        this.numeroCC = numeroCC;
        this.nomeCC = nomeCC;
        this.validadeCC = validadeCC;
        this.codigoCC = codigoCC;
        this.fotoDocumento = fotoDocumento;
    }


}
