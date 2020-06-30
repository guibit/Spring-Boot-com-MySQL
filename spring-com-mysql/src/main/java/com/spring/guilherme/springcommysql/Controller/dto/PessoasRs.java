package com.spring.guilherme.springcommysql.Controller.dto;

import com.spring.guilherme.springcommysql.model.Pessoa;

public class PessoasRs {
    private Long id;
    private String nome;
    private Integer idade;

    public static PessoasRs converter(Pessoa p){
        var pessoa = new PessoasRs();
        pessoa.setId(p.getId());
        pessoa.setNome(p.getNome());
        pessoa.setIdade(p.getIdade());
        return pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    
}