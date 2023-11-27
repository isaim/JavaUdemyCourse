/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author isaimeza
 */
public class Aritmetica {
    //Atributos
    int a;
    int b;
    
    //consrtuctor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando con argumentos");
    }
    
    //Metodo
    public void Sumar() 
    {
        System.out.println("Suma: " + (a + b));
    }
    
    public int SumarConRetorno()
    {
        return a + b;
    }
    
    public int SumarConArgumentos(int a, int b)
    {
        this.a = a;
        this.b = b;
        return SumarConRetorno();
    }
}
