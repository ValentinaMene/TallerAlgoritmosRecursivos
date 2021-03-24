package com.mycompany.talleralgoritmosrecursivos;

//Elaborado por: Valentina Meneses Tangarife

public class Metodos1y2 {

    public double sumatoriaRecursiva(double numero) {
        if (numero == 1) {
            return 1;
        } else {

            return (sumatoriaRecursiva(numero - 1) / numero);

        }
    }

    public double factorialRecursivo(double numero) {
        double resultado;
        // System.out.println("Recibí como argumento: " + numero);
        if (numero == 1) {
            //   System.out.println("Retorné como resultado: " + 1);
            return 1;
        } else {
            resultado = numero * factorialRecursivo(numero - 1);
            //  System.out.println("Retorné como resultado: " + resultado);
            return resultado;
        }
    }
}
