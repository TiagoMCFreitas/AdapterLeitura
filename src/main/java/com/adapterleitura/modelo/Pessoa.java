/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adapterleitura.modelo;

/**
 *
 * @author Lenovo
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String idade;

    public Pessoa(String nome, String sobrenome, String idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
@Override    
    public String toString(){
        String saida = "Nome: " + getNome() + " Sobrenome: " + getSobrenome() + " Idade: " + getIdade();
        return saida;
    }    

    public Pessoa() {
    }
    
}
