package com.spring.guilherme.springcommysql.Controller;

//import com.spring.guilherme.springcommysql.Repository.ListaRepository;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
public class ListaController {
    public String getFoos(@RequestParam String lista) {
        return "Lista: " + lista;
    }
}
