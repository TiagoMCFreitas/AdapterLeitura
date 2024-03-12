/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adapterleitura.visao;

import com.adapterleitura.especifico.CSV;
import com.adapterleitura.especifico.JSON;

/**
 *
 * @author Lenovo
 */
public class teste {
  

    public static void main(String[] args) {
        CSV json = new CSV();
        System.out.println(        json.readCsv("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\AdapterLeitura\\src\\main\\java\\com\\adapterleitura\\arquivos\\leitura.csv"));
    }
}

