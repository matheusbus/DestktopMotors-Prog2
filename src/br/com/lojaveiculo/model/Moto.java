/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

/**
 *
 * @author Matheus
 */
public class Moto extends Veiculo{

    protected int cilindrada;

    public Moto(String placa, String modelo, Marca marca, int ano, double preco, String tipoCombustivel, int cilindrada) {
        super(placa, modelo, marca, ano, preco, tipoCombustivel);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMoto{" + "cilindrada=" + cilindrada + '}';
    }
    
    
    
}
