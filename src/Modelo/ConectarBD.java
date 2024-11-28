package Modelo;

import java.sql.*;

public class ConectarBD
{
    private Connection conexion = null;
    private String servidor = "localhost:3306";
    private String database = "proyecto_autoservicio";
    private String usuario = "root";
    private String password = "";
    private String url = ""; //crear el link de conexion

    //constructor por defecto
    public ConectarBD(String servidor, String database, String usuario, String password)
    {
        try
        {
            this.servidor = servidor;
            this.database = database;
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion con la base de datos " + url + " ...Ok");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public ConectarBD()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion con la base de datos " + url + " ...Ok");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    //crear sentencias
    public PreparedStatement crearPreparedStatement(String sql) throws SQLException
    {
        return conexion.prepareStatement(sql);
    }
    
    //crear sentencias
    public Statement crearStatement() throws SQLException
    {
        return conexion.createStatement();
    }
    
    //controlar la conexion
    public Connection getConexion()
    {
        return conexion;
    }
    
    //controlar la conexion
    public Connection cerrarConexion()
    {
        try
        {
            conexion.close();
            System.out.println("Cerrando la conexion con al base de datos " + url + " ...Ok");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        conexion = null;
        return conexion;
    }
}