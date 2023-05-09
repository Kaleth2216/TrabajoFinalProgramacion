package com.example.CrudSpringBoot.modelo;

public class Consulta {
    private String nombre;
    private String telefono;
    private String email;
    private String mascota;
    private String motivo;

    // Constructor vacío
    public Consulta() {}

    // Constructor con parámetros
    public Consulta(String nombre, String telefono, String email, String mascota, String motivo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.mascota = mascota;
        this.motivo = motivo;
    }

    // Métodos getter y setter para todos los campos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
