package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EsameBeanDAO {
	
	public synchronized int doSave(EsameBean eb) throws IOException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DriverManagerConnectionPool.getConnection();
			
			String query = null;
			
			query = "INSERT INTO esame(CodiceEsame, Nome, CFU, OreLezione, Semestre) "
					   + "values (?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, eb.getCodiceEsame());
			ps.setString(2, eb.getNome());
			ps.setInt(3, eb.getCFU());
			ps.setInt(4, eb.getOreLezione());
			ps.setString(5, eb.getSemestre());
						
			int i = ps.executeUpdate();
			if(i != 0) {
				return eb.getCodiceEsame();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public synchronized boolean doSaveOrUpdate(EsameBean eb) throws IOException {
		Connection conn = null;
		PreparedStatement ps = null;
	
		try {
			conn = DriverManagerConnectionPool.getConnection();
		
			String query = null;
			ResultSet result= ps.executeQuery("SELECT CodiceEsame FROM esame WHERE CodiceEsame='"+eb.getCodiceEsame()+"'");

			if(result.next()) {
				query="UPDATE esame SET Nome=?, CFU=?, OreLezione=?, Semestre=? WHERE CodiceEsame=?";
				ps = conn.prepareStatement(query);
			
				ps.setString(1, eb.getNome());
				ps.setInt(2, eb.getCFU());
				ps.setInt(3,eb.getOreLezione());
				ps.setString(4, eb.getSemestre());
				ps.setInt(5, eb.getCodiceEsame());
			
				int i = ps.executeUpdate();
				if(i != 0)
					return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public synchronized EsameBean doRetrieveByKey(int codiceEsame) {
		EsameBean eb = new EsameBean();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {	
			conn = DriverManagerConnectionPool.getConnection(); 
	
			String query = "SELECT * FROM esame WHERE CodiceEsame= ?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, codiceEsame);

			ResultSet items = ps.executeQuery();

			while(items.next()) {
				eb.setCodiceEsame(codiceEsame);
				eb.setNome(items.getString("Nome"));
				eb.setCFU(items.getInt("CFU"));
				eb.setOreLezione(items.getInt("OreLezione"));
				eb.setSemestre(items.getString("Semestre"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return eb;
	}
	
	public synchronized ArrayList<EsameBean> doRetriveAll() throws ClassNotFoundException, SQLException {
		ArrayList<EsameBean> lista = new ArrayList<EsameBean>();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {	
			conn = DriverManagerConnectionPool.getConnection(); 
			String query = "SELECT * FROM esame";

			ps = conn.prepareStatement(query);
			
			ResultSet items = ps.executeQuery();

			while(items.next()) {
				EsameBean eb = new EsameBean();
				eb.setCodiceEsame(items.getInt("CodiceEsame"));
				eb.setNome(items.getString("Nome"));
				eb.setCFU(items.getInt("CFU"));
				eb.setOreLezione(items.getInt("OreLezione"));
				eb.setSemestre(items.getString("Semestre"));
				
				lista.add(eb);
				}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public synchronized boolean doDelete(int codiceEsame) throws IOException {
		Connection conn = null;
		PreparedStatement ps = null;
			
		try {	
			conn = DriverManagerConnectionPool.getConnection(); 
				
			String query = "DELETE FROM esame WHERE CodiceEsame=?";

			ps = conn.prepareStatement(query);
			ps.setInt(1, codiceEsame);
				
			int i = ps.executeUpdate();
			if(i != 0) 
				return true;			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}