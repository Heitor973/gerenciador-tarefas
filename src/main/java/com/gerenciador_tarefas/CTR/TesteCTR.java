package com.gerenciador_tarefas.CTR;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteCTR {

    @GetMapping("/teste-api")
    private String teste(){
        return "Susesso";
    }
}
