/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adapterleitura.especifico;
import com.adapterleitura.modelo.Pessoa;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Lenovo
 */
public class JSON {
   public String readJSON(String fileName) {
  
           JSONObject objetoJson;
           JSONParser parser = new JSONParser();
           Pessoa pessoa = new Pessoa();
           try {
               objetoJson = (JSONObject)parser.parse(new FileReader(fileName));
               pessoa.setNome((String) objetoJson.get("nome"));
               pessoa.setSobrenome((String) objetoJson.get("sobrenome"));
               pessoa.setIdade((String) objetoJson.get("idade"));
          
       } catch (IOException ex) {
           Logger.getLogger(JSON.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ParseException ex) {
           Logger.getLogger(JSON.class.getName()).log(Level.SEVERE, null, ex);
       }
           return pessoa.toString();
   }
    
}

