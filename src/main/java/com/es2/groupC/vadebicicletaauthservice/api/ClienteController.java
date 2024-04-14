package com.es2.groupC.vadebicicletaauthservice.api;

import com.es2.groupC.vadebicicletaauthservice.domain.dto.CartaoDTO;
import com.es2.groupC.vadebicicletaauthservice.domain.dto.ClienteDTO;
import com.es2.groupC.vadebicicletaauthservice.domain.dto.ClienteLoginDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @PostMapping("/cadastrar")
    public ResponseEntity<ClienteDTO> cadastrarCliente(@RequestBody ClienteDTO clienteASerCadastrado){
        return new ResponseEntity<>(clienteASerCadastrado, HttpStatus.CREATED);
    }

    @PutMapping("/alterar-cadastro/{id}")
    public ResponseEntity<ClienteDTO> alterarCadastroCliente(@PathVariable long id, @RequestBody ClienteDTO clienteASerCadastrado){
        return new ResponseEntity<>(clienteASerCadastrado, HttpStatus.OK);
    }

    @GetMapping("/confirmar-email/{email}")
    public ResponseEntity<String> confirmarEmail(@PathVariable String email){
        return email == "" ?  new ResponseEntity<>("Email invalido", HttpStatus.NOT_FOUND) : new ResponseEntity<>("Email validado!", HttpStatus.OK);
    }

    @PostMapping("/login/")
    public ResponseEntity<ClienteLoginDTO> login(@RequestBody ClienteLoginDTO clienteLoginDTO){
        return ResponseEntity.ok().build();
    }

    @PostMapping("{id}/alterar-cartao/")
    public ResponseEntity<CartaoDTO> alterarCartao(@PathVariable Long id, @RequestBody CartaoDTO cartao){
        return id != null ? new ResponseEntity(cartao, HttpStatus.OK) :  new ResponseEntity("Cliente não encontrado", HttpStatus.NOT_FOUND);
    }


}

