package Controller.DAO;

import static Model.MedicoModel.medico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Classes.Medico;
import Model.Classes.Paciente;

public class MedicoDAO {
    public static boolean Create(Medico medico) {
        boolean estadoDaOperacao = true;

        Connection con = Controller.DAO.ConnectionFactory.getConnection();
        String sqlAExecutar = "INSERT INTO medico (nome, crm, cpf, rg, especialidade, telefone, celular, email, sexo) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sqlAExecutar);
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCrm());
            stmt.setString(3, medico.getCpf());
            stmt.setString(4, medico.getRg());
            stmt.setString(5, medico.getEspecialidade());
            stmt.setString(6, medico.getTelefone());
            stmt.setString(7, medico.getCelular());
            stmt.setString(8, medico.getEmail());
            stmt.setString(9, medico.getSexo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            estadoDaOperacao = false;
        }
        ConnectionFactory.closeConnection(con, stmt);
        return estadoDaOperacao;
    }

    public static List<Medico> Retrieve() {
        
        Connection con = Controller.DAO.ConnectionFactory.getConnection();
        
        String sqlAExecutar = "SELECT * FROM MEDICO";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Medico> listaMedicos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sqlAExecutar);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Medico medico = new Medico();
                medico.setNome(rs.getString("nome"));
                medico.setCrm(rs.getString("crm"));
                medico.setCpf(rs.getString("cpf"));
                medico.setRg(rs.getString("rg"));
                medico.setEspecialidade(rs.getString("especialidade"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setCelular(rs.getString("celular"));
                medico.setEmail(rs.getString("email"));
                medico.setSexo(rs.getString("sexo"));
                listaMedicos.add(medico);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
            return listaMedicos;
        }

    }

    public static boolean Update(Medico medico) {
        boolean estadoDaOperacao = true;
        PreparedStatement stmt = null;

        Connection con = ConnectionFactory.getConnection();
        String sqlAExecutar = "UPDATE medico SET "
                + " nome  = ?, "
                + " crm = ?, "
                + " cpf = ?,"
                + " rg = ?, "
                + " especialidade  = ?, "
                + " telefone   = ?, "
                + " celular    = ? "
                + " email    = ? "
                + " sexo    = ? ";
        try {
            stmt = con.prepareStatement(sqlAExecutar);
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCrm());
            stmt.setString(3, medico.getCpf());
            stmt.setString(4, medico.getRg());
            stmt.setString(5, medico.getEspecialidade());
            stmt.setString(6, medico.getTelefone());
            stmt.setString(7, medico.getCelular());
            stmt.setString(8, medico.getEmail());
            stmt.setString(9, medico.getSexo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            estadoDaOperacao = false;
        }
        ConnectionFactory.closeConnection(con, stmt);
        return estadoDaOperacao;
    }

    public static boolean Delete(String nome) {
        boolean estadoDaOperacao = true;

        Connection con = Controller.DAO.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sqlAExecutar = "DELETE FROM medico WHERE nome = ? ";
        try {
            stmt = con.prepareStatement(sqlAExecutar);
            stmt.setString(1, nome);
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
            estadoDaOperacao = false;
        }
        ConnectionFactory.closeConnection(con, stmt);
        return estadoDaOperacao;
    }
 
    public static List<Medico> RetrieveFilter(String nome) {
        Connection con = ConnectionFactory.getConnection();
        String sqlAExecutar = "SELECT * FROM MEDICO WHERE nome LIKE( ? )";
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<Medico> listaMedicos = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sqlAExecutar);
            stmt.setString(1, '%' + nome + '%');
            rs = stmt.executeQuery();

            while (rs.next()) {
                Medico medico = new Medico();
                medico.setNome(rs.getString("nome"));
                medico.setCrm(rs.getString("crm"));
                medico.setCpf(rs.getString("cpf"));
                medico.setRg(rs.getString("rg"));
                medico.setEspecialidade(rs.getString("especialidade"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setCelular(rs.getString("celular"));
                medico.setEmail(rs.getString("email"));
                medico.setSexo(rs.getString("sexo"));
                listaMedicos.add(medico);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
            return listaMedicos;
        }
    }
    
    public static Medico RetrieveFilterId(String nome) {
        Connection con = ConnectionFactory.getConnection();
        String sqlAExecutar = "SELECT * FROM MEDICO WHERE nome = ?";
        ResultSet rs = null;
        PreparedStatement stmt = null;
                        Medico medico = new Medico();
        try {
            stmt = con.prepareStatement(sqlAExecutar);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();

            while (rs.next()) {
                medico.setNome(rs.getString("nome"));
                medico.setCrm(rs.getString("crm"));
                medico.setCpf(rs.getString("cpf"));
                medico.setRg(rs.getString("rg"));
                medico.setEmail(rs.getString("email"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setCelular(rs.getString("celular"));
                medico.setSexo(rs.getString("sexo"));        
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
            return medico;
        }
    }        
}
