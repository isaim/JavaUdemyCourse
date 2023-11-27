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
public class PruebaAritmetica {
    public static void main(String[] args) {
        //variables locales
        int a = 10;
        int b = 2;
        miMetodo();
        
        Aritmetica ar = new Aritmetica();
        ar.a = 5;
        ar.b = 10;
        ar.Sumar();
        
        int resConRetorno = ar.SumarConRetorno();
        System.out.println("Suma con retorno = " + resConRetorno);
        
        int res = ar.SumarConArgumentos(3,4);
        System.out.println("Suma con valores = " + res);
        
        Aritmetica a2 = new Aritmetica();
        System.out.println("aritmetica a:" + a2.a);
        System.out.println("aritmetica b: " + a2.b);
        
        Aritmetica a3 = new Aritmetica(5,8);
        System.out.println("aritmetica a: " + a3.a);
        System.out.println("aritmetica a: " + a3.b);
    }
    
    public static void miMetodo() {
        System.out.println("Otro metodo");
    }
}
