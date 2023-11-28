/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author isaimeza
 */
public class TestColecciones1 {
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
        
        Set miSet = new HashSet();
        miSet.add("Lunes");
    }
   
}
