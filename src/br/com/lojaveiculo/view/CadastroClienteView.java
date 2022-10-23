
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseCadastroView;
import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.model.Cliente;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public final class CadastroClienteView extends TelaBaseCadastroView {

    private final PessoaRepositorio pessoas = new PessoaDAO();
    private ConsultaClientesView consultaCliente = null;
    private Cliente cliente;
    
    /**
     * Creates new form CadastroClienteView
     */
    public CadastroClienteView() {
        organizaLayout();
    }
    
    public CadastroClienteView(ConsultaClientesView consultaCliente) {
        organizaLayout();
        this.consultaCliente = consultaCliente;
    }

    public CadastroClienteView(ConsultaClientesView consultaCliente, Cliente cliente){
        organizaLayout();
        this.consultaCliente = consultaCliente;
        this.cliente = cliente;
        this.lblTitulo.setText("Alterar Cliente");
        this.btnCadCliente.setText("Alterar");
        this.txtNome.setText(cliente.getNome());
        this.txtCpf.setText(cliente.getCpf());
        this.txtRg.setText(Long.toString(cliente.getRg()));
        this.txtCnh.setText(cliente.getCnh());
        this.txtCategoriaCnh.setText(cliente.getCategoriaCnh());
        this.txtCep.setText(cliente.getCep());
        this.txtEndereco.setText(cliente.getEndereco());
        this.txtBairro.setText(cliente.getBairro());
        this.txtCidade.setText(cliente.getCidade());
        this.cbEstado.setSelectedItem(cliente.getEstado());
        this.txtTelefone.setText(cliente.getTelefone());
        this.txtEmail.setText(cliente.getEmail());
        this.txtWhatsapp.setText(cliente.getWhatsapp());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnCadCliente = new javax.swing.JButton();
        pnlDados = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        txtCnh = new javax.swing.JTextField();
        lblCNH = new javax.swing.JLabel();
        lblCategoriaCnh = new javax.swing.JLabel();
        txtCategoriaCnh = new javax.swing.JTextField();
        pnlEndereco = new javax.swing.JPanel();
        lblCep = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        pnlContato = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWhatsapp = new javax.swing.JTextField();
        btnCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Novo Cliente");

        btnCadCliente.setBackground(new java.awt.Color(82, 148, 226));
        btnCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadCliente.setText("Cadastrar");
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNome.setText("Nome");

        lblCpf.setText("CPF");

        lblRg.setText("RG");

        lblCNH.setText("CNH");

        lblCategoriaCnh.setText("Categoria CNH");

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCpf)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRg)
                    .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCnh)
                    .addComponent(lblCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCategoriaCnh, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(txtCategoriaCnh))
                .addGap(20, 20, 20))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lblCategoriaCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoriaCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addComponent(lblCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblCep.setText("CEP");

        lblEndereco.setText("Endereço");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        jLabel2.setText("Estado");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35))))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblEndereco)
                    .addComponent(lblBairro)
                    .addComponent(lblCidade)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlContato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblTelefone.setText("Telefone");

        lblEmail.setText("E-mail");

        jLabel3.setText("Whatsapp");

        javax.swing.GroupLayout pnlContatoLayout = new javax.swing.GroupLayout(pnlContato);
        pnlContato.setLayout(pnlContatoLayout);
        pnlContatoLayout.setHorizontalGroup(
            pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContatoLayout.createSequentialGroup()
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContatoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        pnlContatoLayout.setVerticalGroup(
            pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        btnCancela.setBackground(new java.awt.Color(75, 83, 101));
        btnCancela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancela.setForeground(new java.awt.Color(255, 255, 255));
        btnCancela.setText("Cancelar");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        if(this.lblTitulo.getText().equals("Novo Cliente")){
            cadastrarCliente();
        } else {
            alterarCadastro(cliente);
        }
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    
    public void cadastrarCliente() {
        if(verificaExistenciaCPF(txtCpf.getText())){
            if (verificaIntegridadeCPF(txtCpf.getText())) {
                if (verificaCamposNulos()) {
                    String sNome = txtNome.getText();
                    String sCpf = txtCpf.getText();
                    long sRg = Integer.parseInt(txtRg.getText());
                    String sCnh = txtCnh.getText();
                    String sCatCnh = txtCategoriaCnh.getText().toUpperCase();
                    String sCep = txtCep.getText();
                    String sEndereco = txtEndereco.getText();
                    String sBairro = txtBairro.getText();
                    String sCidade = txtCidade.getText();
                    String sEstado = cbEstado.getSelectedItem().toString();
                    String sTelefone = txtTelefone.getText();
                    String sEmail = txtEmail.getText().toLowerCase();
                    String sWhatsapp = txtWhatsapp.getText();

                    Pessoa p = new Cliente(sNome, sCpf, sRg, sCnh, sCatCnh, sCep, sEndereco, sBairro, sCidade, sEstado, sTelefone, sEmail, sWhatsapp);
                    pessoas.adicionarPessoa(p);
                    if (consultaCliente != null) {
                        consultaCliente.limparTabela();
                        consultaCliente.popularTabela();
                    }
                    apresentaMensagem(p.toString(), "teste");
                    apresentaMensagem("Cliente cadastrado com sucesso", "Sucesso");
                    this.dispose();
                } else {
                    apresentaMensagem("Preencha todos os campos", "Erro");
                }
            } else {
               apresentaMensagem("CPF inválido, digite novamente", "Erro"); 
            }
        } else {
            apresentaMensagem("CPF já consta no sistema", "Erro");
        }
    }
        
        
    public void alterarCadastro(Cliente cliente){
        if(verificaCpf(txtCpf.getText())){
            if(verificaCamposNulos()){
                pessoas.removerPessoa(cliente.getCpf());
                cliente.setNome(txtNome.getText());
                cliente.setCpf(txtCpf.getText());
                cliente.setRg(Long.parseLong(txtRg.getText()));
                cliente.setCnh(txtCnh.getText());
                cliente.setCategoriaCnh(txtCategoriaCnh.getText().toUpperCase());
                cliente.setCep(txtCep.getText());
                cliente.setEndereco(txtEndereco.getText());
                cliente.setBairro(txtBairro.getText());
                cliente.setCidade(txtCidade.getText());
                cliente.setEstado(cbEstado.getSelectedItem().toString());
                cliente.setTelefone(txtTelefone.getText());
                cliente.setEmail(txtEmail.getText().toLowerCase());
                pessoas.adicionarPessoa(cliente);
                consultaCliente.popularTabela();
                
                apresentaMensagem("Cliente alterado com sucesso.", "Alteração realizada");
                this.dispose();
            } else {
                apresentaMensagem("Preencha todos os campos!", "Erro na alteração");
            }
        } else {
            apresentaMensagem("O CPF digitado é inválido.", "Erro na alteração");
        }
    }    
        
    public boolean verificaExistenciaCPF(String cpf) {
        if (pessoas.buscarPessoaPorCPF(cpf) == null){
            return true;   
        }
        else
            return false;     
    }

    public boolean verificaIntegridadeCPF(String cpf) {
        if (cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean verificaCpf(String cpf){
        if(cpf.length() == 11){
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnCancela;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCNH;
    private javax.swing.JLabel lblCategoriaCnh;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContato;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCategoriaCnh;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnh;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtWhatsapp;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limparCampos() {
       txtCpf.setText("");
       txtNome.setText("");
       txtTelefone.setText("");
    }

    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
         JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

    @Override
    public void organizaLayout() {
         initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(860, 475);
        this.add(pnlDados);
        this.add(pnlContato);
        this.add(pnlEndereco);
        this.add(btnCadCliente);
        this.add(btnCancela);
    }

    @Override
    public boolean verificaCamposNulos() {
         if (!((txtCpf.getText().trim().equals("")) || (txtNome.getText().trim().equals("")) || (txtTelefone.getText().trim().equals(""))
             || txtBairro.getText().trim().equals("") || txtCategoriaCnh.getText().trim().equals("") || txtCep.getText().trim().equals("") 
             || txtCidade.getText().trim().equals("") || txtRg.getText().trim().equals("") || txtCnh.getText().trim().equals("")
             || txtEndereco.getText().trim().equals("") || cbEstado.getSelectedItem().toString().trim().equals("")
             || txtWhatsapp.getText().trim().equals(""))) {
            return true;
        } else {
            return false;
        }
    }
}
