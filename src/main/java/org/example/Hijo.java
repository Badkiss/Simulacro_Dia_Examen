package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hijo {

    String nombre;
    int edad;
    Hijo(){

    }

    public Hijo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Hijo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
