package com.br.senai.bibliotecajpa.controllers;

import com.br.senai.bibliotecajpa.models.Categoria;
import com.br.senai.bibliotecajpa.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Integer id) {
        return categoriaService.findById(id);
    }

    @PostMapping
    public Categoria saveCategoria(Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @PostMapping
    public Categoria updateCategoria(Categoria categoria) {
        return categoriaService.update(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Integer id) {
        this.categoriaService.delete(id);
    }
}
