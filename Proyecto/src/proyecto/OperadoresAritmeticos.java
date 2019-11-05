/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 3;
        int suma = valorA + valorB;
        double divisionDos = valorA / (double)valorB;

        System.out.printf("Suma: %d + %d = %d\n", valorA, valorB,
                valorA + valorB);
        System.out.printf("Suma: %d + %d = %d\n", valorA, valorB,
                suma);
        
        System.out.printf("Resta: %d - %d = %d\n", valorA, valorB,
                valorA - valorB);
       
        System.out.printf("Multiplicación: %d * %d = %d\n", valorA, valorB,
                valorA * valorB);
        System.out.printf("División: %d / %d = %d\n", valorA, valorB,
                valorA / valorB);
                System.out.printf("División Dos: %d / %d = %.2f\n", valorA, valorB,
                divisionDos);
        
        System.out.printf("Módulo o Resto: %d %% %d = %d\n", valorA, valorB,
                valorA % valorB); //El comentario del Modulo o Resto 
                                  // ejemplo:4%2=0 es el residuo 
                                  // Es especial en printf %%
        
    }

}
