package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class Ejercicio3
{
    public static void main( String[] args ) throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/simulacro","root","1234");

//        PreparedStatement preparedStatement= con.prepareStatement("insert into coche (marca,color) values(?,?)");
//        String marca="BMW";
//        String color="verde";
//        preparedStatement.setString(1,marca);
//        preparedStatement.setString(2,color);
//        preparedStatement.executeUpdate();

//        PreparedStatement preparedStatement1= con.prepareStatement("insert into accidente (cod_coche1,cod_coche2,num_muertos) values (?,?,?)");
//        int cod_coche1=1;
//        int cod_coche2=2;
//        int num_muertos=0;
//        preparedStatement1.setInt(1,cod_coche1);
//        preparedStatement1.setInt(2,cod_coche2);
//        preparedStatement1.setInt(3,num_muertos);
//        preparedStatement1.executeUpdate();

//        PreparedStatement preparedStatement= con.prepareStatement("update coche set color=? where color=?");
//        String color1="rojo";
//        String color2="verde";
//        preparedStatement.setString(1,color1);
//        preparedStatement.setString(2,color2);
//        preparedStatement.executeUpdate();

//          PreparedStatement preparedStatement= con.prepareStatement("delete from accidente where num_muertos=?");
//          int num_muertos=0;
//          preparedStatement.setInt(1,num_muertos);
//          preparedStatement.executeUpdate();

            PreparedStatement preparedStatement= con.prepareStatement("select * from accidente");
            ResultSet resultSet= preparedStatement.executeQuery();


            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3)+" "+resultSet.getInt(4)+" ");
            }
    }
}
