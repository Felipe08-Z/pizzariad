package com.itb.inf2dm.pizzariad.controller;

import com.itb.inf2dm.pizzariad.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;


@RequestMapping("/api/v1/produto")
@RestController
public class ProdutoController {
    List<Produto> produtos = new ArrayList<Produto>();
    @GetMapping
    public List<Produto> findAll() {
        Produto p1 = new Produto();
        p1.setNome("Pizza");
        p1.setDescricao("Pizza de calabresa");
        p1.setValorVenda(49.90);

        Produto p2 = new Produto();
        p2.setNome("Pizza");
        p2.setDescricao("Pizza de frango com catupiry");
        p2.setValorVenda(59.90);

        produtos.add(p1);
        produtos.add(p2);
        return produtos;
    }
}