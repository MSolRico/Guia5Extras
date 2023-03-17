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
/* 
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus 
elementos.
*/
public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("Introducir tamaño de la matriz:");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        int[][] matriz = new int[n][m];
        int suma = 0;
        
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print("[" + matriz[i][j] + "]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        
        System.out.println("La suma de todos los elementos de la matriz es igual a: " +suma);
    }
}
