/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5_is2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class SqlitePeopleReader implements PeopleLoader{
    public SqlitePeopleReader() {
    }
    @Override
    public List<Person> load(){
        List<Person> list = new ArrayList<>();
        
        try {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/correo.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM people");
        
        while(resultSet.next()){
            String name = resultSet.getString("first_name")+resultSet.getString("last_name");
            String adress = resultSet.getString("address");
            String email = resultSet.getString("email");
            list.add(new Person(name,adress,email));
        } 
        statement.close();
        }catch (ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
        }
        return list;
    }
    
}
