package com.br.senai.bibliotecajpa.repositores;

import com.br.senai.bibliotecajpa.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    Categoria findById(int id);
    Categoria findByNome(String titulo);
}