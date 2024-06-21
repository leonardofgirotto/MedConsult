package Controller.Services;

import java.util.List;

import Controller.DAO.MedicoDAO;
import Model.Classes.Medico;

public class MedicoServices {
    private MedicoDAO medicoDAO = new MedicoDAO();
    
    public boolean cadastrar(Medico medico){
        return medicoDAO.Create(medico);
    }
    
    public List<Medico> Buscar(){
        return medicoDAO.Retrieve();
    }
    
    public boolean Atualizar(Medico medico){
        return medicoDAO.Update(medico);
    }
    
    public boolean Delete(String nome){
        return medicoDAO.Delete(nome);
    }
    
    public List<Medico> BuscarFiltrando (String nome){
        return medicoDAO.RetrieveFilter(nome);
    }
}
