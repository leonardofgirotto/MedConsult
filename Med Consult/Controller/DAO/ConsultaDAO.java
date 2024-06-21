package Controller.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Classes.Consulta;

public class ConsultaDAO {

    public static boolean Create(Consulta consulta) {
        boolean estadoDaOperacao = true;
        Connection con = Controller.DAO.ConnectionFactory.getConnection();
        String sqlAExecutar = "INSERT INTO agenda (nomePaciente, nomeMedico, data, horario, motivo) values (?,?,?,?,?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sqlAExecutar);
            stmt.setString(1, consulta.getPaciente().getNome());
            stmt.setString(2, consulta.getMedico().getNome());
            java.util.Date utilDate = consulta.getData();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            stmt.setDate(3, sqlDate);
            stmt.setString(4, consulta.getHorario());
            stmt.setString(5, consulta.getMotivo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            estadoDaOperacao = false;
        }
        ConnectionFactory.closeConnection(con, stmt);
        return estadoDaOperacao;
        
    }
}
