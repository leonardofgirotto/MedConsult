package Controller.Services;

import java.util.List;

import Controller.DAO.PacienteDAO;
import Model.Classes.Paciente;

public class PacienteServices {
    private PacienteDAO pacienteDAO = new PacienteDAO();
    
    public boolean cadastrar(Paciente paciente){
        return pacienteDAO.Create(paciente);
    }
    
     public List<Paciente> Buscar(){
        return pacienteDAO.Retrieve();
    }
    
    public boolean Atualizar(Paciente paciente){
        return pacienteDAO.Update(paciente);
    }
    
    public boolean Delete(String nome){
        return pacienteDAO.Delete(nome);
    }
    
    public List<Paciente> BuscarFiltrando (String nome){
        return pacienteDAO.RetrieveFilter(nome);
    }
}
