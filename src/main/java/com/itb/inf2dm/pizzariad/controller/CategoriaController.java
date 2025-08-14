package com.itb.inf2dm.pizzariad.controller;

import com.itb.inf2dm.pizzariad.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;


@RequestMapping("/api/v1/categoria")
@RestController

public class CategoriaController {
    List<Categoria> categorias = new ArrayList<Categoria>();
    @GetMapping
    public List<Categoria> findAll() {
        Categoria c1 = new Categoria();
        c1.setTamanho("Médio");
        c1.setDescricao("Serve até 4 pessoas");


        Categoria c2 = new Categoria();
        c2.setTamanho("Grande");
        c2.setDescricao("Serve até 6 pessoas");


        categorias.add(c1);
        categorias.add(c2);
        return categorias;
    }
}

