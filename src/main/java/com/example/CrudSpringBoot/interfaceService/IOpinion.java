package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Opinion;
import org.springframework.data.repository.CrudRepository;

public interface IOpinion extends CrudRepository<Opinion, Integer> {
}
