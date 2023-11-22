package org.example;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Dom {
    public static void Leer(){

        try{
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
