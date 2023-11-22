package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        try(BufferedReader bufferedReader=Files.newBufferedReader(Paths.get("productos.csv"))){

            Function<String,Producto> crearProducto=line ->{
              String[] array=line.split(";");
              return new Producto(Integer.parseInt(array[0].trim()),array[1].trim(),Integer.parseInt(array[2].trim()),Integer.parseInt(array[3]),array[4].trim(),Float.parseFloat(array[5].replace(",",".").trim()),Integer.parseInt(array[6].trim()),Integer.parseInt(array[7].trim()),Integer.parseInt(array[8].trim()),Integer.parseInt(array[9].trim()));
            };



            List<Producto> productos=bufferedReader.lines().skip(1).map(crearProducto).toList();
            ejercicio3(productos);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void ejercicio1(List<Producto> productos){
List<Producto> peo = productos.stream().filter((p)->p.unitsInStock>10).sorted(Comparator.comparing(Producto::getUnitsInStock)).toList();
peo.forEach(p->System.out.println(p));
    }
    public static void ejercicio2(List<Producto> productos){
        Map<Integer,Long> supp =productos.stream().collect(Collectors.groupingBy(Producto::getSupplierID,Collectors.counting()));
        supp.forEach((k,v)->System.out.println(k+" "+v));
    }
    public static void ejercicio3(List<Producto> productos){
        productos.stream().filter(producto -> Float.compare(producto.getUnitPrice(),(productos.stream().min(Comparator.comparing(Producto::getUnitPrice)).get().getUnitPrice()))==0).forEach(pro->System.out.println(pro));
    }
}
