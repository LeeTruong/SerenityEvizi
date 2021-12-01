package com.evizi.carhire.railinc.screenplay.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class DBconn {

    public static ArrayList<ArrayList<String>> runSelectQuery(String sql) throws SQLException {

        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=raildevvip.railinc.com)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=raildev)))";

        //properties for creating connection to Oracle database
        Properties props = new Properties();

        props.setProperty("user", "DPRE");
        props.setProperty("password", "DPRE");
        int columnsNumber;
        ArrayList<String> resultList = new ArrayList<>();
        ArrayList<ArrayList<String>> multipleResults = new ArrayList<>();
        //Hashtable<String,String> resultList1 =new Hashtable<String,String>();

        //creating connection to Oracle database using JDBC
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, props);

            PreparedStatement preStatement = conn.prepareStatement(sql);

            ResultSet result = preStatement.executeQuery();
            ResultSetMetaData rsmd = result.getMetaData();

            columnsNumber = rsmd.getColumnCount();

            while (result.next()) {

                for (int i = 1; i <= columnsNumber; i++) {
//                            resultList1.put(rsmd.getColumnName(i), result.getString(i));
                    resultList.add(result.getString(i));
                }
                multipleResults.add(resultList);
                resultList = new ArrayList<>();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
        }
        return multipleResults;
    }


    public static String selectQuery(String sql) throws SQLException {

//		String url = "jdbc:oracle:thin:@localhost:1521:SHIPDEV"; 
        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=raildevvip.railinc.com)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=raildev)))";
//		String url = "jdbc:oracle:thin:@shipdevvip:1521:shipdevvip"; 

        //properties for creating connection to Oracle database
        Properties props = new Properties();
        props.setProperty("user", "DPRE");
        props.setProperty("password", "DPRE");

        int columnsNumber;
//        int cnt = 0;
        String sqlOutput = null;

        //creating connection to Oracle database using JDBC
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, props);

            PreparedStatement preStatement = conn.prepareStatement(sql);

            ResultSet result = preStatement.executeQuery();
//		       result.next();
//		       System.out.println(result.getString("Train_id") +"---"+ result.getString("mark_name"));
            while (result.next()) {
                System.out.println(result.getString(1));
                sqlOutput = result.getString(1);
//                cnt++;
            }
//		        System.out.println("done "+ cnt);
//		        return sqlOutput;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
        }
        return sqlOutput;
    }

    public static ArrayList<ArrayList<String>> updateQuery(String sql) throws SQLException {

        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=raildevvip.railinc.com)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=raildev)))";

        //properties for creating connection to Oracle database
        Properties props = new Properties();
        props.setProperty("user", "DPRE");
        props.setProperty("password", "DPRE");

        //creating connection to Oracle database using JDBC
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, props);

            PreparedStatement preStatement = conn.prepareStatement(sql);

            int result = preStatement.executeUpdate();
            System.out.println("Update result " + result);

//		        while(result.next()){
//		            System.out.println(result.getString("route_id") +"---"+ result.getString("carrier_name"));
//		        }
            System.out.println("done");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            conn.close();

        }
        return null;

    }

    public static ArrayList<ArrayList<String>> runSelectQuery1(String sql) throws SQLException {

        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=ssodevvip.railinc.com)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ssodev)))";

//properties for creating connection to Oracle database
        Properties props = new Properties();
        props.setProperty("user", "RSSO");
        props.setProperty("password", "RSSO");
        int columnsNumber;
        ArrayList<String> resultList = new ArrayList<>();
        ArrayList<ArrayList<String>> multipleResults = new ArrayList<>();
//Hashtable<String,String> resultList1 =new Hashtable<String,String>();

//creating connection to Oracle database using JDBC
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, props);

            PreparedStatement preStatement = conn.prepareStatement(sql);

            ResultSet result = preStatement.executeQuery();
            ResultSetMetaData rsmd = result.getMetaData();

            columnsNumber = rsmd.getColumnCount();

            while (result.next()) {

                for (int i = 1; i <= columnsNumber; i++) {
//                     resultList1.put(rsmd.getColumnName(i), result.getString(i));
                    resultList.add(result.getString(i));
                }
                multipleResults.add(resultList);
                resultList = new ArrayList<>();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
        }
        return multipleResults;
    }

    public static String selectQuery1(String sql) throws SQLException {

//	String url = "jdbc:oracle:thin:@localhost:1521:SHIPDEV"; 
        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=ssodevvip.railinc.com)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ssodev)))";
//	String url = "jdbc:oracle:thin:@shipdevvip:1521:shipdevvip"; 

        //properties for creating connection to Oracle database
        Properties props = new Properties();
        props.setProperty("user", "RSSO");
        props.setProperty("password", "RSSO");
        int columnsNumber;
// int cnt = 0;
        String sqlOutput = null;
        //creating connection to Oracle database using JDBC
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, props);

            PreparedStatement preStatement = conn.prepareStatement(sql);

            ResultSet result = preStatement.executeQuery();
//	        result.next();
//	       System.out.println(result.getString("Train_id") +"---"+ result.getString("mark_name"));
            while (result.next()) {
                System.out.println(result.getString(1));
                sqlOutput = result.getString(1);

//	        	cnt++;
            }
//	        System.out.println("done "+ cnt);
//	        return sqlOutput;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
        }
        return sqlOutput;
    }


}