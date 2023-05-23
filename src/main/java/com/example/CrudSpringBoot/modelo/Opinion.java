

package com.example.CrudSpringBoot.modelo;


import javax.persistence.*;

@Entity
@Table(name = "opinion")
public class Opinion{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String comentario;

    public Opinion() {
    }

    public Opinion(int id, String name, String comentario) {
        this.id = id;
        this.name = name;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}