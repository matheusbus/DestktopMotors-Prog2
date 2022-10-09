/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.model.Estoque;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
/**
 *
 * @author Matheus
 */
public class PrincipalView extends javax.swing.JFrame {

    private Estoque estoque;
    /**
     * Creates new form InicialView
     */
    public PrincipalView() {
        initComponents();
        
        // Adicionar o painel ao centro do frame
        this.setContentPane(dkpnlFundo);
        this.setSize(1400, 900);
        
        // Setar posicao do frame na tela (null = centro)
        this.setLocationRelativeTo(null);
        
        // Instancia do estoque
        /*
        Deve iniciar o estoque ao logar no sistema, ao abrir a tela principal do sistema.
        */
        this.estoque = new Estoque();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpnlFundo = new javax.swing.JDesktopPane();
        mbMenuPrincipal = new javax.swing.JMenuBar();
        muCadastros = new javax.swing.JMenu();
        miCadVeiculo = new javax.swing.JMenuItem();
        miCadMarca = new javax.swing.JMenuItem();
        muFuncionarios = new javax.swing.JMenu();
        muClientes = new javax.swing.JMenu();
        muVendas = new javax.swing.JMenu();
        muOpcoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DestkopMotors");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 900));

        dkpnlFundo.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        javax.swing.GroupLayout dkpnlFundoLayout = new javax.swing.GroupLayout(dkpnlFundo);
        dkpnlFundo.setLayout(dkpnlFundoLayout);
        dkpnlFundoLayout.setHorizontalGroup(
            dkpnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        dkpnlFundoLayout.setVerticalGroup(
            dkpnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        muCadastros.setText("Cadastros");

        miCadVeiculo.setText("Veículos");
        miCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadVeiculoActionPerformed(evt);
            }
        });
        muCadastros.add(miCadVeiculo);

        miCadMarca.setText("Marcas");
        muCadastros.add(miCadMarca);

        mbMenuPrincipal.add(muCadastros);

        muFuncionarios.setText("Funcionários");
        mbMenuPrincipal.add(muFuncionarios);

        muClientes.setText("Clientes");
        mbMenuPrincipal.add(muClientes);

        muVendas.setText("Vendas");
        mbMenuPrincipal.add(muVendas);

        muOpcoes.setText("Opções");
        mbMenuPrincipal.add(muOpcoes);

        setJMenuBar(mbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dkpnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(dkpnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadVeiculoActionPerformed
        
    }//GEN-LAST:event_miCadVeiculoActionPerformed
    
        public static void main(String args[]) {
            
            FlatArcDarkIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkpnlFundo;
    private javax.swing.JMenuBar mbMenuPrincipal;
    private javax.swing.JMenuItem miCadMarca;
    private javax.swing.JMenuItem miCadVeiculo;
    private javax.swing.JMenu muCadastros;
    private javax.swing.JMenu muClientes;
    private javax.swing.JMenu muFuncionarios;
    private javax.swing.JMenu muOpcoes;
    private javax.swing.JMenu muVendas;
    // End of variables declaration//GEN-END:variables
}
