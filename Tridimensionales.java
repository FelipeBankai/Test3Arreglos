/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tridimensionales;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Tridimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numNotas;
        int numAlumnos;
        int asignatura;
        float calificacion;
        System.out.println("Curso");
        System.out.println("Ingrese numero de asignaturas");
        asignatura=sc.nextInt();
        System.out.println("Ingrese cantidad de alumnos");
        numAlumnos=sc.nextInt();
        System.out.println("Ingrese cantidad de notas por alumno a evaluar");
        numNotas=sc.nextInt();
        
        
        float matriz[][][]=new float [asignatura][numAlumnos+3][numNotas+3];
        String palabra[]=new String [numNotas+4];
        
        for(int i=0;i<matriz.length;i++){
            System.out.println("Asignatura "+(i+1));
            for(int j=0;j<matriz[i].length-3;j++){
                System.out.println("Notas alumno "+(j+1));
                for(int k=0;k<matriz[i][j].length-3;k++){
                calificacion=sc.nextFloat();
                matriz[i][j][k]=calificacion;
                
                }
            
            }
        
        }
        for(int i=0;i<matriz.length;i++){
            
            for(int j=0;j<matriz[i].length-3;j++){
                float acumPromedio=0;

                float min=9999999;
                float max=-999999;
                
                for(int l=0;l<palabra.length;l++){
                    if(l==0){
                    palabra[0]="          ";
                    }
                    if(l<numNotas+1 && l>0){
                        palabra[l]="N "+l+"  ";
                    }
                    if(l==numNotas+1){
                        palabra[l]="Min ";
                        palabra[l+1]="Max ";
                        palabra[l+2]="Promedio";
                    }
                    System.out.print(palabra[l]);
                    
                }
                
                System.out.println("");
                System.out.print("Alumno "+(j+1)+" ");
                for(int k=0;k<matriz[i][j].length-3;k++){
                    acumPromedio=acumPromedio+matriz[i][j][k];


                    if(matriz[i][j][k]<=min){
                        min=matriz[i][j][k];

                    }
                    if(matriz[i][j][k]>=max){
                        max=matriz[i][j][k];
                    }
                    System.out.print(" "+matriz[i][j][k]+" ");
                    acumPromedio=acumPromedio/(matriz[i][j].length-3);
                System.out.print(" "+min+" "+max+" "+acumPromedio+"\n");
                }
                System.out.println("");
            }
        }
        //
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length-3;j++){
                float acumPromedio=0;

                float min=9999999;
                float max=-999999;//
                System.out.println("");    
                System.out.print("Alumno "+(j+1)+" ");
                
                

                for(int k=0;k<matriz[i][j].length-3;k++){

                        acumPromedio=acumPromedio+matriz[i][j][k];


                    if(matriz[i][j][k]<=min){
                        min=matriz[i][j][k];

                    }
                    if(matriz[i][j][k]>=max){
                        max=matriz[i][j][k];
                    }
                    System.out.print(" "+matriz[i][j][k]+" ");

                }
                acumPromedio=acumPromedio/(matriz[i][j].length-3);
                System.out.print(" "+min+" "+max+" "+acumPromedio+"\n");
            }
            System.out.println("");
        
        
    }
        System.out.println("========================");
        for(int i=0;i<matriz.length;i++){
            System.out.println("Asignatura "+(i+1));
            for(int j=0;j<matriz[i].length-3;j++){
                System.out.print("Las notas azules del alumno "+(j+1)+" son: ");
                for(int k=0;k<matriz[i][j].length-3;k++){
                    if(matriz[i][j][k]>=4){
                        System.out.print(matriz[i][j][k]+"   ");


                    }
                }
                System.out.println("");

            }
        }
    }
}
