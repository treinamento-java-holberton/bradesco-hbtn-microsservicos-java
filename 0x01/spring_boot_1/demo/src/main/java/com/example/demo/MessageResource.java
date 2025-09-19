package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(value = "/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
        return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
    }

    @GetMapping("/login")
    public String login(@RequestParam String user, @RequestParam String password) {
        if (Objects.isNull(user) || Objects.isNull(password) || user.isBlank() || password.isBlank()) {
            return "USUÁRIO E SENHA NÃO INFORMADOS";
        }

        if (user.length() > 15 || password.length() > 15) {
            return "USUÁRIO E SENHA INVÁLIDOS";
        }
        return "LOGIN EFETUADO COM SUCESSO !!!";
    }
}
