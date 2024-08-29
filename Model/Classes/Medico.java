package Model.Classes;

public class Medico extends Usuario{
    private String crm;
    private String especialidade;

    public Medico(int id, String nome, String cpf, String rg, String telefone, String celular, String email, String sexo) {
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico() {
        
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }  
}
