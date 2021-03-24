package com.mycompany.talleralgoritmosrecursivos;

//Elaborado por: Valentina Meneses Tangarife

public class Punto5 {
    
     static public long f (int n) {
         if (n == 0 || n == 1){
        return 1;
    }else if(n % 2 == 0){
        
                return 2  + f(n-1);
                
                } else{
        return 3 + f(n-2);
    }
    }
    
    public static void main(String[] args) {
   int n = 8;
        System.out.println( f(n));
    }
    
    /*
    5. La secuencia seria si tenemos en cuenta el 0 
        0 = 1
        1 = 1
        2 = 3
        3 = 4
        4 = 6
        5 = 7 
        6 = 9 
        7 = 10 
        8 = 12  
    */
}
