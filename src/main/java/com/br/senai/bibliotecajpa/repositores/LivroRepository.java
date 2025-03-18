package com.br.senai.bibliotecajpa.repositores;

import com.br.senai.bibliotecajpa.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    Livro findById(int id);
    List<Livro> findByTituloContainigIgnoreCase(String titulo);
    List<Livro> findByAutor(String autor);
    List<Livro> findByCategoriaId(Integer categoriaId);
    List<Livro> findByQuantidadeDisponivel(Integer quantidadeDisponivel);
}
