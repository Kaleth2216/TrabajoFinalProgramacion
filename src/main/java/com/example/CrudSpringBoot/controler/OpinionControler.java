package com.example.CrudSpringBoot.controler;



import com.example.CrudSpringBoot.interfaceService.IOpinionService;
import com.example.CrudSpringBoot.modelo.Opinion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class OpinionControler {


    @Autowired
    private IOpinionService service;



    @GetMapping("/listarO")
    public String listarO(Model model){
        List<Opinion>opinion= service.listarO();
        model.addAttribute("opinion", opinion);
        return "verComentarios";
    }






    @GetMapping("/formularioO")
    public String agregarO(Model model){
        model.addAttribute("opinion", new Opinion());
        return "formularioO";

    }
    @PostMapping("/saveO")
    public String saveO(@Validated Opinion o){
        service.saveO(o);
        return "redirect:/listarO";
    }

    @GetMapping("/editarO/{id}")
    public String editarO(@PathVariable int id, Model model){
        Optional<Opinion> opinion = service.listarIdO(id);
        model.addAttribute("opinion", opinion);
        return "formularioO";
    }

    @GetMapping("/eliminarO/{id}")
    public String deleteO(@PathVariable int id){
        service.deleteO(id);
        return "redirect:/listarO";
    }



}



