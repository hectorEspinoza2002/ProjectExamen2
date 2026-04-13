/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2do;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author hector
 */
public class Nodo {
    
    public String valor;
    public List<Nodo> hijos;
    
    public Nodo(String valor){
        this.valor = valor;
        hijos = new ArrayList<Nodo>();
    }
    
}
