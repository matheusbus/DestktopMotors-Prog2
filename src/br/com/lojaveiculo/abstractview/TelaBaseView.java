/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.abstractview;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public abstract class TelaBaseView extends javax.swing.JFrame {

    /**
     * Creates new form TelaBaseView
     */
    public TelaBaseView() {
        initComponents();
    }

    //Método apra apresentar mensagens na tela.
    public void apresentaMensagem(String mensagem, String titulo){
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

    // Método que faz a organização do layout e é chamado no construtor.
    public abstract void organizaLayout();
    
    public int criaQuestaoPrgunta(String mensagem, String titulo){
        return JOptionPane.showConfirmDialog(rootPane, mensagem, titulo, WIDTH);
    }
    
    public void exibirTela(){
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void fecharTela(){
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
