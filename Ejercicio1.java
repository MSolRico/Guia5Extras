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
/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los 
valores ingresados por el usuario.*/
public class Ejercicio1 {
    public static void main(String[] args){
        System.out.println("Ingrese el tamaño del vector");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] vector = new int[n];
        int suma;
        suma = 0;
        
        for (int i = 0 ; i < n ; i++){
            System.out.println("Ingrese los valores del vector");
            vector[i]= read.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es igual a: " + suma);
    }
}
