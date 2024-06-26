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
}
