package com.es2.groupC.vadebicicletaauthservice.api;

import com.es2.groupC.vadebicicletaauthservice.domain.dto.EmailDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Controller {
    @PostMapping("/envio-email")
    public ResponseEntity<EmailDTO> enviarEmail(@RequestBody EmailDTO email){
        return new ResponseEntity<>(email, HttpStatus.OK);
    }
}
