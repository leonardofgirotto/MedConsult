package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Agendamento;
import view.CadastroMedico;
import view.CadastroPaciente;
import view.TelaPrincipal;

public class PrincipalController implements ActionListener{
    TelaPrincipal telaPrincipal;
    

    public PrincipalController(TelaPrincipal telaPrincipal){
        this.telaPrincipal = telaPrincipal;
        this.telaPrincipal.getBtnAgenda().addActionListener(this);
        this.telaPrincipal.getBtnCadastroMedico().addActionListener(this);
        this.telaPrincipal.getBtnCadastroPaciente().addActionListener(this);
        this.telaPrincipal.getjMenuItemMedicos().addActionListener(this);
        this.telaPrincipal.getjMenuItemPacientes().addActionListener(this);
        this.telaPrincipal.getjMenuItemSair().addActionListener(this);
        this.telaPrincipal.getjMenuItemTelaAtalhos().addActionListener(this);
        this.telaPrincipal.getBtnFecharAtalho().addActionListener(this);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
