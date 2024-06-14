package Controller.Services;

import java.util.List;

import Controller.BD.PacienteBD;
import Model.Classes.Paciente;

public class PacienteServices {
    private PacienteBD pacienteBD = new PacienteBD();
    
    public boolean cadastrar(Paciente paciente){
        return pacienteBD.Create(paciente);
    }
    
     public List<Paciente> Buscar(){
        return pacienteBD.Retrieve();
    }
    
    public boolean Atualizar(Paciente paciente){
        return pacienteBD.Update(paciente);
    }
    
    public boolean Delete(int id){
        return pacienteBD.Delete(id);
    }
    
    public List<Paciente> BuscarFiltrando (String nome){
        return pacienteBD.RetrieveFilter(nome);
    }
    
    public Paciente BuscarFiltrandoId (int id){
        return pacienteBD.RetrieveFilterId(id);
    }    
}
