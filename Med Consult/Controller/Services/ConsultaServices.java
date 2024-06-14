package Controller.Services;

import java.util.List;

import Controller.BD.ConsultaBD;
import Model.Classes.Consulta;
import Model.Classes.Paciente;

public class ConsultaServices {
    private ConsultaBD consultaBD = new ConsultaBD();
    
    public boolean Agendar(Consulta consulta){
        return consultaBD.Create(consulta);
    }
}
