package com.es2.groupC.vadebicicletaauthservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ConfirmarEmailDTO {
    private String emailASerConfirmado;
    private String dataDeConfirmacao;
}
