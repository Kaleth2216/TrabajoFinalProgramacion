package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IOpinionService;
import com.example.CrudSpringBoot.interfaces.IOpinion;
import com.example.CrudSpringBoot.modelo.Opinion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionService implements IOpinionService {

    @Autowired
    private IOpinion data;

    @Override
    public List<Opinion> listarO() {
        return (List<Opinion>) data.findAll();
    }

    @Override
    public Optional<Opinion> listarIdO(int id) {

        return data.findById(id);
    }

    @Override
    public int saveO(Opinion o) {
        int res = 0;
        Opinion opinion = data.save(o);
        if(!opinion.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void deleteO(int id) {
        data.deleteById(id);
    }
}
