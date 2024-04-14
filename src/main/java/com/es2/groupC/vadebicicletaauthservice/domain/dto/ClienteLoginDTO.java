package com.es2.groupC.vadebicicletaauthservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ClienteLoginDTO {
    private String email;
    private String senha;

    public ClienteLoginDTO() { super();}

    public ClienteLoginDTO(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
