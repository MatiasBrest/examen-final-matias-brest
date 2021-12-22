package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class MyJDBC01 {

    public static void main(String[] args) {

        Connection connection = null;

        try  {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Dragonballsuper1980");


            Statement statement = ((Connection) connection).createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM estudiantes");

            System.out.println(resultSet.getClass().getSimpleName());
            System.out.println("");



            while(resultSet.next()){
                System.out.println(resultSet.getString("id")+" "+resultSet.getString("dni")+" "+ resultSet.getString("nombre")+" "+resultSet.getString("apellido"));


            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}