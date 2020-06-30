package com.spring.guilherme.springcommysql.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.guilherme.springcommysql.Controller.dto.PessoasRs;
import com.spring.guilherme.springcommysql.Repository.PessoaRepository;




import java.util.stream.Collectors;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaRepository pessoaRepository;
    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;

    }
    @GetMapping("/")
    public List<PessoasRs> findAll(){
        var pessoas = pessoaRepository.findAll();
        return pessoas
            .stream()
            .map(PessoasRs::converter)
            .collect(Collectors.toList());
    }
}