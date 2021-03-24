package com.mycompany.talleralgoritmosrecursivos;

//Elaborado por: Valentina Meneses Tangarife

public class Punto4 {
    
    static public long f (int n) {
         if (n == 0 || n == 1){
        return 1;
    }else{
                return 3 * f(n-2)+2 *f(n-1);
                
                }
    }
    
    
    public static void main(String[] args) {
       int n = 4;
        System.out.println( f(n));
    }
    
    /*4. La secuencia es si tomamos en cuenta el 0 seria 
        0 = 1 
        1 = 1
        2 = 5
        3 = 13 
        4 = 41
        5 = 121
    */
}
