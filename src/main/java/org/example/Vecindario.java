package org.example;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement

public class Vecindario {

    List<Familia> familias;
    Vecindario(){

    }
@XmlElement
    public List<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(List<Familia> familias) {
        this.familias = familias;
    }

    @Override
    public String toString() {
        return "Vecindario{" +
                "familias=" + familias +
                '}';
    }
}
