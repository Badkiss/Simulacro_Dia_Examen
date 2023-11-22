package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tutor {

    String nombre;

    int edad;

    String genero;

    String profesion;
    Tutor(){

    }

    public Tutor(String nombre, int edad, String genero, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.profesion = profesion;
    }
    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElement
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @XmlElement
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @XmlElement
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}
