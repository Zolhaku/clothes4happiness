package com.clothes4happiness.controller;

import com.clothes4happiness.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clothes4happiness.models.usuario;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<usuario> getusuarios() {
        return repository.findAll();
    }
}
