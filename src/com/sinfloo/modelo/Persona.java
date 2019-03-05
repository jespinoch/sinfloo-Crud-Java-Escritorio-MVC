
package com.sinfloo.modelo;

public class Persona {
    int id;
    String nom;
    String correo;
    String telefono;

    public Persona() {
    }

    public Persona(int id, String nom, String correo, String telefono) {
        this.id = id;
        this.nom = nom;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
