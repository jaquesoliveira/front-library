package com.jqs.library.service;


import com.jqs.library.model.Autor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="autorSrvRest", url="https://biblioteca-jqs.herokuapp.com/api/v1")
public interface AutorServiceRest {

    @GetMapping("/autores/")
    List<Autor> listaAll();
}
