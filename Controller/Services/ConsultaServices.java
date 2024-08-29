package Controller.Services;

import java.util.List;

import Controller.DAO.ConsultaDAO;
import Model.Classes.Consulta;

public class ConsultaServices {
    private ConsultaDAO consultaDAO = new ConsultaDAO();
    
    public boolean Agendar(Consulta consulta){
        return consultaDAO.Create(consulta);
    }
}
