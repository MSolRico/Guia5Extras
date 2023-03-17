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
/* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector. */
public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Ingrese el tamaño de los vectores");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] vector = new int[n];
        llenar(vector);
        imprimir(vector);
    }
        
    public static void llenar(int[] vector){
        
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = (int)(Math.random()*100);
        }
    }
    
    public static void imprimir(int[] vector){
        
        for (int i = 0; i < vector.length ; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }
}

