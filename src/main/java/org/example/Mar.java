package org.example;

import javax.naming.Context;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Mar {
    public static void Mar(){
        try{
            List<Tutor> tutores=new ArrayList<>();
            for (int i = 1; i < 2; i++) {
                tutores.add(new Tutor("paco"+1,i+32,"watusabe"+i,"reponeror"+i));
            }
            List<Hijo> hijos=new ArrayList<>();
            for (int i = 1; i <=4; i++) {
                hijos.add(new Hijo("pepe"+i,7+i));
            }
            List<Familia> familias=new ArrayList<>();
            familias.add(new Familia(1,tutores,hijos));
           Vecindario vecindario= new Vecindario();
           vecindario.setFamilias(familias);
            JAXBContext context =JAXBContext.newInstance(Vecindario.class);
            Marshaller marshaller= context.createMarshaller();

            marshaller.marshal(vecindario,Files.newOutputStream(Paths.get("vecindario2.xml")));
        } catch (JAXBException | IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void UnMar(){
        try{
            JAXBContext context=JAXBContext.newInstance(Vecindario.class);
            Unmarshaller unmarshaller= context.createUnmarshaller();
           Vecindario vecindario =(Vecindario) unmarshaller.unmarshal(new File("vecindario2.xml"));
            System.out.println(vecindario);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
