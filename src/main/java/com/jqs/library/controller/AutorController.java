package com.jqs.library.controller;

import com.jqs.library.model.Autor;
import com.jqs.library.service.AutorServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AutorController {

    @Autowired
    private AutorServiceRest autorServiceRest;

    @GetMapping("/autores")
    public ModelAndView autores(){
        List<Autor> listAutores = autorServiceRest.listaAll();

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/pages/autores/index");
        modelAndView.addObject("listAll", listAutores);

        return modelAndView;
    }
}
