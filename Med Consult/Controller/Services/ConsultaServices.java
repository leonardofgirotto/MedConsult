package Controller.Services;

import java.util.List;

import Controller.DAO.ConsultaDAO;
import Model.Classes.Consulta;
import Model.Classes.Paciente;

public class ConsultaServices {
    private ConsultaDAO consultaBD = new ConsultaDAO();
    
    public boolean Agendar(Consulta consulta){
        return consultaBD.Create(consulta);
    }
}
