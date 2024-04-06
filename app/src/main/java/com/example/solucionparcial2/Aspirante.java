package com.example.solucionparcial2;

import java.io.Serializable;

public class Aspirante implements Serializable {

    private String Nombres;
    private String Apellidos;
    private String Celular;
    private String Cedula;
    private String Correos;
    private String Carrera;
    private Float ValorApagar;

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getCorreos() {
        return Correos;
    }

    public void setCorreos(String correos) {
        Correos = correos;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public float getValorApagar() {
        return ValorApagar;
    }

    public void setValorApagar(Float valorApagar) {
        ValorApagar = valorApagar;
    }



    public Aspirante() {
    }
}

