package model.services;

import classes.Consulta;
import classes.Paciente;
import java.util.List;
import model.DAO.ConsultaDAO;

public class ConsultaServices {
    private ConsultaDAO consultaDAO = new ConsultaDAO();
    
    public boolean Agendar(Consulta consulta){
        return consultaDAO.Create(consulta);
    }
}
