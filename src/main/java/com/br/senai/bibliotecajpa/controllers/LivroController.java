package com.br.senai.bibliotecajpa.controllers;

import com.br.senai.bibliotecajpa.services.LivroService;
import com.br.senai.bibliotecajpa.models.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Livro getLivroById(@PathVariable Integer id) {
        return livroService.findById(id);
    }

    @PostMapping
    public Livro saveLivro(@RequestBody Livro livro) {
        return livroService.save(livro);
    }

    @PutMapping
    public Livro updateLivro(@RequestBody Livro livro) {
        return livroService.update(livro);
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Integer id) {
        this.livroService.delete(id);
    }
}
