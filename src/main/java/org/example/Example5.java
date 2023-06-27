package org.example;

import java.sql.*;

public class Example5 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        com.mysql.cj.jdbc.Driver driver;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "ItalyIsMyDream24_");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select*from employee");

        while (resultSet.next()) {
           //obyekt yaradiriq
            //sonra yaratdigimiz obyektdeki deyisenleri istifade ederek menimsedirik
            //daha sonra obyektin deyiseninden istifade ederek deyisen.stream().filter() vasitesile yasi 30dan yuxari olanlari getiririk
            //mapla ustune 3 gelirik
            //daha sonra 3 il sonra yasi >30 olanlari filter vasitesile getiririk
            System.out.println(resultSet.getInt(1)+" "+
                    resultSet.getString(2)+" "+
                    resultSet.getString(3)+" "+
                    resultSet.getString(4)+" "+
                    resultSet.getInt(5));
        }



    }
}
