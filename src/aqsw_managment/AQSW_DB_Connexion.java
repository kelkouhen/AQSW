/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author p075446
 */
public class AQSW_DB_Connexion {
    
    String urlPilote = "org.postgressql.Driver";
    String urlBDD = "jdbc:postgresql://localhost:5432/AQSW_BD";
    Connection con;
    
    //Constructeur de la classe connextion
    
    public AQSW_DB_Connexion()
    {
        // chargement du pilote
        try{
            Class.forName(urlPilote);
            System.out.println("Chargement Pilote OK");
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    
    
    //connection a la base de donnees
    try{
            con = DriverManager.getConnection(urlBDD, "postgres", "postgres");
            System.out.println("Connextion a la base de donnees AQSW DB est OK");
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    } 
    
    // getter pour con
        Connection getCon()
        {
            return con;
        }
        
 
       
}
