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
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las 
va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se
ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida 
la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java 
substring(), Length() y Math.random().
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        String[][] matriz = new String[20][20];
        Scanner read = new Scanner(System.in);
        String aux;
        int filas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra de entre 3 y 5 caracteres");
            aux = read.nextLine();
            if ((aux.length() >= 3) && (aux.length() <= 5)) {
                for (int j = 0; j < aux.length(); j++) {
                    if (j == 0) {
                        filas = (int) (Math.random() * 9);
                    }
                    if (matriz[filas][j] == null) {
                        matriz[filas][j] = aux.substring(j, j + 1);
                    } else { j--;
                    }
                }
            } else {
                System.out.println("Su número no tiene entre 3 y 5 caracteres");
                i--;
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
