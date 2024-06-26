package View;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CadastroPaciente extends javax.swing.JFrame {

    public CadastroPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelDadosPaciente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jFTcpf = new javax.swing.JFormattedTextField();
        jFTrg = new javax.swing.JFormattedTextField();
        jFTtelefone = new javax.swing.JFormattedTextField();
        jFTcelular = new javax.swing.JFormattedTextField();
        jPanelPesquisaPaciente = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxFeminino = new javax.swing.JCheckBox();
        jCheckBoxMasculino = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cadastro de pacientes");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 20, 460, 40);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_login.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 10, 930, 60);

        jPanelDadosPaciente.setBackground(new java.awt.Color(153, 204, 255));
        jPanelDadosPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("RG:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Celular:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Email:");

        try {
            jFTcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanelPesquisaPaciente.setBackground(new java.awt.Color(102, 204, 255));
        jPanelPesquisaPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Telefone", "Celular", "Email", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        javax.swing.GroupLayout jPanelPesquisaPacienteLayout = new javax.swing.GroupLayout(jPanelPesquisaPaciente);
        jPanelPesquisaPaciente.setLayout(jPanelPesquisaPacienteLayout);
        jPanelPesquisaPacienteLayout.setHorizontalGroup(
            jPanelPesquisaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisaPacienteLayout.createSequentialGroup()
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPesquisaPacienteLayout.setVerticalGroup(
            jPanelPesquisaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel2.setText("Sexo:");

        jCheckBoxFeminino.setBackground(new java.awt.Color(153, 204, 255));
        jCheckBoxFeminino.setText("Feminino");

        jCheckBoxMasculino.setBackground(new java.awt.Color(153, 204, 255));
        jCheckBoxMasculino.setText("Masculino");

        javax.swing.GroupLayout jPanelDadosPacienteLayout = new javax.swing.GroupLayout(jPanelDadosPaciente);
        jPanelDadosPaciente.setLayout(jPanelDadosPacienteLayout);
        jPanelDadosPacienteLayout.setHorizontalGroup(
            jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPacienteLayout.createSequentialGroup()
                        .addComponent(jCheckBoxFeminino)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxMasculino))
                    .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jFTtelefone)
                        .addComponent(jFTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNome)
                        .addComponent(jFTcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addComponent(jFTrg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDadosPacienteLayout.setVerticalGroup(
            jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPacienteLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFTrg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPacienteLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosPacienteLayout.createSequentialGroup()
                                .addComponent(jFTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBoxFeminino)
                                .addComponent(jCheckBoxMasculino))
                            .addComponent(jLabel2))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jPanelPesquisaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanelDadosPaciente);
        jPanelDadosPaciente.setBounds(10, 80, 930, 290);

        btnNovo.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(20, 390, 130, 30);

        btnCadastrar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(160, 390, 130, 30);

        btnCancelar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(300, 390, 130, 30);

        btnExcluir.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(440, 390, 130, 30);

        btnSair.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(800, 390, 130, 30);

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_login.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 380, 930, 50);

        setSize(new java.awt.Dimension(961, 482));
        setLocationRelativeTo(null);
    }

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        if (jTablePacientes.getSelectedRow() != -1){
            txtNome.setText(jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 1).toString());
            jFTcpf.setText(jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 2).toString());
            jFTrg.setText(jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 3).toString());
            jFTtelefone.setText(jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 4).toString());
            jFTcelular.setText(jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 5).toString());
            txtEmail.setText(jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 6).toString());
        }
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    public JButton getBtnNovo() {
        return btnNovo;
    }

    public JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    public JButton getBtnSair() {
        return btnSair;
    }

    public JCheckBox getjCheckBoxFeminino() {
        return jCheckBoxFeminino;
    }

    public JCheckBox getjCheckBoxMasculino() {
        return jCheckBoxMasculino;
    }

    public JFormattedTextField getjFTcelular() {
        return jFTcelular;
    }

    public JFormattedTextField getjFTcpf() {
        return jFTcpf;
    }

    public JFormattedTextField getjFTrg() {
        return jFTrg;
    }

    public JFormattedTextField getjFTtelefone() {
        return jFTtelefone;
    }

    public JPanel getjPanelDadosPaciente() {
        return jPanelDadosPaciente;
    }

    public JPanel getjPanelPesquisaPaciente() {
        return jPanelPesquisaPaciente;
    }

    public JTable getjTablePacientes() {
        return jTablePacientes;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtPesquisa() {
        return txtPesquisa;
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
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPaciente().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JCheckBox jCheckBoxFeminino;
    private javax.swing.JCheckBox jCheckBoxMasculino;
    private javax.swing.JFormattedTextField jFTcelular;
    private javax.swing.JFormattedTextField jFTcpf;
    private javax.swing.JFormattedTextField jFTrg;
    private javax.swing.JFormattedTextField jFTtelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDadosPaciente;
    private javax.swing.JPanel jPanelPesquisaPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;

}
