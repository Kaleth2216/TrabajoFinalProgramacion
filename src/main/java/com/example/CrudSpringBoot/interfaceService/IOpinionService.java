package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Opinion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IOpinionService {

    public List<Opinion>listarO();
    public Optional<Opinion>listarIdO(int id);
    public int saveO (Opinion o);
    public void deleteO(int id);

}
