/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencia.pkgif.pkg2;
import java.util.*;

/**
 *
 * @author Edson Coj
 */
public class SentenciaIF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea 4
        System.out.println("Tarea 4");
        int num1;
        
        Scanner n=new Scanner(System.in);
        
        System.out.println("Ingrese un año");
        num1=n.nextInt();
        
        int x=2021-num1;
        int z=num1-2021;
        
        if (num1<2021)
            System.out.println(" Han pasado esta cantidad de años: " + x );
        
        if (num1>2021)
            System.out.println(" Faltan esta cantidad de años: " + z);
        
        // En este reto deberás programar un código que solicite al usuario que introduzca un número, lo asigne a una variable, compruebe si el número es positivo
        
        System.out.println("Tarea 5");
        
        System.out.println("Ingrese un numero a evaluar");
        num1=n.nextInt();
        
        if (0<num1)
            System.out.println("El numero es positivo");
        else
            System.out.println("El numero es negativo");
        
        // Compruebe si el número  tecleado tiene dos cifras (números comprendidos entre 10 y 99) en cuyo caso imprimirá por la consola el mensaje "Tiene dos cifras", en caso contrario imprimirá el mensaje "Distinto de dos cifras". 
        
        System.out.println("Tarea 6");
        
        System.out.println("Ingrese un numero a conocer su cantidad de cifras");
        num1=n.nextInt();
        
        if (num1>10)
            System.out.println("El numero tiene dos cifras");
        else 
            System.out.println("Distinto de dos cifras");
        
        
        
        
        
            
        
    
        
        

    }
    
}
