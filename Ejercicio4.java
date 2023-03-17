/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

/**
 *
 * @author SFC
 */
/* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de 
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las 
ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los 
profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que 
solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
public class Ejercicio4 {
    public static void main(String[] args){
        double[][] matriz = new double[10][5];
        int desaprobados = 0, aprobados = 0;
        
        for (int i = 0 ; i < 10 ; i++){
            double tp1 = 0, tp2 = 0, integrador1 = 0, integrador2 = 0;
            for (int j = 0 ; j < 4 ; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                switch (j){
                    case 0:
                        tp1 = (matriz[i][0]*0.1);
                        break;
                    case 1:
                        tp2 = (matriz[i][1]*0.15);
                        break;
                    case 2:
                        integrador1 = (matriz[i][2]*0.25);
                        break;
                    case 3:
                        integrador2 = (matriz[i][3]*0.5);
                        break;
                }
                matriz[i][4]= tp1 + tp2 + integrador1 + integrador2;
            }
        }
        
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0 ; j < 5 ; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
        }
            System.out.println("");
        }
        
        for (int i = 0 ; i < 10 ; i++){
            if (matriz[i][4]<7){
                desaprobados++;
            } else { aprobados++;
            }
                    }
        System.out.println("Cantidad de alumnos aprobados: "+ aprobados);
        System.out.println("Cantidad de alumnos desaprobados: "+ desaprobados);
    }
}