package classes;

public class Paciente extends Usuario{
    

    public Paciente(int id, String nome, String cpf, String rg, String email, String telefone, String celular, String sexo) {
        super (id, nome, cpf, rg, email, telefone, celular, sexo);
    }
    
    public Paciente(){
        
    } 
}
