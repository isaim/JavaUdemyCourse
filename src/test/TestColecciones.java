/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editors
 */
package test;

import java.util.*;

/**
 *
 * @author isaimeza
 */
public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Mates");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        for(Object elemento : miLista) {
            System.out.println("elemento = " + elemento);
        }
        System.out.println();
        //lambda
        miLista.forEach(elemento -> {
            System.out.println("elemento2 = " + elemento);
        });
        
        System.out.println("List");
        imprimir(miLista);
        
        System.out.println("Set");
        
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Mates");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        imprimir(miSet);
        
        System.out.println("Map");
        
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("Valor3", "Elsa");
        
        String elemento = miMapa.get("Valor1").toString();
        System.out.println("elemento = " + elemento);
        
        System.out.println("KeySet");
        imprimir(miMapa.keySet());
        
        System.out.println("Values");
        imprimir(miMapa.values());
        
    }
   
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
    
}
