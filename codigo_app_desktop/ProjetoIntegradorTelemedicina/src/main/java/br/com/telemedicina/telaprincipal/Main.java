/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package br.com.telemedicina.telaprincipal;

import br.com.telemedicina.bd.BD;
import br.com.telemedicina.subtelas.AgendaConsulta;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        statusLabelPaciente = new javax.swing.JLabel();
        carregaDadosPaciente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        diaConsulta = new javax.swing.JMenuItem();
        historicoConsulta = new javax.swing.JMenuItem();
        novaConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        consultaExame = new javax.swing.JMenuItem();
        historicoExame = new javax.swing.JMenuItem();
        agendaExame = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        consultaPrescricao = new javax.swing.JMenuItem();
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
        carregaDadosMedico.setForeground(new java.awt.Color(255, 255, 255));
        carregaDadosMedico.setText("Carregar Dados");
        carregaDadosMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaDadosMedicoActionPerformed(evt);
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
                        .addContainerGap(344, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carregaDadosMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carregaDadosMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Olá {Médico}");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(19, 40, 240, 57);

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Novo Exame");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(331, 115, 103, 40);

        jButton3.setBackground(new java.awt.Color(242, 242, 242));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Consultas do Dia");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jButton3);
        jButton3.setBounds(599, 115, 134, 40);

        jButton4.setBackground(new java.awt.Color(242, 242, 242));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Nova Prescrição");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jButton4);
        jButton4.setBounds(452, 115, 129, 40);

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
        carregaDadosPaciente.setForeground(new java.awt.Color(255, 255, 255));
        carregaDadosPaciente.setText("Carregar Dados");
        carregaDadosPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaDadosPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(statusLabelPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carregaDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabelPaciente)
                    .addComponent(carregaDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Olá {Paciente}");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(586, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel4);

        jTabbedPane1.addTab("Paciente", jSplitPane2);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, -40, 1140, 720);

        jMenu3.setText("Consultas");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        diaConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        diaConsulta.setText("Consultas do Dia");
        jMenu3.add(diaConsulta);

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

        jMenu4.setText("Exames");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        consultaExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultaExame.setText("Consulta de Exames");
        jMenu4.add(consultaExame);

        historicoExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoExame.setText("Histórico de Exames");
        jMenu4.add(historicoExame);

        agendaExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agendaExame.setText("Agendar Exames");
        jMenu4.add(agendaExame);

        menuBar.add(jMenu4);

        jMenu5.setText("Prescrições");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        consultaPrescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultaPrescricao.setText("Consultar Prescrições");
        jMenu5.add(consultaPrescricao);

        historicoPrescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoPrescricao.setText("Histórico de Prescrições");
        jMenu5.add(historicoPrescricao);

        novaPrescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        novaPrescricao.setText("Nova Prescrição");
        novaPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaPrescricaoActionPerformed(evt);
            }
        });
        jMenu5.add(novaPrescricao);

        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void historicoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historicoConsultaActionPerformed

    private void novaPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaPrescricaoActionPerformed
        // TODO add your handling code here:
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

        String query = "SELECT nome, cpf, dataNascimento FROM Paciente";
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

        String query = "SELECT ID_MEDICO, dataConsulta, formatoConsulta FROM Consulta";
        PreparedStatement ps = banco.getPreparedStatement(query);
        
        try {
            ResultSet rs = ps.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) this.jTablePaciente.getModel();
            if (model.getRowCount() > 0) {
                model.setNumRows(0);
            }

            
            while (rs.next()) {
               String[] dados = { rs.getString("ID_MEDICO"),
                                  rs.getString("formatoConsulta"),
                                  rs.getDate("dataConsulta").toString()}; 
               
               model.addRow(dados);
            }
            this.jTablePaciente.setModel(model);
            rs.close();
            ps.close();
            banco.encerrarConexao();
            this.carregaDadosPaciente.setVisible(false);
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
           }
           
           
       } catch (IOException e) {
           JOptionPane.showMessageDialog(this,
                   "Não foi possível iniciar o sistema!! Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JButton carregaDadosMedico;
    private javax.swing.JButton carregaDadosPaciente;
    private javax.swing.JMenuItem consultaExame;
    private javax.swing.JMenuItem consultaPrescricao;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem diaConsulta;
    private javax.swing.JMenuItem historicoConsulta;
    private javax.swing.JMenuItem historicoExame;
    private javax.swing.JMenuItem historicoPrescricao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
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
    private javax.swing.JMenuItem novaConsulta;
    private javax.swing.JMenuItem novaPrescricao;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusLabelPaciente;
    // End of variables declaration//GEN-END:variables

}
