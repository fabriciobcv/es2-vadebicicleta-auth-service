package com.es2.groupC.vadebicicletaauthservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class CliclistaLoginDTO {
    private String email;
    private String senha;

    public CliclistaLoginDTO() { super();}

    public CliclistaLoginDTO(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
