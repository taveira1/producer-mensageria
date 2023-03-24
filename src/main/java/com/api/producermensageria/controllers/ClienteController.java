package com.api.producermensageria.controllers;

import com.api.producermensageria.dtos.Cliente;
import com.api.producermensageria.producers.ClienteProducer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste-mensageria")
public class ClienteController {

    @Autowired
    private ClienteProducer clienteProducer;

    @PostMapping
    public ResponseEntity<Object> produzirMensagem(@RequestBody @Valid Cliente cliente){
        clienteProducer.produzirMensagem(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);

    }

    @GetMapping
    public String getMessages(){
        return "mensagens da fila: .....";
    }


}
