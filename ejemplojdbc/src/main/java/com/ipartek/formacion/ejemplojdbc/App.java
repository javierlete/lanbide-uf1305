package com.ipartek.formacion.ejemplojdbc;

import java.sql.*;

public class App 
{
	private static final String SQL_SELECT = "SELECT * FROM usuarios";
	private static final String SQL_SELECT_ID = "SELECT * FROM usuarios WHERE id=?";
	private static final String SQL_INSERT = "INSERT INTO usuarios (nombre, email, password) VALUES (?,?,?)";
	private static final String SQL_UPDATE = "UPDATE usuarios SET nombre=?,email=?,password=? WHERE id=?";
	private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id=?";
	// final String URL = "jdbc:mysql://localhost:3306/basededatosoesquema";
    private static final String URL = "jdbc:sqlite:tienda.db";
    // final String USER = "root";
    // final String PASS = "admin";
    
    public static void main( String[] args ) throws SQLException
    {
    	borrar(2L);
        obtenerTodos();
    	// obtenerPorId(1L);
        // insertar("Pedro", "pedro@email.net", "contrapedro");
        // modificar(1L, "Javier", "javier@email.net", "contraseña");
    	
    }
    
	private static void obtenerTodos() throws SQLException {
		Connection con = DriverManager.getConnection(URL); // , USER, PASS);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(SQL_SELECT);
        
        while(rs.next()) {
        	System.out.printf("%2s %-20s %-20s %-20s\n", rs.getLong("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("password"));	
        }
	}
	
	private static void obtenerPorId(Long id) throws SQLException {
		Connection con = DriverManager.getConnection(URL); // , USER, PASS);
        PreparedStatement pst = con.prepareStatement(SQL_SELECT_ID);
        
        pst.setLong(1, id);
        
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()) {
        	System.out.printf("%s\t%s\t%s\t%s\n", rs.getLong("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("password"));	
        } else {
        	System.out.println("No se ha encontrado el id " + id);
        }
	}

	private static void insertar(String nombre, String email, String password) throws SQLException {
		Connection con = DriverManager.getConnection(URL); // , USER, PASS);
        PreparedStatement pst = con.prepareStatement(SQL_INSERT);
        
        pst.setString(1, nombre);
        pst.setString(2, email);
        pst.setString(3, password);
        
        int numRegMod = pst.executeUpdate();

        System.out.println(numRegMod);
	}
	
	private static void modificar(Long id, String nombre, String email, String password) throws SQLException {
		Connection con = DriverManager.getConnection(URL); // , USER, PASS);
        PreparedStatement pst = con.prepareStatement(SQL_UPDATE);
        
        pst.setString(1, nombre);
        pst.setString(2, email);
        pst.setString(3, password);
        pst.setLong(4, id);
        
        int numRegMod = pst.executeUpdate();

        System.out.println(numRegMod);
	}

	private static void borrar(Long id) throws SQLException {
		Connection con = DriverManager.getConnection(URL); // , USER, PASS);
        PreparedStatement pst = con.prepareStatement(SQL_DELETE);
        
        pst.setLong(1, id);
        
        int numRegMod = pst.executeUpdate();

        System.out.println(numRegMod);
	}
}
