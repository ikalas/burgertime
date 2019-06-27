package be.laurent.burgertime;

import java.sql.*;

public class HamburgerDAO {

    private String url ="jdbc:mysql://burgertime.cxlyqcwa0kgo.eu-west-3.rds.amazonaws.com/burgertime";
    private String user ="admin";
    private String pwd ="Laurent1310";

    public void Connect(){
        try {
            Connection connection = DriverManager.getConnection(url, user, pwd);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from Hamburger");
            ResultSetMetaData resultMeta = rs.getMetaData();

            System.out.println("\n**********************************");
            for(int i = 1;i<= resultMeta.getColumnCount();i++){
                System.out.println("\t"+ resultMeta.getColumnName(i).toUpperCase() +"\t *");
            }

            System.out.println("\n**********************************");

            while (rs.next()){
                for(int i = 1;i<= resultMeta.getColumnCount(); i++){
                    System.out.println("\t"+ rs.getObject(i).toString()+ "\t |");
                }
                System.out.println("\n**********************************");
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
