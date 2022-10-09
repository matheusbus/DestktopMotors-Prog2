/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public final class ConsultaCarroView extends javax.swing.JFrame {

    private final VeiculoRepositorio repositorioDeVeiculos = new VeiculoDAO();
    private DefaultTableModel grid;
    private VendaView venda;
     private VeiculoRepositorio veiculos;
    /**
     * Creates new form ConsultaVeiculo
     */
    public ConsultaCarroView() {
        initComponents();
        
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.btnSelecionarVeiculo.setEnabled(true);
        grid = (DefaultTableModel) tblCarros.getModel();
        criaVeiculos();
        popularTabela();
    }
    
      public ConsultaCarroView(VendaView venda) {
        initComponents();
        
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.btnSelecionarVeiculo.setEnabled(true);
        this.venda = venda;
        this.veiculos = new VeiculoDAO();
  
        
        grid = (DefaultTableModel) tblCarros.getModel();
        criaVeiculos();
        popularTabela();
    }

    public void popularTabela(){
        limparTabela();
        tblCarros.getModel();
        Map<String, Veiculo> veiculos = repositorioDeVeiculos.getVeiculos();
        
        for(Map.Entry<String, Veiculo> entry : veiculos.entrySet()){
            if(entry.getValue() instanceof Carro){
                Carro carro = (Carro) entry.getValue();
                grid.addRow(carro.obterDados());
            }
        }
    }
    
    public JButton getBotaoSeleciona(){
        return this.btnSelecionarVeiculo;
    }
    
    public void limparTabela(){
        grid.setRowCount(0);
    }
    
    public void criaVeiculos(){
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0001", "Gol 1.0", new Marca("Wolksvagen"), 2002, 25000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0002", "Palio 2.5 Turbo", new Marca("Fiat"), 2002, 80000, "Diesel", 5));
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0003", "Onix nutella", new Marca("Chevrolet"), 2002, 50000, "Gasolina", 3));
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0004", "Arizzo 5", new Marca("Chery"), 2002, 40000, "Diesel", 7));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        btnAdicionaVeiculo = new javax.swing.JButton();
        btnRemoverVeiculo = new javax.swing.JButton();
        txtPlacaBuscada = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        btnBuscarVeiculo = new javax.swing.JButton();
        btnSelecionarVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Carros");

        tblCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Modelo", "Marca", "Ano", "Preço", "Combustível", "Portas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarros.setToolTipText("");
        tblCarros.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tblCarros);

        btnAdicionaVeiculo.setText("Cadastrar");
        btnAdicionaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaVeiculoActionPerformed(evt);
            }
        });

        btnRemoverVeiculo.setText("Remover");
        btnRemoverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVeiculoActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblPlaca.setText("Placa");

        btnBuscarVeiculo.setText("Buscar");
        btnBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeiculoActionPerformed(evt);
            }
        });

        btnSelecionarVeiculo.setText("Selecionar");
        btnSelecionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarVeiculoActionPerformed(evt);
            }
        });

        dkpFundo.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnAdicionaVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnRemoverVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(txtPlacaBuscada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(lblPlaca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnBuscarVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnSelecionarVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpFundoLayout = new javax.swing.GroupLayout(dkpFundo);
        dkpFundo.setLayout(dkpFundoLayout);
        dkpFundoLayout.setHorizontalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(dkpFundoLayout.createSequentialGroup()
                        .addComponent(btnAdicionaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlacaBuscada, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpFundoLayout.createSequentialGroup()
                        .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dkpFundoLayout.createSequentialGroup()
                                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(txtPlacaBuscada))
                            .addComponent(btnBuscarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaVeiculoActionPerformed
        CadastroCarroView cadCarro = new CadastroCarroView(this);
        cadCarro.setVisible(true);
    }//GEN-LAST:event_btnAdicionaVeiculoActionPerformed

    private void btnRemoverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVeiculoActionPerformed
        if (!(tblCarros.getSelectedRow() == -1)){
            String placa = (String) grid.getValueAt(tblCarros.getSelectedRow(), 0);
            repositorioDeVeiculos.removeVeiculo(placa);
            limparTabela();
            popularTabela();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum veículo foi selecionado.", "Erro de exclusão", HEIGHT);
        }

    }//GEN-LAST:event_btnRemoverVeiculoActionPerformed

    private void btnBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeiculoActionPerformed
        String placa = txtPlacaBuscada.getText();
    }//GEN-LAST:event_btnBuscarVeiculoActionPerformed

    private void btnSelecionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarVeiculoActionPerformed
       String sPlaca;    
        sPlaca = (String) grid.getValueAt(tblCarros.getSelectedRow(), 0); 
        venda.veiculo = veiculos.buscarVeiculo(sPlaca); 
        venda.VeiculoSelecionado = true;
        setVisible(false);
    }//GEN-LAST:event_btnSelecionarVeiculoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcDarkIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCarroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaVeiculo;
    private javax.swing.JButton btnBuscarVeiculo;
    private javax.swing.JButton btnRemoverVeiculo;
    private javax.swing.JButton btnSelecionarVeiculo;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTable tblCarros;
    private javax.swing.JTextField txtPlacaBuscada;
    // End of variables declaration//GEN-END:variables
}
