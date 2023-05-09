package com.example.CrudSpringBoot.interfaces.controler;




    import com.example.CrudSpringBoot.modelo.Consulta;
    import com.example.CrudSpringBoot.modelo.ConsultaRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;

    @Controller
    public class ConsultaController {

        private ConsultaRepository consultaRepository;

        @Autowired
        public ConsultaController(ConsultaRepository consultaRepository) {
            this.consultaRepository = consultaRepository;
        }

        @GetMapping("/confirmacion")
        public String mostrarConfirmacion() {
            return "confirmacion";
        }

        @PostMapping("/guardarConsulta")
        public String guardarConsulta(@ModelAttribute("consulta") Consulta consulta) {
            consultaRepository.save(consulta);
            return "redirect:/confirmacion";
        }
    }
