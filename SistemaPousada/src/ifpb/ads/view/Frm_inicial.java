/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.view;

/**
 *
 * @author italo
 */
public class Frm_inicial extends javax.swing.JFrame {

    /**
     * Creates new form Frm_inicial
     */
    public Frm_inicial() {
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

        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btCadastro = new javax.swing.JButton();
        btPedido = new javax.swing.JButton();
        btReserva = new javax.swing.JButton();
        btPagamento = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRegistro = new javax.swing.JMenu();
        ooRegistroFuncionarios = new javax.swing.JMenuItem();
        opRegistroHospedes = new javax.swing.JMenuItem();
        opRegistroProdutos = new javax.swing.JMenuItem();
        opRegistroVendas = new javax.swing.JMenuItem();
        opRelatorioVendas = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenu();
        OpSobre = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        opCadastroFuncionario = new javax.swing.JMenuItem();
        opCadastroProduto = new javax.swing.JMenuItem();
        opCadastroQuarto = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU RÁPIDO"));

        btCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_add_user_309049_1.png"))); // NOI18N
        btCadastro.setText("Cadastro");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        btPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_notepad_285631.png"))); // NOI18N
        btPedido.setText("Pedido");

        btReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_bed_415896.png"))); // NOI18N
        btReserva.setText("Reserva");

        btPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_money_172506.png"))); // NOI18N
        btPagamento.setText("Pagamento");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ifpb/ads/icones/iconfinder_Login_in_85205_1.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCadastro)
                .addGap(26, 26, 26)
                .addComponent(btPedido)
                .addGap(32, 32, 32)
                .addComponent(btReserva)
                .addGap(30, 30, 30)
                .addComponent(btPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );

        menuRegistro.setText("Registro");

        ooRegistroFuncionarios.setText("Funcionários");
        menuRegistro.add(ooRegistroFuncionarios);

        opRegistroHospedes.setText("Hóspedes");
        menuRegistro.add(opRegistroHospedes);

        opRegistroProdutos.setText("Produtos");
        menuRegistro.add(opRegistroProdutos);

        opRegistroVendas.setText("Vendas");
        menuRegistro.add(opRegistroVendas);

        jMenuBar1.add(menuRegistro);

        opRelatorioVendas.setText("Relatório");

        jMenuItem5.setText("Vendas");
        opRelatorioVendas.add(jMenuItem5);

        jMenuBar1.add(opRelatorioVendas);

        menuInfo.setText("Informações");

        OpSobre.setText("Sobre");
        OpSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSobreActionPerformed(evt);
            }
        });
        menuInfo.add(OpSobre);

        jMenuBar1.add(menuInfo);

        menuCadastro.setText("Cadastro");

        opCadastroFuncionario.setText("Funcionário");
        opCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(opCadastroFuncionario);

        opCadastroProduto.setText("Produto");
        opCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(opCadastroProduto);

        opCadastroQuarto.setText("Quarto");
        opCadastroQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroQuartoActionPerformed(evt);
            }
        });
        menuCadastro.add(opCadastroQuarto);

        jMenuBar1.add(menuCadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 471, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(683, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OpSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSobreActionPerformed
        // TODO add your handling code here:
        new Frm_sobre().setVisible(true);
    }//GEN-LAST:event_OpSobreActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        new Frm_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void opCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroFuncionarioActionPerformed
        // TODO add your handling code here:
        new Frm_cadastroFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_opCadastroFuncionarioActionPerformed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        // TODO add your handling code here:
        new Frm_cadastroHospede().setVisible(true);
        dispose();
    }//GEN-LAST:event_btCadastroActionPerformed

    private void opCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroProdutoActionPerformed
        // TODO add your handling code here:
        new Frm_cadastroProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_opCadastroProdutoActionPerformed

    private void opCadastroQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroQuartoActionPerformed
        // TODO add your handling code here:
        new Frm_cadastroQuarto().setVisible(true);
        dispose();
    }//GEN-LAST:event_opCadastroQuartoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem OpSobre;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btPagamento;
    private javax.swing.JButton btPedido;
    private javax.swing.JButton btReserva;
    private javax.swing.JButton btSair;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuInfo;
    private javax.swing.JMenu menuRegistro;
    private javax.swing.JMenuItem ooRegistroFuncionarios;
    private javax.swing.JMenuItem opCadastroFuncionario;
    private javax.swing.JMenuItem opCadastroProduto;
    private javax.swing.JMenuItem opCadastroQuarto;
    private javax.swing.JMenuItem opRegistroHospedes;
    private javax.swing.JMenuItem opRegistroProdutos;
    private javax.swing.JMenuItem opRegistroVendas;
    private javax.swing.JMenu opRelatorioVendas;
    // End of variables declaration//GEN-END:variables
}
