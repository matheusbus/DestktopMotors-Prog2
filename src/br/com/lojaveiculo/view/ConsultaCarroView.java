/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public final class ConsultaCarroView extends TelaBaseConsultaView {

    private final VeiculoRepositorio repositorioDeVeiculos = new VeiculoDAO();
    private DefaultTableModel grid;
    private VendaView venda;
    private VeiculoRepositorio veiculos;
    
    // Construtor chamado na tela inicial
    public ConsultaCarroView() {
        organizaLayout();
        this.btnSelecionarVeiculo.setEnabled(false);
    }
    
    // Construtor chamado na tela de venda
    public ConsultaCarroView(VendaView venda) {
        organizaLayout();
        this.btnSelecionarVeiculo.setEnabled(true);
        this.venda = venda;
        this.veiculos = new VeiculoDAO();
    }
      
    @Override
    public void organizaLayout(){
        initComponents();
        
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        grid = (DefaultTableModel) tblCarros.getModel();
        criaVeiculos();
        popularTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        btnCadastrarVeiculo = new javax.swing.JButton();
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

        btnCadastrarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVeiculo.setText("Cadastrar");
        btnCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVeiculoActionPerformed(evt);
            }
        });

        btnRemoverVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnRemoverVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRemoverVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverVeiculo.setText("Remover");
        btnRemoverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVeiculoActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa:");

        btnBuscarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnBuscarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVeiculo.setText("Buscar");
        btnBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeiculoActionPerformed(evt);
            }
        });

        btnSelecionarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnSelecionarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSelecionarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarVeiculo.setText("Selecionar");
        btnSelecionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarVeiculoActionPerformed(evt);
            }
        });

        dkpFundo.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnCadastrarVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                        .addGap(18, 18, 18)
                        .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dkpFundoLayout.createSequentialGroup()
                                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlacaBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dkpFundoLayout.createSequentialGroup()
                        .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlacaBuscada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarVeiculo))
                    .addComponent(btnCadastrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVeiculoActionPerformed
        abrirTelaCadastro();
    }//GEN-LAST:event_btnCadastrarVeiculoActionPerformed

    private void btnRemoverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVeiculoActionPerformed
        removerDaTabela();
    }//GEN-LAST:event_btnRemoverVeiculoActionPerformed

    private void btnBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeiculoActionPerformed
        limpaSelecao();
        buscaNaTabela(txtPlacaBuscada.getText().toUpperCase());
    }//GEN-LAST:event_btnBuscarVeiculoActionPerformed
    
    private void btnSelecionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarVeiculoActionPerformed
        selecionaItem((String) grid.getValueAt(tblCarros.getSelectedRow(), 0));
    }//GEN-LAST:event_btnSelecionarVeiculoActionPerformed

    @Override
    public void abrirTelaCadastro(){
        CadastroCarroView cadCarro = new CadastroCarroView(this);
        cadCarro.setVisible(true);        
    }
    
    @Override
    public void apresentaMensagem(String mensagem, String titulo){
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

    @Override
    public void limparTabela(){
        grid.setRowCount(0);
    }
    
    @Override
    public void removerDaTabela() {
        if (!(tblCarros.getSelectedRow() == -1)){
            String placa = (String) grid.getValueAt(tblCarros.getSelectedRow(), 0);
            repositorioDeVeiculos.removeVeiculo(placa);
            limparTabela();
            popularTabela();
        } else {
            apresentaMensagem("Nenhum veículo foi selecionado.", "Erro de exclusão");
        }
    }
    
    @Override
    public void limpaSelecao(){
        // Limpar seleção da linha atual na tabela
        tblCarros.clearSelection();
    }
    
    @Override
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
    
    @Override
    public void buscaNaTabela(String placa){
        int incidencia = -1;
        if(placa.length() == 7){
            for(int i = 0; i <= tblCarros.getRowCount()-1; i++){
                if(grid.getValueAt(i, 0).equals(placa)){
                    incidencia = i;
                }
            }
            if(incidencia != -1){
            tblCarros.setRowSelectionInterval(incidencia, incidencia);
            } else {
                apresentaMensagem("Não foi encontrado nenhum veículo com a placa '"+placa+"'.", "Veículo não encontrado");
            }
        } else {
            apresentaMensagem("Digite uma placa válida!", "Placa inválida");
        }
    }
    
    
    public void selecionaItem(String placa){
       venda.veiculo = veiculos.buscarVeiculo(placa); 
       venda.VeiculoSelecionado = true;
       setVisible(false);
    }
    
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
    private javax.swing.JButton btnBuscarVeiculo;
    private javax.swing.JButton btnCadastrarVeiculo;
    private javax.swing.JButton btnRemoverVeiculo;
    private javax.swing.JButton btnSelecionarVeiculo;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTable tblCarros;
    private javax.swing.JTextField txtPlacaBuscada;
    // End of variables declaration//GEN-END:variables

    // Método de teste, não vai ficar na versão final.
    public void criaVeiculos(){
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0001", "Gol 1.0", new Marca("Wolksvagen"), 2002, 25000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0002", "Palio 2.5 Turbo", new Marca("Fiat"), 2002, 80000, "Diesel", 5));
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0003", "Onix nutella", new Marca("Chevrolet"), 2002, 50000, "Gasolina", 3));
        repositorioDeVeiculos.addVeiculo(new Carro("ABC0004", "Arizzo 5", new Marca("Chery"), 2002, 40000, "Diesel", 7));
    }
    
}
