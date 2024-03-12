/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adapterleitura.especifico;

import com.adapterleitura.modelo.Pessoa;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class CSV {
public String readCsv(String filename){
    Pessoa pessoa = new Pessoa();
    BufferedReader conteudoCSV = null;
    String linha = "";
    String separator = ";";
    try {
        conteudoCSV = new BufferedReader(new FileReader(filename));
        while ((linha = conteudoCSV.readLine()) != null){
        String [] campo = linha.split(separator);
        pessoa.setNome(campo[0]);
        pessoa.setSobrenome(campo[1]);
        pessoa.setIdade(campo[2]);
    }
       
    } catch (FileNotFoundException ex) {
        Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
    }
    return pessoa.toString();
}
}
