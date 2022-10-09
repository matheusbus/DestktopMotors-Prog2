/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;


/**
 *
 * @author Rafael
 */
public class Vendedor extends Funcionario{
  
    private double comissão;

    public Vendedor(double comissão, double Salario , String nome, String cpf, String telefone) {
        super(Salario, nome, cpf, telefone);
        this.comissão = comissão;
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }
    
    
    
}