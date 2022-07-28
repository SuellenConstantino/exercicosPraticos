package com.java.metodos.exercicioII;

public class Quadrilatero {
    public static void area(double lado){
        System.out.print(" Área do quadrado : " + lado * lado);
    }
    public  static void area(double lado1, double lado2) {
        System.out.print(" Área do retangulo: " + lado1 * lado2);
    }
        public static void area(double baseMaior, double baseMenor, double altura) {
            System.out.print(" Área do trapézio : " + ((baseMaior + baseMenor)*altura) /2);
        }
    public static void area(float diagonal1, float diagonal2){
        System.out.print(" Area do losango: " + (diagonal1*diagonal2)/2);
    }
    }


