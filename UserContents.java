package com.afloriano.userregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserContents {
    
    public static void seeTable(){
        try {
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Xwg20031610&");

            String studentsQuery = "SELECT * FROM students";
            String detailsQuery = "SELECT * FROM student_details";

            Statement sta = connection.createStatement();
            
            // Consulta y muestra los datos de la tabla "students"
            ResultSet rs = sta.executeQuery(studentsQuery);


            System.out.println("Contenido de la tabla students:");
            System.out.println("Boleta  Nombre");
            while(rs.next())
            {
                String bol = rs.getString("boleta");
                String nam = rs.getString("nombre");
                
                System.out.println(bol + " " + nam);
            }
            
            // Consulta y muestra los datos de la tabla "student_details"
            rs = sta.executeQuery(detailsQuery);
            System.out.println("\nContenido de la tabla student_details:");
            System.out.println("Boleta  Domicilio  Correo Electrónico");
            while(rs.next())
            {
                String bol = rs.getString("boleta");
                String dom = rs.getString("domicilio");
                String correo = rs.getString("correo_electronico");
                
                System.out.println(bol + " " + dom + " " + correo);
            }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        seeTable();
    }
    
}