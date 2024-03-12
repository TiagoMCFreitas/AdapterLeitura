/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adapterleitura.adapter;

import com.adapterleitura.especifico.JSON;
import com.adapterleitura.modelo.ILeitura;

/**
 *
 * @author Lenovo
 */
public class JsonLeituraAdapter implements ILeitura{
     private JSON leitorJson;
    public JsonLeituraAdapter(JSON leitorJson) {
        this.leitorJson = leitorJson;
    }
    @Override
    public String read(String fileName) {
        return leitorJson.readJSON(fileName);
    }

}
