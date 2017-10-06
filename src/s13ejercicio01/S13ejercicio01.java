/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s13ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S13ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.print("ingrese el numero de estudiantes :");
        int [] notas=new int [input.nextInt()];
        char [] grado=new char[notas.length];
        
        System.out.print("ingresa " + notas.length + " notas :");
        for(int i=0+1; i<notas.length; i++){
            notas[i]=input.nextInt();
        }
        tenergrados(notas,grado);
        
        for(int i=0+1;i<notas.length;i++){
            System.out.println("El estudiante " + (i+1) + " tiene de nota  " + 
                    notas[i] + "  y su grado es " + grado[i] );
        }
        }
    public static int max(int[] array){
        int max = array[0];
        for(int i = 1; i< array.length; i++){
            if (array[i]> max)
                max=array[i];
        }
        return max;
    }
    public static void tenergrados(int[] notas, char[] grado ){
        int best=max(notas);
        for(int i=0; i<notas.length; i++){
            if(notas[i]>=best -10)
                    grado[i]='A';
            else if(notas[i]>=best -20)
                    grado[i]='B';
            else if(notas[i]>=best -30)
                    grado[i]='C';
            else if(notas[i]>=best -40)
                    grado[i]='D';
           else
                    grado[i]='F';
        }
    }
    
}
