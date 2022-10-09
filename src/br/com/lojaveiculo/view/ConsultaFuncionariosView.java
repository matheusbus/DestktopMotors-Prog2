/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.model.Funcionario;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class ConsultaFuncionariosView extends javax.swing.JFrame {

     private final PessoaRepositorio repositorioDePessoas = new PessoaDAO();
     private DefaultTableModel grid;
     private VendaView venda;
     private PessoaRepositorio pessoas;
     
    public ConsultaFuncionariosView(VendaView venda) {
        initComponents();
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.venda = venda;
        pessoas = new PessoaDAO();
        popularTabela();
    }

    ConsultaFuncionariosView() {
      initComponents();
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        popularTabela();  
    }
    
    public void popularTabela(){
        tblFuncionarios.getModel();
        grid = (DefaultTableModel) tblFuncionarios.getModel();
        Set<Pessoa> pessoas = repositorioDePessoas.getPessoas();
        
        for(Pessoa p : pessoas){
           if(p instanceof Funcionario){
                Funcionario func = (Funcionario) p;
                grid.addRow(func.obterDados());
            }
        }
        
    }
    
    public void limparTabela(){
       grid.setRowCount(0);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        btnAdicionaGerente = new javax.swing.JButton();
        btnAdicionaVendedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAdicionaGerente.setText("Cadastrar Gerente");
        btnAdicionaGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaGerenteActionPerformed(evt);
            }
        });

        btnAdicionaVendedor.setText("Cadastrar Vendedor");
        btnAdicionaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaVendedorActionPerformed(evt);
            }
        });

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "Salario", "Data Admissão", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionarios.setToolTipText("");
        tblFuncionarios.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tblFuncionarios);

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        dkpFundo.setLayer(btnAdicionaGerente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnAdicionaVendedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnSelecionar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpFundoLayout = new javax.swing.GroupLayout(dkpFundo);
        dkpFundo.setLayout(dkpFundoLayout);
        dkpFundoLayout.setHorizontalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionaGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(212, 212, 212)
                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnAdicionaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dkpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(dkpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionaGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaGerenteActionPerformed
        CadastroGerenteView cadastroGerente = new CadastroGerenteView(this);
        cadastroGerente.setVisible(true);
    }//GEN-LAST:event_btnAdicionaGerenteActionPerformed

    private void btnAdicionaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaVendedorActionPerformed
       CadastroVendedorView cadastroVendedor = new CadastroVendedorView(this); 
       cadastroVendedor.setVisible(true);
    }//GEN-LAST:event_btnAdicionaVendedorActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        String sCPF;    
        sCPF = (String) grid.getValueAt(tblFuncionarios.getSelectedRow(), 1); 
        venda.vendedor = pessoas.buscarPessoaPorCPF(sCPF);      
        setVisible(false);
    }//GEN-LAST:event_btnSelecionarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaGerente;
    private javax.swing.JButton btnAdicionaVendedor;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionarios;
    // End of variables declaration//GEN-END:variables
}
