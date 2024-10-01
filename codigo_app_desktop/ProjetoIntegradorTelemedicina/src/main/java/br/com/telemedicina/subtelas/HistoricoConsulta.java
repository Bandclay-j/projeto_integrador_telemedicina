/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telemedicina.subtelas;

import br.com.telemedicina.bd.BD;
import br.com.telemedicina.repository.ClinicaRepository;
import br.com.telemedicina.repository.MedicoRepository;
import br.com.telemedicina.repository.PacienteRepository;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Talisson53899806
 */
public class HistoricoConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form historicoConsulta
     */
    public HistoricoConsulta() {
        initComponents();
    }
    
    PacienteRepository pacRepo = new PacienteRepository();
    
    MedicoRepository   medRepo = new MedicoRepository();
    
    ClinicaRepository  cliRepo = new ClinicaRepository();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistoricoConsulta = new javax.swing.JTable();
        botaoConsulta = new javax.swing.JButton();
        botaoExcluirMed = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();

        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 0));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jSplitPane1.setDividerLocation(280);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(46, 169, 248));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagemHistoricoConsulta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Histórico de Consultas");

        tabelaHistoricoConsulta.setBackground(new java.awt.Color(102, 102, 102));
        tabelaHistoricoConsulta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tabelaHistoricoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        tabelaHistoricoConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Médico", "Data Consulta", "Formato Consulta", "Valor Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaHistoricoConsulta.setToolTipText("");
        jScrollPane1.setViewportView(tabelaHistoricoConsulta);

        botaoConsulta.setBackground(new java.awt.Color(204, 102, 0));
        botaoConsulta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        botaoConsulta.setText("Consultar");
        botaoConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaActionPerformed(evt);
            }
        });

        botaoExcluirMed.setBackground(new java.awt.Color(204, 0, 0));
        botaoExcluirMed.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluirMed.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirMed.setText("Excluir");
        botaoExcluirMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirMedActionPerformed(evt);
            }
        });

        botaoEditar.setBackground(new java.awt.Color(0, 0, 204));
        botaoEditar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 201, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
        int idPaciente = pacRepo.getIdByEmailArquivo(); //Obtem o ID do paciente pelo email no arquivo
        
        if (idPaciente != 0) { //Verifica se o id foi encontrado
            BD banco = new BD();
            banco.conectaBD();
            
            //Consulta modificada para filtrar pelo ID do Paciente
            String query = "SELECT cs.ID, m.nomeMed, cs.dataConsulta, cs.formatoConsulta, cs.pagamentoConsulta " +
                           "FROM Consulta cs " +
                           "INNER JOIN Medico m ON m.ID = cs.ID_MEDICO " +
                           "WHERE cs.ID_PACIENTE = ?";
            
            
            
            try {
                PreparedStatement ps = banco.getPreparedStatement(query);
                ps.setInt(1, idPaciente); //Define o ID do paciente como parâmetro da consulta
            
                ResultSet rs = ps.executeQuery();
                
                DefaultTableModel model = (DefaultTableModel) this.tabelaHistoricoConsulta.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }
                
                while (rs.next()) {
                    String[] dados = {  rs.getString("cs.ID"),
                                        rs.getString("m.nomeMed"),
                                        rs.getDate("cs.dataConsulta").toString(),
                                        rs.getString("cs.formatoConsulta"),
                                        rs.getString("cs.pagamentoConsulta")};
                    
                    model.addRow(dados);
                }
                
                this.tabelaHistoricoConsulta.setModel(model);
                rs.close();
                ps.close();
                banco.encerrarConexao();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível fazer a consulta no BD! Error: " + ex.getMessage());
                
            }
            
        } else {
            JOptionPane.showMessageDialog(this,
                    "Paciente não encontrado");
        }
    }//GEN-LAST:event_botaoConsultaActionPerformed

    private void botaoExcluirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirMedActionPerformed
        int linhaSelecionada = this.tabelaHistoricoConsulta.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                "Favor selecione um histórico para excluir!");
            return;
        }

        String idPaciente =
        (String) this.tabelaHistoricoConsulta.getValueAt(linhaSelecionada, 0);

        int opcao = JOptionPane.showConfirmDialog(this,
            "Deseja realmente excluir a Consulta " + idPaciente + "?",
            "Excluir", JOptionPane.OK_CANCEL_OPTION);

        if (opcao == 0) {
            BD banco = new BD();
            banco.conectaBD();

            String query3 = "DELETE FROM Consulta cs WHERE cs.ID_MEDICO = (SELECT ID FROM Medico m WHERE m.nomeMed = ?)";
            String query = "DELETE FROM Consulta cs WHERE cs.ID = ?";

            try (PreparedStatement ps =banco.getPreparedStatement(query)){
                ps.setString(1, query3);
                ps.setString(1, query);
                ps.setString(1, idPaciente);
                boolean linhaApagada = ps.execute();

                if (linhaApagada == false) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.tabelaHistoricoConsulta.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this,
                        "Histórico excluido com sucesso!!");
                    
                    botaoConsultaActionPerformed(evt);

                } else {
                    JOptionPane.showMessageDialog(this,
                        "Nenhum histórico encontrado para excluir.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                    "Erro ao excluir o histórico: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                return;
            }
        }
    }//GEN-LAST:event_botaoExcluirMedActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        int linhaSelecionada = this.tabelaHistoricoConsulta.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Favor selecione um registro para editar!!!");
            
            return;
        }
        
        String ID              = (String) this.tabelaHistoricoConsulta.getValueAt(linhaSelecionada, 0);
        String nomeMedico      = (String) this.tabelaHistoricoConsulta.getValueAt(linhaSelecionada, 1);
        String dataConsulta    = (String) this.tabelaHistoricoConsulta.getValueAt(linhaSelecionada, 2);
        String formatoConsulta = (String) this.tabelaHistoricoConsulta.getValueAt(linhaSelecionada, 3);
        String valorConsulta   = (String) this.tabelaHistoricoConsulta.getValueAt(linhaSelecionada, 4);
        
        String novaDataConsulta    = JOptionPane.showInputDialog(this,
                "Editar a data da consulta (YYYY_MM-DD):",
                dataConsulta);
        
        String novoFormatoConsulta = JOptionPane.showInputDialog(this,
                "Editar o formato da consulta (Presencial ou Telemedicina):",
                formatoConsulta);
        
        String novoValorConsulta   = JOptionPane.showInputDialog(this,
                "Editar o valor da consulta (00.0):",
                valorConsulta);
        
        if (novaDataConsulta    != null ||
            novoFormatoConsulta != null ||
            novoValorConsulta   != null) {
            
            BD banco = new BD();
            boolean conectado = banco.conectaBD();
            
            if (!conectado) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao conectar ao banco de dados!!!");
                
                return;
            }
            
            String updatedQuery = "UPDATE Consulta SET dataConsulta = ?, formatoConsulta = ?, pagamentoConsulta = ? WHERE ID = ?";
            
            try (PreparedStatement ps = banco.getPreparedStatement(updatedQuery)) {
                ps.setString(1, novaDataConsulta);
                ps.setString(2, novoFormatoConsulta);
                ps.setString(3, novoValorConsulta);
                ps.setString(4, ID);
                
                int rowsUpdated = ps.executeUpdate();
                
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this,
                            "Registro editado com sucesso!!!");
                    
                    botaoConsultaActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Nenhum registro encontrado para editar!!!");
                }
            
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Erro ao atualizar o registro!! Error: " + ex.getMessage());
            
            } finally {
                banco.encerrarConexao();
            }
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try (BufferedReader br = new BufferedReader(new FileReader("sessao"))) {
            //lê o arquivo para saber se é paciente ou médico
            String linha;
            String[] dados = {};
            
            while ((linha = br.readLine()) != null) {
                dados = linha.split(",");
            }
            
            if (dados[1].equals("Paciente")) {
                this.botaoEditar.setVisible(false);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao ler o arquivo!! Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluirMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tabelaHistoricoConsulta;
    // End of variables declaration//GEN-END:variables
}
