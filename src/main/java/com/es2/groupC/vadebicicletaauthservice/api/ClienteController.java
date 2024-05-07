package com.es2.groupC.vadebicicletaauthservice.api;

import com.es2.groupC.vadebicicletaauthservice.domain.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/ciclista")
public class ClienteController {

    @PostMapping()
    public ResponseEntity<CiclistaDTO> cadastrarCiclista(@RequestBody CiclistaDTO clienteASerCadastrado){
        return new ResponseEntity<>(clienteASerCadastrado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CiclistaDTO> alterarCadastroCiclista(@PathVariable long id, @RequestBody CiclistaDTO clienteASerCadastrado){
        return new ResponseEntity<>(clienteASerCadastrado, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CiclistaDTO> obterCiclista(@PathVariable long id){
        CiclistaDTO ciclista = new CiclistaDTO();
        return new ResponseEntity<>(ciclista, HttpStatus.OK);
    }

    @PostMapping("/validacao-email")
    public ResponseEntity<String> confirmarEmail(@RequestBody ConfirmarEmailDTO emailAserConfirmado){
        return emailAserConfirmado.getEmailASerConfirmado() == "" ?  new ResponseEntity<>("Email invalido", HttpStatus.NOT_FOUND) : new ResponseEntity<>("Email validado!", HttpStatus.OK);
    }

    @PostMapping("/validacao-cartao")
    public ResponseEntity<CartaoDTO> validarCartao(@RequestBody CartaoDTO cartaoASerValidado){
        return new ResponseEntity<>(cartaoASerValidado, HttpStatus.OK);
    }

    @GetMapping("/{id-ciclista}/aptidao-aluguel")
    public ResponseEntity<String> ciclistaAptoParaAluguel(@PathVariable long id){
        ArrayList listaDeAlugueisAtrasados = new ArrayList<>();


        return listaDeAlugueisAtrasados.isEmpty()
                ? new ResponseEntity<>("Ciclista apto para alugar bicicleta", HttpStatus.OK)
                : new ResponseEntity<>("Ciclista não está apto para alugar bicicleta", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/{id-ciclista}/envio-cobranca")
    public ResponseEntity<CobrancaDTO> enviarCobranca(@PathVariable long id, @RequestBody CobrancaDTO cobranca){
       return new ResponseEntity<>(cobranca, HttpStatus.OK);
    }

    @PostMapping("/{id-ciclista}/registro-cobranca")
    public ResponseEntity<ArrayList<CobrancaDTO>> registrarCobranca(@PathVariable long id, @RequestBody CobrancaDTO cobranca){
       ArrayList<CobrancaDTO> listaDeCobrancas = new ArrayList<>();
       listaDeCobrancas.add(cobranca);

       return new ResponseEntity<>(listaDeCobrancas, HttpStatus.OK);
    }

}

