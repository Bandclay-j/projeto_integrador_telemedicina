/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telemedicina.subtelas;

import br.com.telemedicina.bd.BD;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
public class AgendaConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgendaConsulta
     */
    public AgendaConsulta() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        imagemLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        selecionaGenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        campoRg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoCpf = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        campoDataConsulta = new javax.swing.JFormattedTextField();
        errorLabel = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoConsultaBanco = new javax.swing.JButton();
        botaoAgendarConsulta = new javax.swing.JButton();
        erroLabel = new javax.swing.JLabel();
        escolhaEstados = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        escolhaEspecializacao = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        escolhaFormato = new javax.swing.JComboBox<>();
        botaoExcluir = new javax.swing.JButton();

        setClosable(true);

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(46, 169, 248));

        imagemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagemTelaAgendaConsulta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imagemLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(imagemLabel)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel1.setText("Agendar Consulta");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Nome Completo: ");

        campoNome.setBackground(new java.awt.Color(102, 102, 102));
        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Data de Nascimento: ");

        campoDataNascimento.setBackground(new java.awt.Color(102, 102, 102));
        campoDataNascimento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Gênero: ");

        selecionaGenero.setBackground(new java.awt.Color(102, 102, 102));
        selecionaGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selecionaGenero.setForeground(new java.awt.Color(255, 255, 255));
        selecionaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        selecionaGenero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Número de Telefone: ");

        campoTelefone.setBackground(new java.awt.Color(102, 102, 102));
        campoTelefone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("RG: ");

        campoRg.setBackground(new java.awt.Color(102, 102, 102));
        campoRg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoRg.setForeground(new java.awt.Color(255, 255, 255));
        campoRg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("CPF: ");

        campoCpf.setBackground(new java.awt.Color(102, 102, 102));
        campoCpf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Data da Consulta: ");

        campoDataConsulta.setBackground(new java.awt.Color(102, 102, 102));
        campoDataConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoDataConsulta.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoDataConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        errorLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(selecionaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(errorLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        jTabbedPane1.addTab("Informações", jSplitPane1);

        jSplitPane2.setDividerLocation(300);
        jSplitPane2.setDividerSize(0);

        jPanel3.setBackground(new java.awt.Color(46, 169, 248));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagemTelaAgendaConsulta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel11)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Médico", "Especialização", "Formato", "Nome Clínica", "Endereco Clínica ", "Valor Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botaoConsultaBanco.setBackground(new java.awt.Color(255, 153, 0));
        botaoConsultaBanco.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoConsultaBanco.setText("Consultar");
        botaoConsultaBanco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoConsultaBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaBancoActionPerformed(evt);
            }
        });

        botaoAgendarConsulta.setBackground(new java.awt.Color(0, 153, 0));
        botaoAgendarConsulta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoAgendarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        botaoAgendarConsulta.setText("Agendar");
        botaoAgendarConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendarConsultaActionPerformed(evt);
            }
        });

        erroLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        erroLabel.setForeground(new java.awt.Color(255, 0, 0));

        escolhaEstados.setBackground(new java.awt.Color(102, 102, 102));
        escolhaEstados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        escolhaEstados.setForeground(new java.awt.Color(255, 255, 255));
        escolhaEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "BA", "CE", "DF", "MG", "PA", "PE", "PR", "RJ", "RS", "SP" }));
        escolhaEstados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escolhaEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaEstadosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Selecione seu Estado, a Especialização e o formato:  ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("|");

        escolhaEspecializacao.setBackground(new java.awt.Color(102, 102, 102));
        escolhaEspecializacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        escolhaEspecializacao.setForeground(new java.awt.Color(255, 255, 255));
        escolhaEspecializacao.setMaximumRowCount(50);
        escolhaEspecializacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Anestegiologia", "Cardiologia", "Cirurgia Geral", "Cirurgia Plástica", "Cirurgia Torácica", "Dermatologia", "Endocrinologia", "Gastroenterologia", "Geriatria", "Ginecologia", "Hematologia", "Imunologia", "Medicina de Família", "Nefrologia", "Neurologia", "Oftalmologia", "Oncologia", "Ortopedia", "Otorrinolaringologia", "Pediatria", "Pneumologia", "Psiquiatria", "Radiologia", "Urologia" }));
        escolhaEspecializacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("|");

        escolhaFormato.setBackground(new java.awt.Color(102, 102, 102));
        escolhaFormato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        escolhaFormato.setForeground(new java.awt.Color(255, 255, 255));
        escolhaFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Presencial", "Telemedicina" }));
        escolhaFormato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoExcluir.setBackground(new java.awt.Color(255, 0, 0));
        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(botaoConsultaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(erroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                        .addComponent(botaoAgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(escolhaEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolhaEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolhaFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escolhaEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(escolhaEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(escolhaFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jSplitPane2.setRightComponent(jPanel4);

        jTabbedPane1.addTab("Médico", jSplitPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1175, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendarConsultaActionPerformed
        if(!validaCampos()) {
            return;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Consulta.txt", true))) {
            
            String nomePaciente   = this.campoNome.getText();
            String dataNascimento = this.campoDataNascimento.getText();
            String genero         = (String) this.selecionaGenero.getSelectedItem();
            String telefone       = this.campoTelefone.getText();
            String rg             = this.campoRg.getText();
            String cpf            = this.campoCpf.getText();
            String dataConsulta   = this.campoDataConsulta.getText();
            
            bw.write(nomePaciente + ", " + dataNascimento + ", " + genero + ", " +
                     telefone + ", " + rg + ", " + cpf + ", " + dataConsulta);
            
            JOptionPane.showMessageDialog(this,
                    "Cadastro de Consulta Concluído!!");
            this.setVisible(false);
                    
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao cadastrar Consulta!! Error: " + e.getMessage());
        }
    }//GEN-LAST:event_botaoAgendarConsultaActionPerformed

    private void botaoConsultaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaBancoActionPerformed
        BD banco = new BD();
        banco.conectaBD();
        
        String estado         = (String) this.escolhaEstados.getSelectedItem();
        String especializacao = (String) this.escolhaEspecializacao.getSelectedItem();
        String formato        = (String) this.escolhaFormato.getSelectedItem();
  
        String query = "SELECT m.nomeMed, m.especializacao, ta.formato, cl.nomeClinica, cl.enderecoClinica, ta.valorConsulta FROM Medico m INNER JOIN Atende ate ON m.ID =ate.ID_MEDICO INNER JOIN Clinica cl ON cl.ID = ate.ID_CLINICA INNER JOIN TipoAtendimento ta ON ta.ID_MEDICO = m.ID WHERE cl.enderecoClinica LIKE ? AND m.especializacao LIKE ? AND ta.formato LIKE ?";
        
        PreparedStatement ps  = banco.getPreparedStatement(query);
        
        if(estado.equals("Selecione") || especializacao.equals("Selecione") || formato.equals("Selecione")) {
           JOptionPane.showMessageDialog(this,
                    "Escolha as três opções!!!");
        }
        
        try {
            ps.setString(1, "%" + estado);
            ps.setString(2, especializacao);
            ps.setString(3, formato);
            
            ResultSet rs = ps.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            if (model.getRowCount() > 0) {
                model.setRowCount(0);
            }
            
            while (rs.next()) {
                String[] dados = {
                        rs.getString("m.nomeMed"),
                        rs.getString("m.especializacao"),
                        rs.getString("ta.formato"),
                        rs.getString("cl.nomeClinica"),
                        rs.getString("cl.enderecoClinica"),
                        rs.getString("ta.valorConsulta")
                };
                
                model.addRow(dados);
            }
            
            this.jTable1.setModel(model);
            rs.close();
            ps.close();
            banco.encerrarConexao();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível realizar a consulta no BD!! Error: " + se.getMessage());
            
        }
        
        
    }//GEN-LAST:event_botaoConsultaBancoActionPerformed

    private void escolhaEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escolhaEstadosActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int linhaSelecionada = this.jTable1.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Favor selecione um registro para excluir!");
            return;
        }
        
        String idMedico =
                (String) this.jTable1.getValueAt(linhaSelecionada, 0);
        
        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir o medico " + idMedico + "?",
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
                
                 
                if (!linhaApagada) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
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
    }//GEN-LAST:event_botaoExcluirActionPerformed

       private boolean validaCampos() {
           if (this.campoNome.getText().equals("")           ||
               this.campoDataNascimento.getText().equals("") ||
               this.selecionaGenero.getSelectedIndex() == 0         ||
               this.campoTelefone.getText().equals("")       ||
               this.campoRg.getText().equals("")             ||
               this.campoCpf.getText().equals("")            ||
               this.campoDataConsulta.getText().equals("")) {
               
               this.errorLabel.setText("Há campos em branco!!!");
               this.erroLabel.setText("Há campos em branco!!!");
               return false;
           }
           this.errorLabel.setText("");
           this.erroLabel.setText("");
           return true;
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAgendarConsulta;
    private javax.swing.JButton botaoConsultaBanco;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JFormattedTextField campoDataConsulta;
    private javax.swing.JFormattedTextField campoDataNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRg;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel erroLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JComboBox<String> escolhaEspecializacao;
    private javax.swing.JComboBox<String> escolhaEstados;
    private javax.swing.JComboBox<String> escolhaFormato;
    private javax.swing.JLabel imagemLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> selecionaGenero;
    // End of variables declaration//GEN-END:variables
}
