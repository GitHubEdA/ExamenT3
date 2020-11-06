package com.example.exament3.personaje;

public class PersonajeAnime {
    private String nombre;
    private String informacion;
    private String foto;

    public PersonajeAnime(String nombre, String informacion, String foto) {
        this.nombre = nombre;
        this.informacion = informacion;
        this.foto = foto;
    }

    public  PersonajeAnime(){

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInformacion() {
        return informacion;
    }

    public String getFoto() {
        return foto;
    }

}
