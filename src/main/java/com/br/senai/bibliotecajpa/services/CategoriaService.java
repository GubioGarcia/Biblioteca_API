package com.br.senai.bibliotecajpa.services;

import com.br.senai.bibliotecajpa.models.Categoria;
import com.br.senai.bibliotecajpa.models.Livro;
import com.br.senai.bibliotecajpa.repositores.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Integer id) {
        return this.categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }

    public Categoria save(Categoria categoria) {
        return this.categoriaRepository.save(categoria);
    }

    public void delete(Integer id) {
        this.categoriaRepository.deleteById(id);
    }

    public Categoria update(Categoria categoria) {
        return this.save(categoria);
    }
}
