package com.es2.groupC.vadebicicletaauthservice.api;

import com.es2.groupC.vadebicicletaauthservice.domain.dto.CartaoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cartao")
public class CartaoController {
    @PutMapping("/{id}")
    public ResponseEntity<CartaoDTO> alterarCartao(@PathVariable Long id, @RequestBody CartaoDTO cartao){
        return id != null ? new ResponseEntity(cartao, HttpStatus.OK) :  new ResponseEntity("Cartao não encontrado", HttpStatus.NOT_FOUND);
    }
}
