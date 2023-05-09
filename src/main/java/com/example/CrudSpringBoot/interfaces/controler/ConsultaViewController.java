package com.example.CrudSpringBoot.interfaces.controler;

import com.example.CrudSpringBoot.modelo.Consulta;
import com.example.CrudSpringBoot.modelo.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ConsultaViewController {

    private ConsultaRepository consultaRepository;

    @Autowired
    public ConsultaViewController(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @GetMapping("/ViewConsultas")
    public String mostrarConsultas(Model model) {
        List<Consulta> consultas = consultaRepository.findAll();
        model.addAttribute("consultas", consultas);
        return "consultas";
    }
}