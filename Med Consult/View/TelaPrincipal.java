package View;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Model.ConsultaModel;
import Model.MedicoModel;
import Model.PacienteModel;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        btnCadastroMedico = new javax.swing.JButton();
        btnCadastroPaciente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFecharAtalho = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemMedicos = new javax.swing.JMenuItem();
        jMenuItemPacientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemTelaAtalhos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrame1.setTitle("Clínica Médica");
        jInternalFrame1.setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCadastroMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_medico.png"))); // NOI18N
        btnCadastroMedico.setToolTipText("Médicos");
        btnCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroMedicoActionPerformed(evt);
            }
        });

        btnCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_paciente.png"))); // NOI18N
        btnCadastroPaciente.setToolTipText("Pacientes");
        btnCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroPacienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cadastros");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Agenda");

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_agenda.png"))); // NOI18N
        btnAgenda.setToolTipText("Agenda");
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastroPaciente)
                    .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gerenciamento");

        btnFecharAtalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_fechar.png"))); // NOI18N
        btnFecharAtalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAtalhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharAtalho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharAtalho, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(370, 10, 410, 210);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_principal.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 790, 370);

        jMenuCadastros.setText("Cadastros");

        jMenuItemMedicos.setText("Médicos");
        jMenuItemMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMedicosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemMedicos);

        jMenuItemPacientes.setText("Pacientes");
        jMenuItemPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacientesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemPacientes);

        jMenuBar1.add(jMenuCadastros);

        jMenu3.setText("Ferramentas");

        jMenuItemTelaAtalhos.setText("Tela de atalhos");
        jMenuItemTelaAtalhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaAtalhosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTelaAtalhos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemSair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(808, 421));
        setLocationRelativeTo(null);
    }

    private void jMenuItemMedicosActionPerformed(java.awt.event.ActionEvent evt) {
        CadastroMedico tela = new CadastroMedico();
        MedicoModel medicoController = new MedicoModel(tela);
        tela.setVisible(true);
        dispose();
    }

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btnCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {
        CadastroMedico tela = new CadastroMedico();
        MedicoModel medicoController = new MedicoModel(tela);
        tela.setVisible(true);
        dispose();
    }

    private void btnCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {
        CadastroPaciente tela = new CadastroPaciente();
        PacienteModel pacienteController = new PacienteModel(tela);
        tela.setVisible(true);
        dispose();
    }

    private void btnFecharAtalhoActionPerformed(java.awt.event.ActionEvent evt) {
        jInternalFrame1.dispose();
    }

    private void jMenuItemTelaAtalhosActionPerformed(java.awt.event.ActionEvent evt) {
        jInternalFrame1.setVisible(true);
    }

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {
        Agendamento tela = new Agendamento();
        ConsultaModel consultaController = new ConsultaModel(tela);
        tela.setVisible(true);
        dispose();
    }

    private void jMenuItemPacientesActionPerformed(java.awt.event.ActionEvent evt) {
        CadastroPaciente tela = new CadastroPaciente();
        PacienteModel pacienteController = new PacienteModel(tela);
        tela.setVisible(true);
        dispose();
    }

    public JButton getBtnAgenda() {
        return btnAgenda;
    }

    public JButton getBtnCadastroMedico() {
        return btnCadastroMedico;
    }

    public JButton getBtnCadastroPaciente() {
        return btnCadastroPaciente;
    }

    public JMenu getjMenuCadastros() {
        return jMenuCadastros;
    }

    public JMenuItem getjMenuItemMedicos() {
        return jMenuItemMedicos;
    }

    public JMenuItem getjMenuItemPacientes() {
        return jMenuItemPacientes;
    }

    public JMenuItem getjMenuItemSair() {
        return jMenuItemSair;
    }

    public JButton getBtnFecharAtalho() {
        return btnFecharAtalho;
    }

    public JInternalFrame getjInternalFrame1() {
        return jInternalFrame1;
    }

    public JMenu getjMenu3() {
        return jMenu3;
    }

    public JMenu getjMenu4() {
        return jMenu4;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public JMenuItem getjMenuItemTelaAtalhos() {
        return jMenuItemTelaAtalhos;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnCadastroMedico;
    private javax.swing.JButton btnCadastroPaciente;
    private javax.swing.JButton btnFecharAtalho;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemMedicos;
    private javax.swing.JMenuItem jMenuItemPacientes;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaAtalhos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
}
