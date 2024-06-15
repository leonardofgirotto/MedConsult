package Controller.Services;

import java.util.List;

import Controller.DAO.MedicoDAO;
import Model.Classes.Medico;

public class MedicoServices {
    private MedicoDAO medicoBD = new MedicoDAO();
    
    public boolean cadastrar(Medico medico){
        return medicoBD.Create(medico);
    }
    
    public List<Medico> Buscar(){
        return medicoBD.Retrieve();
    }
    
    public boolean Atualizar(Medico medico){
        return medicoBD.Update(medico);
    }
    
    public boolean Delete(int id){
        return medicoBD.Delete(id);
    }
    
    public List<Medico> BuscarFiltrando (String nome){
        return medicoBD.RetrieveFilter(nome);
    }
    
    public Medico BuscarFiltrandoId (int id){
        return medicoBD.RetrieveFilterId(id);
    }
}
