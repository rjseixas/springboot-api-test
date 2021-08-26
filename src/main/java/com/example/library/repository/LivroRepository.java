package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
