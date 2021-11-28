package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.funcionario;

public class FuncionarioDAO {
	public void cadastraFuncionario(funcionario Funcionario) {
		String sql = "INSERT INTO funcionariocafe VALUES (?,?,?)";
		PreparedStatement pStatment = null;
		Connection conn = null;
		
		try {
			conn = new MySQLConnection().getConnection();
			pStatment = conn.prepareStatement(sql);
			pStatment.setString(1, Funcionario.getNome());
			pStatment.setString(2, Funcionario.getCpf());
			pStatment.setString(3, Funcionario.getItem());
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pStatment!=null)
					pStatment.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null)
				pStatment.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public ArrayList<funcionario> BuscaFuncionario (String nome){
		ArrayList<funcionario> Funcionario = null;
		String sql = "SELECT * FROM funcionariocafe";
		PreparedStatement pStatment = null;
		Connection conn = null;
		
		return Funcionario;
	}
}
