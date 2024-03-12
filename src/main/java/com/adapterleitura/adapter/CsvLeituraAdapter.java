/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adapterleitura.adapter;

import com.adapterleitura.especifico.CSV;
import com.adapterleitura.modelo.ILeitura;

/**
 *
 * @author Lenovo
 */
public class CsvLeituraAdapter implements ILeitura{
    private CSV leitorCsv;
    public CsvLeituraAdapter(CSV leitorCsv) {
        this.leitorCsv = leitorCsv;
    }
    @Override
    public String read(String fileName) {
        return leitorCsv.readCsv(fileName);
    }
}
