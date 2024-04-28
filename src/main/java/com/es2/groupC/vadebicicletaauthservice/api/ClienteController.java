package com.es2.groupC.vadebicicletaauthservice.api;

import com.es2.groupC.vadebicicletaauthservice.domain.dto.CiclistaDTO;
import com.es2.groupC.vadebicicletaauthservice.domain.dto.CliclistaLoginDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ciclista")
public class ClienteController {

    @PostMapping("/")
    public ResponseEntity<CiclistaDTO> cadastrarCliente(@RequestBody CiclistaDTO clienteASerCadastrado){
        return new ResponseEntity<>(clienteASerCadastrado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CiclistaDTO> alterarCadastroCliente(@PathVariable long id, @RequestBody CiclistaDTO clienteASerCadastrado){
        return new ResponseEntity<>(clienteASerCadastrado, HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<String> confirmarEmail(@PathVariable String email){
        return email == "" ?  new ResponseEntity<>("Email invalido", HttpStatus.NOT_FOUND) : new ResponseEntity<>("Email validado!", HttpStatus.OK);
    }

    @PostMapping("/login/")
    public ResponseEntity<CliclistaLoginDTO> login(@RequestBody CliclistaLoginDTO cliclistaLoginDTO){
        return ResponseEntity.ok().build();
    }
}

