package com.br.senai.bibliotecajpa.repositores;

import com.br.senai.bibliotecajpa.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    Livro findById(int id);
    Livro findByTitulo(String titulo);
    Livro findByAutor(String autor);
}
