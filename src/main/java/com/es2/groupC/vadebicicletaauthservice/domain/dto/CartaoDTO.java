package com.es2.groupC.vadebicicletaauthservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class CartaoDTO {
    private String numeroCC;
    private String nomeCC;
    private String validadeCC;
    private String codigoCC;

    public CartaoDTO() {super();}

    public String getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }

    public String getNomeCC() {
        return nomeCC;
    }

    public void setNomeCC(String nomeCC) {
        this.nomeCC = nomeCC;
    }

    public String getValidadeCC() {
        return validadeCC;
    }

    public void setValidadeCC(String validadeCC) {
        this.validadeCC = validadeCC;
    }

    public String getCodigoCC() {
        return codigoCC;
    }

    public void setCodigoCC(String codigoCC) {
        this.codigoCC = codigoCC;
    }
}
