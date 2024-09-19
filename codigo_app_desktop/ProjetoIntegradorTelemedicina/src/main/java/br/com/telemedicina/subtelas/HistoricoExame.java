/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telemedicina.subtelas;

import br.com.telemedicina.bd.BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josue53508706
 */
public class HistoricoExame extends javax.swing.JInternalFrame {

    /**
     * Creates new form HistoricoExame
     */
    public HistoricoExame() {
        initComponents();
    }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistoricoExames = new javax.swing.JTable();
        botaoConsulta = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        botaoExcluirMed = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Histórico de Exames");

        tabelaHistoricoExames.setBackground(new java.awt.Color(102, 102, 102));
        tabelaHistoricoExames.setForeground(new java.awt.Color(255, 255, 255));
        tabelaHistoricoExames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Clínica", "Descrição Exame", "Data Exame", "Status Exame", "Diagnostico Exame", "Valor Exame"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaHistoricoExames);

        botaoConsulta.setBackground(new java.awt.Color(255, 102, 0));
        botaoConsulta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoConsulta.setForeground(new java.awt.Color(0, 0, 0));
        botaoConsulta.setText("Consultar");
        botaoConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 204, 0));

        botaoExcluirMed.setBackground(new java.awt.Color(204, 0, 0));
        botaoExcluirMed.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluirMed.setForeground(new java.awt.Color(0, 0, 0));
        botaoExcluirMed.setText("Excluir");
        botaoExcluirMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirMedActionPerformed(evt);
            }
        });

        BotaoEditar.setBackground(new java.awt.Color(0, 0, 255));
        BotaoEditar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BotaoEditar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoEditar.setText("Editar");
        BotaoEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(46, 169, 248));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telemedicina.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel2)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if(resultado == true) {
            this.statusLabel.setText("Status: Conectado ao banco de dados!!");
        } else {
            this.statusLabel.setText("Status: Não conectado ao banco de dados!!");
            return;
        }

        String query = "SELECT cl.nomeClinica, ex.descricaoExame, ex.dataExame, ex.statusExame, ex.diagnosticoExame, ex.valorExame FROM Clinica cl INNER JOIN Exame ex ON cl.ID = ex.ID_CLINICA";
        PreparedStatement ps = banco.getPreparedStatement(query);

        try {
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) this.tabelaHistoricoExames.getModel();
            if (model.getRowCount() > 0) {
                model.setNumRows(0);
            }

            while (rs.next()) {
                String[] dados = {  rs.getString("cl.nomeClinica"),
                                    rs.getString("ex.descricaoExame"),
                                    rs.getDate("ex.dataExame").toString(),
                                    rs.getString("ex.statusExame"),
                                    rs.getString("ex.diagnosticoExame"),
                                    rs.getString("ex.valorExame")};

                model.addRow(dados);
            }

            this.tabelaHistoricoExames.setModel(model);
            rs.close();
            ps.close();
            banco.encerrarConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Não foi possível fazer a Consulta no BD!!!! Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_botaoConsultaActionPerformed

    private void botaoExcluirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirMedActionPerformed
        int linhaSelecionada = this.tabelaHistoricoExames.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                "Favor selecione um histórico para excluir!");
            return;
        }

        String idPaciente =
        (String) this.tabelaHistoricoExames.getValueAt(linhaSelecionada, 0);

        int opcao = JOptionPane.showConfirmDialog(this,
            "Deseja realmente excluir o Exame " + idPaciente + "?",
            "Excluir", JOptionPane.OK_CANCEL_OPTION);

        if (opcao == 0) {
            BD banco = new BD();
            banco.conectaBD();

            String query2 = "DELETE FROM Exame WHERE ID_CLINICA = (SELECT ID FROM Medico WHERE nomeClinica = ?)";
            String query = "DELETE FROM Exame WHERE diagnosticoExame = ?";

            try (PreparedStatement ps =banco.getPreparedStatement(query)){
                ps.setString(1, query2);
                ps.setString(1, query);
                boolean linhaApagada = ps.execute();

                if (linhaApagada == false) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.tabelaHistoricoExames.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this,
                        "Histórico excluido com sucesso!!");
                    
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

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        BD banco = new BD();
        banco.conectaBD();
        
        String query = "";
        PreparedStatement ps =banco.getPreparedStatement(query);
        
        try {
            ResultSet rs = ps.executeQuery();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível editar o registro!! Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_BotaoEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoExcluirMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable tabelaHistoricoExames;
    // End of variables declaration//GEN-END:variables
}
