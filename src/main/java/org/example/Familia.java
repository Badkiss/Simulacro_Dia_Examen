package org.example;

import javax.xml.bind.annotation.*;
import java.util.List;
@XmlRootElement
@XmlType(propOrder = {"tutores", "hijos"})

public class Familia {
    @XmlAttribute
    int id;

    List<Hijo> hijos;

    List<Tutor> tutores;
    Familia(){

    }

    public Familia(int id, List<Tutor> tutores, List<Hijo> hijos) {
        this.id = id;
        this.hijos = hijos;
        this.tutores = tutores;
    }
    @XmlElement
    public List<Hijo> getHijos() {
        return hijos;
    }
    @XmlElement
    public List<Tutor> getTutores() {
        return tutores;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }

    public void setTutores(List<Tutor> tutores) {
        this.tutores = tutores;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "id=" + id +
                ", hijos=" + hijos +
                ", tutores=" + tutores +
                '}';
    }
}
