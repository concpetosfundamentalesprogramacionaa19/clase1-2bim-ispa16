/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[5];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-20", "20-adelante"};
        boolean bandera = false;
        double nota;
        //ingreso de datos y asignacion de rangos
        while (bandera == false) {
        	System.out.println("ingrese una nota");
        	nota = entrada.nextDouble();
            if(nota <= 8){
                datos[0] = datos[0] + 1;
            }else{
                if(nota > 8 && nota <=12){
                    datos[1] = datos[1] + 1;
                }else{
                	if(nota > 12 && nota <= 16){
                		datos[2] = datos[2] + 1;
                }else {
                	if (nota > 16 && nota <=20) {
                		datos[3] = datos[3] + 1;
                	}else {
                		datos[4] = datos[4] + 1;
                	}
                }
            }
            }
            //salida del ciclo while
            System.out.println("desea ingresar otra nota");
            entrada.nextLine();
            String respuesta = entrada.nextLine();
            if (respuesta.equals("no")){
            	bandera = true;
            }           
        }
        //impresion de resultados
        System.out.println("Resultados");
        
        for(int i = 0; i<datos.length; i++){
            System.out.printf("Notas en rango %s - %d\n", rangos[i], datos[i]);
        }
        


    }}
