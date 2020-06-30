package com.spring.guilherme.springcommysql.Repository;

import com.spring.guilherme.springcommysql.model.Lista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepository extends JpaRepository <Lista, Long> {
    
}