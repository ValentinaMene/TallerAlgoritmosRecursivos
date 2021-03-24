package com.mycompany.talleralgoritmosrecursivos;

//Elaborado por: Valentina Meneses Tangarife

public class Punto3 {
    
    static public long factorial (long n) {
    
    if (n == 0 || n == 1){
        return 1;
    }else{
                return n * factorial (--n);
                
                }
    
}
    public static void main(String[] args) {
       long n = 20;
        System.out.println( factorial(n));
               
    }
    
    //El 3er punto no me presento falla, estuve comparandolo con los numeros factoriales y funciono totalmente bien.
}
