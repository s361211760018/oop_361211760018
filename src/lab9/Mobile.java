package lab9;

import java.sql.*;
import java.util.ArrayList;

public class Mobile {
    public static void main(String[] args) {
        //step1 : load driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load driver successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //step2 : Create Connection
        ArrayList<Employee> myEMP = new ArrayList<Employee>();
        String SQCONN = "jdbc:sqlite:SqliteStudio.sqlite";

                Connection conn = null;
                if (conn == null){
                    System.out.println("Could not connect to database.");
                }else{
                    System.out.println("Connected to database.");
                }

                //step3 : Create Statement
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String sql = "select * from Mobile";
            ResultSet rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 : display data from database
        System.out.println("Mobile Information");
        while (rs.next()){
            //System.out.println("##############");
            //System.out.println("Mobile ID: "+rs.getInt(1));
            //System.out.println("brand: "+rs.getString(2));
            //System.out.println("generation: "+rs.getString(3));
            //System.out.println("system: "+rs.getDouble(4));
            Employee emp = new Employee(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4));
            myEMP.add(emp);



        }



    }//main
}//class



