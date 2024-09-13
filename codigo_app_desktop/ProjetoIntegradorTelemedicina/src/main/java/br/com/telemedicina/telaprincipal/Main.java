/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package br.com.telemedicina.telaprincipal;

import br.com.telemedicina.bd.BD;
import br.com.telemedicina.subtelas.AgendaConsulta;
import br.com.telemedicina.subtelas.AgendaExame;
import br.com.telemedicina.subtelas.HistoricoConsulta;
import br.com.telemedicina.subtelas.HistoricoExame;
import br.com.telemedicina.subtelas.HistoricoPrescricao;
import br.com.telemedicina.subtelas.NovaPrescricao;
import br.com.telemedicina.subtelas.TelaInicio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Talisson53899806
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form MainP
     */
    public Main() {
        initComponents();
        TelaInicio inicio = new TelaInicio(this, true);
        inicio.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedico = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();
        carregaDadosMedico = new javax.swing.JButton();
        botaoExcluirMed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nomeMedLabel = new javax.swing.JLabel();
        botaoNovoExame = new javax.swing.JButton();
        botaoNovaPrescricao = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        statusLabelPaciente = new javax.swing.JLabel();
        carregaDadosPaciente = new javax.swing.JButton();
        botaoExcluirPac = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nomePacientLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        historicoConsulta = new javax.swing.JMenuItem();
        novaConsulta = new javax.swing.JMenuItem();
        examesMenu = new javax.swing.JMenu();
        historicoExame = new javax.swing.JMenuItem();
        agendaExame = new javax.swing.JMenuItem();
        prescricoesMenu = new javax.swing.JMenu();
        historicoPrescricao = new javax.swing.JMenuItem();
        novaPrescricao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(46, 169, 248));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pacientes do dia");

        jTableMedico.setBackground(new java.awt.Color(255, 255, 255));
        jTableMedico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTableMedico.setForeground(new java.awt.Color(0, 0, 0));
        jTableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Paciente", "CPF", "Data nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMedico);

        carregaDadosMedico.setBackground(new java.awt.Color(0, 204, 0));
        carregaDadosMedico.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        carregaDadosMedico.setForeground(new java.awt.Color(255, 255, 255));
        carregaDadosMedico.setText("Carregar Dados");
        carregaDadosMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        carregaDadosMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaDadosMedicoActionPerformed(evt);
            }
        });

        botaoExcluirMed.setBackground(new java.awt.Color(255, 0, 0));
        botaoExcluirMed.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluirMed.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirMed.setText("Excluir");
        botaoExcluirMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirMedActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addContainerGap(344, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carregaDadosMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carregaDadosMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        nomeMedLabel.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        nomeMedLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeMedLabel.setText("Olá {Médico}");
        jPanel2.add(nomeMedLabel);
        nomeMedLabel.setBounds(19, 40, 240, 57);

        botaoNovoExame.setBackground(new java.awt.Color(242, 242, 242));
        botaoNovoExame.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botaoNovoExame.setForeground(new java.awt.Color(0, 0, 0));
        botaoNovoExame.setText("Novo Exame");
        botaoNovoExame.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        botaoNovoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoExameActionPerformed(evt);
            }
        });
        jPanel2.add(botaoNovoExame);
        botaoNovoExame.setBounds(490, 110, 103, 40);

        botaoNovaPrescricao.setBackground(new java.awt.Color(242, 242, 242));
        botaoNovaPrescricao.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botaoNovaPrescricao.setForeground(new java.awt.Color(0, 0, 0));
        botaoNovaPrescricao.setText("Nova Prescrição");
        botaoNovaPrescricao.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        botaoNovaPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovaPrescricaoActionPerformed(evt);
            }
        });
        jPanel2.add(botaoNovaPrescricao);
        botaoNovaPrescricao.setBounds(610, 110, 129, 40);

        jSplitPane1.setRightComponent(jPanel2);

        jTabbedPane1.addTab("Médico", jSplitPane1);

        jSplitPane2.setDividerLocation(350);
        jSplitPane2.setDividerSize(0);

        jPanel3.setBackground(new java.awt.Color(46, 169, 248));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consultas");

        jTablePaciente.setBackground(new java.awt.Color(255, 255, 255));
        jTablePaciente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTablePaciente.setForeground(new java.awt.Color(0, 0, 0));
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Médico", "Horário Marcado", "Modelo de Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePaciente);

        carregaDadosPaciente.setBackground(new java.awt.Color(0, 204, 0));
        carregaDadosPaciente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        carregaDadosPaciente.setForeground(new java.awt.Color(255, 255, 255));
        carregaDadosPaciente.setText("Carregar Dados");
        carregaDadosPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        carregaDadosPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaDadosPacienteActionPerformed(evt);
            }
        });

        botaoExcluirPac.setBackground(new java.awt.Color(255, 0, 0));
        botaoExcluirPac.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluirPac.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirPac.setText("Excluir");
        botaoExcluirPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluirPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirPacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(carregaDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluirPac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(statusLabelPaciente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carregaDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirPac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        nomePacientLabel.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        nomePacientLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomePacientLabel.setText("Olá {Paciente}");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nomePacientLabel)
                .addContainerGap(1212, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(nomePacientLabel)
                .addContainerGap(656, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel4);

        jTabbedPane1.addTab("Paciente", jSplitPane2);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, -40, 1840, 790);

        jMenu3.setText("Consultas");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        historicoConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoConsulta.setText("Histórico de consultas");
        historicoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(historicoConsulta);

        novaConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        novaConsulta.setText("Nova Consulta");
        novaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(novaConsulta);

        menuBar.add(jMenu3);

        examesMenu.setText("Exames");
        examesMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        historicoExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoExame.setText("Histórico de Exames");
        historicoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoExameActionPerformed(evt);
            }
        });
        examesMenu.add(historicoExame);

        agendaExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agendaExame.setText("Agendar Exames");
        agendaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaExameActionPerformed(evt);
            }
        });
        examesMenu.add(agendaExame);

        menuBar.add(examesMenu);

        prescricoesMenu.setText("Prescrições");
        prescricoesMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        historicoPrescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoPrescricao.setText("Histórico de Prescrições");
        historicoPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoPrescricaoActionPerformed(evt);
            }
        });
        prescricoesMenu.add(historicoPrescricao);

        novaPrescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        novaPrescricao.setText("Nova Prescrição");
        novaPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaPrescricaoActionPerformed(evt);
            }
        });
        prescricoesMenu.add(novaPrescricao);

        menuBar.add(prescricoesMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoExameActionPerformed
        AgendaExame exame = new AgendaExame();
        this.desktopPane.add(exame);
        exame.setVisible(true);
    }//GEN-LAST:event_botaoNovoExameActionPerformed

    private void historicoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoConsultaActionPerformed
        HistoricoConsulta histoConsulta = new HistoricoConsulta();
        this.desktopPane.add(histoConsulta);
        histoConsulta.setVisible(true);
    }//GEN-LAST:event_historicoConsultaActionPerformed

    private void novaPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaPrescricaoActionPerformed
        NovaPrescricao prescricao = new NovaPrescricao();
        this.desktopPane.add(prescricao);
        prescricao.setVisible(true);
    }//GEN-LAST:event_novaPrescricaoActionPerformed

    private void novaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaConsultaActionPerformed
        AgendaConsulta consulta = new AgendaConsulta();
        this.desktopPane.add(consulta);
        consulta.setVisible(true);
    }//GEN-LAST:event_novaConsultaActionPerformed

    private void carregaDadosMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaDadosMedicoActionPerformed
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {
            this.statusLabel.setText("Status: Conectado ao Banco de Dados!!");
        } else {
            this.statusLabel.setText("Status: Não conectado ao Banco de dados!!");
            return; // Se não conectar ao banco, não faz sentido continuar
        }

        String query = "SELECT nome, cpf, dataNascimento FROM Paciente WHERE ID <= 10";
        PreparedStatement ps = banco.getPreparedStatement(query);
        
        try {
            ResultSet rs = ps.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) this.jTableMedico.getModel();
            if (model.getRowCount() > 0) {
                model.setNumRows(0);
            }

            
            while (rs.next()) {
               String[] dados = { rs.getString("nome"),
                                  rs.getString("cpf"),
                                  rs.getDate("dataNascimento").toString()}; 
               
               model.addRow(dados);
            }
            this.jTableMedico.setModel(model);
            rs.close();
            ps.close();
            banco.encerrarConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
            "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
        }
    
    }//GEN-LAST:event_carregaDadosMedicoActionPerformed

    private void carregaDadosPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaDadosPacienteActionPerformed
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {
            this.statusLabelPaciente.setText("Status: Conectado ao Banco de Dados!!");
        } else {
            this.statusLabelPaciente.setText("Status: Não conectado ao Banco de dados!!");
            return; // Se não conectar ao banco, não faz sentido continuar
        }

        String query = "SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO WHERE m.enderecoMed LIKE '%DF'";
        PreparedStatement ps = banco.getPreparedStatement(query);
        
        try {
            ResultSet rs = ps.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) this.jTablePaciente.getModel();
            if (model.getRowCount() > 0) {
                model.setNumRows(0);
            }

            
            while (rs.next()) {
               String[] dados = { rs.getString("m.nomeMed"),
                                  rs.getDate("cs.dataConsulta").toString(),
                                  rs.getString("cs.formatoConsulta")}; 
               
               model.addRow(dados);
            }
            this.jTablePaciente.setModel(model);
            rs.close();
            ps.close();
            banco.encerrarConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
            "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_carregaDadosPacienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         //ler o arquivo que contem as informacao de quem esta logado no sistema
       try (BufferedReader br = new BufferedReader(new FileReader("sessao"))) {
           //verificar qual o tipo de quem esta logado (medico ou paciente)
           String linha;
           String[] dados = {};
           
           while ((linha = br.readLine()) != null) {
               dados = linha.split(",");
           }
           
           if(dados[1].equals("Médico")) {
                //ativar a aba correspondente
                this.jTabbedPane1.removeTabAt(1);
           } else if (dados[1].equals("Paciente")) {
               //ativar a aba correspondente
                this.jTabbedPane1.removeTabAt(0);
                
                //Remove as opções de menu para Agendar exame e Nova prescrição
                this.examesMenu.remove(agendaExame);
                this.prescricoesMenu.remove(novaPrescricao);
           }        
           
       } catch (IOException e) {
           JOptionPane.showMessageDialog(this,
                   "Não foi possível iniciar o sistema!! Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_formWindowOpened

    private void agendaExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaExameActionPerformed
        AgendaExame exame = new AgendaExame();
        this.desktopPane.add(exame);
        exame.setVisible(true);
    }//GEN-LAST:event_agendaExameActionPerformed

    private void historicoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoExameActionPerformed
        HistoricoExame histoExame = new HistoricoExame();
        this.desktopPane.add(histoExame);
        histoExame.setVisible(true);
    }//GEN-LAST:event_historicoExameActionPerformed

    private void historicoPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoPrescricaoActionPerformed
        HistoricoPrescricao histoPrescricao = new HistoricoPrescricao();
        this.desktopPane.add(histoPrescricao);
        histoPrescricao.setVisible(true);
    }//GEN-LAST:event_historicoPrescricaoActionPerformed

    private void botaoExcluirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirMedActionPerformed
        int linhaSelecionada = this.jTableMedico.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Favor selecione um registro para excluir!");
            return;
        }
        
        String idPaciente =
                (String) this.jTableMedico.getValueAt(linhaSelecionada, 0);
        
        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir o Paciente " + idPaciente + "?",
                "Excluir", JOptionPane.OK_CANCEL_OPTION);
        
        if (opcao == 0) {
            BD banco = new BD();
            banco.conectaBD();
            
            String query2 = "DELETE FROM Consulta WHERE ID_PACIENTE = (SELECT ID FROM Paciente WHERE nome = ?)";
            String query = "DELETE FROM Paciente WHERE nome = ?";
            
            try (PreparedStatement ps =banco.getPreparedStatement(query)){
                ps.setString(1, query2);
                ps.setString(1, query);
                boolean linhaApagada = ps.execute();
                
                 
                if (linhaApagada == false) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.jTableMedico.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this,
                            "Registro excluido com sucesso!!");
                
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Nenhum registro encontrado para excluir.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao excluir o registro: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                return;
            }
        }
    }//GEN-LAST:event_botaoExcluirMedActionPerformed

    private void botaoExcluirPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirPacActionPerformed
        int linhaSelecionada = this.jTablePaciente.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Favor selecione um registro para excluir!");
            return;
        }
        
        String idMedico =
                (String) this.jTablePaciente.getValueAt(linhaSelecionada, 0);
        
        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir a Consulta com " + idMedico + "?",
                "Excluir", JOptionPane.OK_CANCEL_OPTION);
        
        if (opcao == 0) {
            BD banco = new BD();
            banco.conectaBD();
            
            String query2 = "DELETE FROM Consulta WHERE ID_MEDICO = (SELECT ID FROM Medico WHERE nomeMed = ?)";
            String query = "DELETE FROM Medico WHERE nomeMed = ?";
            
            try (PreparedStatement ps =banco.getPreparedStatement(query)){
                ps.setString(1, query2);
                ps.setString(1, query);
                boolean linhaApagada = ps.execute();
                
                 
                if (linhaApagada == false) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.jTablePaciente.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this,
                            "Registro excluido com sucesso!!");
                
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Nenhum registro encontrado para excluir.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao excluir o registro: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                return;
            }
        }
    }//GEN-LAST:event_botaoExcluirPacActionPerformed

    private void botaoNovaPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovaPrescricaoActionPerformed
        NovaPrescricao prescricao = new NovaPrescricao();
        this.desktopPane.add(prescricao);
        prescricao.setVisible(true);
    }//GEN-LAST:event_botaoNovaPrescricaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agendaExame;
    private javax.swing.JButton botaoExcluirMed;
    private javax.swing.JButton botaoExcluirPac;
    private javax.swing.JButton botaoNovaPrescricao;
    private javax.swing.JButton botaoNovoExame;
    private javax.swing.JButton carregaDadosMedico;
    private javax.swing.JButton carregaDadosPaciente;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu examesMenu;
    private javax.swing.JMenuItem historicoConsulta;
    private javax.swing.JMenuItem historicoExame;
    private javax.swing.JMenuItem historicoPrescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableMedico;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nomeMedLabel;
    private javax.swing.JLabel nomePacientLabel;
    private javax.swing.JMenuItem novaConsulta;
    private javax.swing.JMenuItem novaPrescricao;
    private javax.swing.JMenu prescricoesMenu;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusLabelPaciente;
    // End of variables declaration//GEN-END:variables

}
