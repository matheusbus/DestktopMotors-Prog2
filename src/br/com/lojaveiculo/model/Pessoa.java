/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

/**
 *
 * @author Matheus
 */
public abstract class Pessoa implements Comparable<Pessoa>{
    
    protected String nome;
    protected String cpf;
    protected String telefone;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
        "CPF: " + this.telefone + "\n" +
        "Telefone: " + this.cpf + "\n";  
    }
    
     public Object[] obterDados(){
        return new Object[] {this.nome, this.cpf, this.telefone};
    } 

    @Override
    public int compareTo(Pessoa p) {
        return nome.compareTo(getNome());
    }
    
    
    
    
}
