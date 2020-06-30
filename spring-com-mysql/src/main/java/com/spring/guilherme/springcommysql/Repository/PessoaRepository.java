package com.spring.guilherme.springcommysql.Repository;

import com.spring.guilherme.springcommysql.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}