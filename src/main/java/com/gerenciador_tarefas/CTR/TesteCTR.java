package com.gerenciador_tarefas.CTR;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteCTR {

    @GetMapping("/teste-api")
    private String teste(){
        return "Susesso";
    }
    @GetMapping("/teste-api-ben-vindo")
    public String TesteBemVindo(@RequestParam(name ="nome") String nome){
return "Olá "+nome+", Bem-vindo" ;
    }
}
