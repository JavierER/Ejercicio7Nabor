package bol2_7;

import java.util.Scanner;


public class Bol2_7 {

    // creado por Nabor Lopez
   
    public static void main(String[] args) {
        double n;
        double i;
        double t;
        double resultado;
        Scanner dato = new Scanner(System.in);
        System.out.print("Introducir nomina :");
        n = dato.nextDouble();
        System.out.print("Introducir interes anual :");
        i = dato.nextDouble();
        i =i/1200;
        System.out.print("Introducir tiempo :");
        t = dato.nextDouble();
        System.out.print("Resultado ="+(n*Math.pow((1+i),(t*12)*i)/((Math.pow((1+i),t*12))-1)));
    }
    
}
        
