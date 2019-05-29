/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.view;

import ifpb.ads.control.Controler_Funcionario;
import ifpb.ads.dto.FuncionarioDTO;
import ifpb.ads.iterator.IteratorFuncionarioDTO;
import ifpb.ads.strategy.StrategyCrudPessoa;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author italo
 */
public class Frm_cadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form Frm_cadastroFuncionario
     */
    private StrategyCrudPessoa controleFuncionario;

    public Frm_cadastroFuncionario() {
        initComponents();
        controleFuncionario = new Controler_Funcionario();

        this.preencherTabela();

    }

    private void preencherTabela() {
        try {
            FuncionarioDTO registro = (FuncionarioDTO) controleFuncionario.read();
            IteratorFuncionarioDTO iterator = new IteratorFuncionarioDTO(registro.getAllFuncionarios());
            DefaultTableModel modelo = (DefaultTableModel) this.tbl_funcionarios.getModel();

            while (iterator.hasnext()) {
                String[] dado = new String[5];
                FuncionarioDTO atual = (FuncionarioDTO) iterator.next();
                dado[0] = atual.getId() + "";
                dado[1] = atual.getName();
                dado[2] = atual.getCpf();
                dado[3] = atual.getTelephone();
                dado[4] = atual.getCargo();
                modelo.addRow(dado);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    private void atualizarTabela() {
        try {
            FuncionarioDTO registro = (FuncionarioDTO) controleFuncionario.read();
            IteratorFuncionarioDTO iterator = new IteratorFuncionarioDTO(registro.getAllFuncionarios());
            DefaultTableModel modelo = (DefaultTableModel) this.tbl_funcionarios.getModel();
            modelo.setNumRows(0);
            while (iterator.hasnext()) {
                String[] dado = new String[5];
                FuncionarioDTO atual = (FuncionarioDTO) iterator.next();
                dado[0] = atual.getId() + "";
                dado[1] = atual.getName();
                dado[2] = atual.getCpf();
                dado[3] = atual.getTelephone();
                dado[4] = atual.getCargo();
                modelo.addRow(dado);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_funcionarios = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        campoCpf = new javax.swing.JFormattedTextField();
        comboCargos = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tbl_funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Cargo"
            }
        ));
        tbl_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_funcionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_funcionarios);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_ic_delete_48px_352303.png"))); // NOI18N
        btExcluir.setPreferredSize(new java.awt.Dimension(80, 70));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_add_user_309049_1.png"))); // NOI18N
        btNovo.setPreferredSize(new java.awt.Dimension(80, 70));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone");

        jLabel3.setText("CPF");

        jLabel4.setText("Cargo");

        campoNome.setEditable(false);

        campoTelefone.setEditable(false);
        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoCpf.setEditable(false);
        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.####.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        comboCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Recepcionista", "Serviços Gerais", "Gerente" }));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_save_2639912.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_Login_out_85206.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        campoId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(campoNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoTelefone)
                                        .addComponent(campoCpf)
                                        .addComponent(comboCargos, 0, 145, Short.MAX_VALUE))
                                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btSalvar)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(756, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        try {
            // pega os dados do funcionário que form preenchidos nos campos.
            String nome = campoNome.getText();
            String cargo = comboCargos.getSelectedItem().toString();
            String cpf = campoCpf.getText();
            String telefone = campoTelefone.getText();
            
            // instancia um novo funcionárioDTO que será usado como "moeda" de transferência de dados.
            FuncionarioDTO novo = new FuncionarioDTO();
            // seta os dados do funcionário.
            novo.setName(nome);
            novo.setCargo(cargo);
            novo.setCpf(cpf);
            novo.setTelephone(telefone);

            if(nome.length() > 0 && !cpf.equals("   .   .   -  ") && !campoId.getText().equals("")){
                int id = Integer.parseInt(campoId.getText());
                novo.setId(id);
                if(controleFuncionario.update(novo)){
                    JOptionPane.showMessageDialog(null, "Atualizado.");
                    this.atualizarTabela();
                    this.limparCampos();
                }
            }
            else if (nome.length() > 0 && !cpf.equals("   .   .   -  ")) {
                // manda o objetoDTO para seguir o curso do MVC até o banco de dados.
                if (controleFuncionario.save(novo)) {
                    JOptionPane.showMessageDialog(null, "Cadastrado!");
                    this.atualizarTabela();
                    this.limparCampos();
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        this.habilitarCampos();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        int linha = tbl_funcionarios.getSelectedRow();
        int id = Integer.parseInt((String) tbl_funcionarios.getValueAt(linha, 0));
        try {
            if (controleFuncionario.delete(id)) {
                JOptionPane.showMessageDialog(null, "Excluído!");
                this.atualizarTabela();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Frm_inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_funcionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_funcionariosMouseClicked
        this.habilitarCampos();
        int linha = tbl_funcionarios.getSelectedRow();
        String id = (String) tbl_funcionarios.getValueAt(linha, 0);
        String nome = (String) tbl_funcionarios.getValueAt(linha, 1);
        String cpf = (String) tbl_funcionarios.getValueAt(linha, 2);
        String telefone = (String) tbl_funcionarios.getValueAt(linha, 3);
        
        campoNome.setText(nome);
        campoCpf.setText(cpf);
        campoTelefone.setText(telefone);
        campoId.setText(id);
    }//GEN-LAST:event_tbl_funcionariosMouseClicked

    private void habilitarCampos() {
        campoCpf.setEditable(true);
        campoNome.setEditable(true);
        campoTelefone.setEditable(true);
    }

    private void limparCampos() {
        campoCpf.setText("");
        campoNome.setText("");
        campoTelefone.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JComboBox<String> comboCargos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_funcionarios;
    // End of variables declaration//GEN-END:variables
}