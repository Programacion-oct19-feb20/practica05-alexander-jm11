/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia apagado 3 cuotas de navidad a sus hijos la cuota1:$15
 * cuaota2=$10 y l cuota3=$16 generar en programa java que permita ingresar por 
 * teclado el valor de las cuotas, luego presentar el promedio de dolares 
 * pagados entre las cuotas ademas presentar un mensaje en pantalla
 * (true o false) dependiendo del promedio si el promedio es (>=11 es true
 * o (<=11 es false)
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int cuota1;
        int cuota2;
        int cuota3;
        
        
        System.out.println("Ingrese el valor de la cuota 1:");
        cuota1 = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la cuota 2:");
        cuota2 = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la cuota 3:");
        cuota3 = entrada.nextInt();
        
        int promedio = (cuota1 + cuota2 + cuota3)/3;
                
        System.out.printf("Suma: %d + %d + %d = %d\n", cuota1, cuota2, cuota3,
                cuota1 + cuota2 + cuota3);
        System.out.printf("promedio de las cuotas es: "
                + "%d\n",promedio);
        
        System.out.printf("promedio es %d>=11=%s ", promedio, promedio >=11);
        
                
}
}