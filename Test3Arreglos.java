/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3arreglos;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Test3Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numNotas;
        int numAlumnos;
        float calificacion;
        System.out.println("Curso");
        System.out.println("Ingrese cantidad de alumnos");
        numAlumnos=sc.nextInt();
        System.out.println("Ingrese cantidad de notas por alumno a evaluar");
        numNotas=sc.nextInt();
        
        float notas[][]=new float [numAlumnos+3][numNotas+3];
        String palabra[]=new String [numNotas+4];
        
        
        
        for(int i=0;i<notas.length-3;i++){
            System.out.println("Notas alumno "+(i+1));
            for(int j=0;j<notas[i].length-3;j++){
                calificacion=sc.nextFloat();
                notas[i][j]=calificacion;
            }
        }
        
        
        
        for(int i=0;i<palabra.length;i++){
            
            if(i==0){
                palabra[0]="          ";
            }
            if(i<numNotas+1 && i>0){
                palabra[i]="N "+i+"  ";
            }
            if(i==numNotas+1){
                palabra[i]="Min ";
                palabra[i+1]="Max ";
                palabra[i+2]="Promedio";
            }
        }
        for(int i=0;i<palabra.length;i++){
            System.out.print(palabra[i]);
        }
        
        
        for(int i=0;i<notas.length-3;i++){
            float acumPromedio=0;
            
            float min=9999999;
            float max=-999999;
            System.out.println("");    
            System.out.print("Alumno "+(i+1)+" ");
            for(int j=0;j<notas[i].length-3;j++){
                
                    acumPromedio=acumPromedio+notas[j][i];
                    
                
                if(notas[i][j]<=min){
                    min=notas[i][j];
                
                }
                if(notas[i][j]>=max){
                    max=notas[i][j];
                }
                System.out.print(" "+notas[i][j]+" ");
                
            }
            acumPromedio=acumPromedio/(notas[i].length-3);
            System.out.print(" "+min+" "+max+" "+acumPromedio+"\n");
        }
        System.out.println("");
        
        
        //for(int i=0;i<notas.length-3;i++){
          //  float min=9999999;
            //float max=-999999;
            //for(int j=0;j<notas[i].length-3;j++){
                //if(notas[j][i]<=min){
                    //min=notas[j][i];
                //}
                //if(notas[j][i]>max){
                    //max=notas[j][i];
                //}
                
            //}
            //if(i==0){
                //System.out.print("Min");
                //System.out.print(" "+min);
            //}
            //System.out.print(" "+max);
            //System.out.println("");
        //}
        
        System.out.println("========================");
        for(int i=0;i<notas.length-3;i++){
            System.out.print("Las notas azules del alumno "+(i+1)+" son: ");
            for(int j=0;j<notas[i].length-3;j++){
                if(notas[i][j]>=4){
                    System.out.print(notas[i][j]+"   ");
                    
                
                }
            }
            System.out.println("");
        
        }
    }
    
}
