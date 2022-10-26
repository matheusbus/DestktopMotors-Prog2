package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseCadastroView;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.interfaces.ValidaCadastroVeiculo;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public final class CadastroMotoView extends TelaBaseCadastroView implements ValidaCadastroVeiculo {

    private final VeiculoRepositorio veiculos = new VeiculoDAO();
    private ConsultaMotoView consultaMoto = null;
    private Moto moto;

    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroMotoView() {
        organizaLayout();
    }

    public CadastroMotoView(ConsultaMotoView consultaMoto) {
        organizaLayout();
        this.consultaMoto = consultaMoto;
    }

    // Construtor utilizado ao alterar uma moto.
    public CadastroMotoView(ConsultaMotoView consultaMoto, Moto moto) {
        organizaLayout();
        this.txtPlaca.setEditable(false);
        this.consultaMoto = consultaMoto;
        lblTitulo.setText("Alterar Moto");
        btnCadMoto.setText("Alterar");
        txtPlaca.setText(moto.getPlaca());
        txtModelo.setText(moto.getModelo());
        txtMarca.setText(moto.getMarca().getNome());
        txtChassi.setText(moto.getChassi());
        txtCor.setText(moto.getCor());
        cbTipoCarroceria.setSelectedItem(moto.getTipoCarroceria());
        txtCilindradas.setText(Integer.toString(moto.getCilindrada()));
        cbAno.setSelectedItem(moto.getAno());
        txtPreco.setText(Double.toString(moto.getPreco()));
        cbCombustivel.setSelectedItem((String) moto.getTipoCombustivel());
        this.moto = moto;
    }

    @Override
    public void organizaLayout() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(860, 475);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadMoto = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtCilindradas = new javax.swing.JTextField();
        lblCilindradas = new javax.swing.JLabel();
        cbCombustivel = new javax.swing.JComboBox<>();
        lblCombustivel = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        cbAno = new javax.swing.JComboBox<>();
        cbTipoCarroceria = new javax.swing.JComboBox<>();
        lblTipoCarroceria = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        lblChassi = new javax.swing.JLabel();
        btnCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Moto");
        setPreferredSize(new java.awt.Dimension(400, 328));

        btnCadMoto.setBackground(new java.awt.Color(82, 148, 226));
        btnCadMoto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadMoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadMoto.setText("Cadastrar");
        btnCadMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadMotoActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Nova Moto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        lblModelo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo");

        lblPlaca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa");

        lblMarca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca");

        lblCor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCor.setForeground(new java.awt.Color(255, 255, 255));
        lblCor.setText("Cor");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Valor");

        lblCilindradas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCilindradas.setForeground(new java.awt.Color(255, 255, 255));
        lblCilindradas.setText("Cilindradas");

        cbCombustivel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        cbCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Elétrica" }));

        lblCombustivel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        lblCombustivel.setText("Combustível");

        lblAno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAno.setForeground(new java.awt.Color(255, 255, 255));
        lblAno.setText("Ano");

        cbAno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbAno.setForeground(new java.awt.Color(255, 255, 255));
        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        cbTipoCarroceria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbTipoCarroceria.setForeground(new java.awt.Color(255, 255, 255));
        cbTipoCarroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Big Trail", "Custom", "Esportiva", "Naked", "Scooter", "Street", "Touring", "Trail", "Off-road" }));

        lblTipoCarroceria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTipoCarroceria.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCarroceria.setText("Tipo da Carroceria");

        txtChassi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblChassi.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblChassi.setForeground(new java.awt.Color(255, 255, 255));
        lblChassi.setText("Chassi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtModelo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCor)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtChassi)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCilindradas)
                            .addComponent(txtCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblTipoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbAno, 0, 94, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(cbTipoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTipoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(cbTipoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadMotoActionPerformed
        if (lblTitulo.getText().equals("Alterar Moto")) {
            alterarMoto(moto);
        } else {
            cadastrarMoto();
        }

    }//GEN-LAST:event_btnCadMotoActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    public void cadastrarMoto() {
        if (verificaPlaca(txtPlaca.getText())) {
            if (verificaCamposNulos()) {
                try {
                    String placa = txtPlaca.getText().toUpperCase();
                    String modelo = txtModelo.getText();
                    Marca marca = new Marca(txtMarca.getText());
                    String chassi = txtChassi.getText();
                    String cor = txtCor.getText();
                    String tipoCarroceira = cbTipoCarroceria.getSelectedItem().toString();
                    int ano = Integer.parseInt(cbAno.getSelectedItem().toString());
                    Double preco = Double.valueOf(txtPreco.getText());
                    String tipoCombustivel = cbCombustivel.getItemAt(cbCombustivel.getSelectedIndex());
                    int cilindradas = Integer.parseInt(txtCilindradas.getText());

                    Moto novaMoto = new Moto(placa, modelo, marca, chassi, cor, tipoCarroceira, ano, preco, tipoCombustivel, cilindradas);
                    veiculos.addVeiculo(novaMoto);
                    if (consultaMoto != null) {
                        consultaMoto.limparTabela();
                        consultaMoto.popularTabela();
                    }
                    apresentaMensagem("Veículo cadastrado com sucesso.", "Cadastro realizado");
                    this.dispose();
                } catch (NumberFormatException ex) {
                    apresentaMensagem("Prencha os campos com valores válidos", "Erro");
                }
            } else {
                apresentaMensagem("Preencha todos os campos!", "Erro no cadastro");
            }
        } else {
            apresentaMensagem("A placa digitada é invalida!", "Erro no cadastro");
        }
    }

    public void alterarMoto(Moto moto) {
        if (verificaPlaca(txtPlaca.getText())) {
            if (verificaCamposNulos()) {
                try {
                    veiculos.removeVeiculo(moto.getPlaca());
                    moto.setAno(Integer.parseInt(cbAno.getSelectedItem().toString()));
                    moto.setCilindrada(Integer.parseInt(txtCilindradas.getText()));
                    moto.setModelo(txtModelo.getText());
                    moto.setPreco(Double.parseDouble(txtPreco.getText()));
                    moto.setTipoCombustivel(cbCombustivel.getSelectedItem().toString());
                    moto.getMarca().setNome(txtMarca.getText());
                    moto.setChassi(txtChassi.getText());
                    moto.setCor(txtCor.getText());
                    moto.setTipoCarroceria(cbTipoCarroceria.getSelectedItem().toString());
                    veiculos.addVeiculo(moto);
                    consultaMoto.popularTabela();

                    apresentaMensagem("Veículo alterado com sucesso.", "Alteração realizada");
                    this.dispose();
                } catch (NumberFormatException ex) {
                    apresentaMensagem("Preencha os campos com valores válidos", "Erro");
                }
            } else {
                apresentaMensagem("Preencha todos os campos!", "Erro no cadastro");
            }
        } else {
            apresentaMensagem("A placa digitada é invalida!", "Erro no cadastro");
        }

    }

    @Override
    public boolean verificaCamposNulos() {
        if (!((txtModelo.getText().trim().equals("")) || (txtMarca.getText().trim().equals("")) || (txtPlaca.getText().trim().equals(""))
                || (txtPreco.getText().trim().equals("")) || (txtCilindradas.getText().trim().equals("")) || (txtChassi.getText().trim().equals("")))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean verificaPlaca(String placa) {
        if (placa.length() == 7) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadMoto;
    private javax.swing.JButton btnCancela;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbCombustivel;
    private javax.swing.JComboBox<String> cbTipoCarroceria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblChassi;
    private javax.swing.JLabel lblCilindradas;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTipoCarroceria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtCilindradas;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limparCampos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

}
