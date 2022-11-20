package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public  Connection getConnection(){
        Connection connection=null;
        String url="jdbc:mysql://localhost:3306/school";
        String user="Sangti";
        String password="Atykonyak1#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,user,password);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return connection;

    }

    public void deleteStudentData(){
      // call getConnection() method
        //execute delete query
       Connection connection=getConnection();
       String query="DELETE FROM STUDENT WHERE ROLLNO=11";
       try {
           Statement statement = connection.createStatement();
          int row= statement.executeUpdate(query);
           System.out.println(row);
       }
       catch (SQLException e)
       {
           e.printStackTrace();
       }

    }

    public void updateStudentData(){
        // call getConnection() method
       Connection connection=getConnection();
       String query="UPDATE STUDENT SET STUDENT_NAME='JAITOK',AGE=20 WHERE MARKS=678 AND ROLLNO=15";
        try {
            Statement statement = connection.createStatement();
            int row= statement.executeUpdate(query);
            System.out.println(row);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        //execute update query
    }

    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
    }
}
