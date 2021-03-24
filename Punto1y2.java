package com.mycompany.talleralgoritmosrecursivos;

//Elaborado por: Valentina Meneses Tangarife

import java.util.Scanner;

public class Punto1y2 {

    public static void main(String[] args) {

        //punto 1
        double x;
        double y = 0;
        Scanner lc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea sumar");
        x = lc.nextInt();
        double con = 1;
        int opc = 0;
        System.out.println("Ingrese opcion");
        opc = lc.nextInt();
        switch (opc) {
            case 1: {
                for (int i = 0; i < x; i++) {
                    if (i == 0) {
                        y = 1;
                        con = con + 1;
                    } else {
                        double z = 1 / con;
                        System.out.println(z);
                        y = y + z;
                        con = con + 1;
                    }
                }
                System.out.println("La suma total de los:" + x + " numeros es de:" + y);

                //punto 2
                Metodos1y2 metodos = new Metodos1y2();
                double w = 0;
                double v = x;
                do {
                    w = w + metodos.sumatoriaRecursiva(x);
                } while (w < y);
                System.out.println("La suma total de los:" + x + " numeros es de:" + w);
                break;
            }
            case 2: {
                for (int i = 0; i < x; i++) {
                    if (i == 0) {
                        y = 1;
                        con = con + 1;
                    } else {
                        double a = 1;
                        for (double j = 1; j < con; j++) {
                            a = a * (j + 1);
                        }
                        double z = 1 / a;
                        // System.out.println(z);
                        y = y + z;
                        con = con + 1;
                    }
                }
                System.out.println("La suma total de los:" + x + " numeros es de:" + y);

                Metodos1y2 metodos = new Metodos1y2();
                double w = 0;
                double v = x;
                do {
                    w = w + (1 / metodos.factorialRecursivo(x));
                } while (w < y);
                System.out.println("La suma total de los:" + x + " numeros es de:" + w);
                break;
            }
        }
    }
}
