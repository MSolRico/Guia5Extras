/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
/* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá 
detenerse en cuanto se detecte alguna diferencia entre los elementos). */ 
public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Ingrese el tamaño de los vectores");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] vector = new int[n];
        int[] vector2 = new int[n];
        
        for (int i = 0; i < n ; i++) {
            vector[i] = (int)(Math.random()*10);
            vector2[i] = (int)(Math.random()*10);
            if (vector[i]!=vector2[i]){
                System.out.println("Los vectores son diferentes desde la posicion: " +i);
                break;
            }
        }
    }
}
