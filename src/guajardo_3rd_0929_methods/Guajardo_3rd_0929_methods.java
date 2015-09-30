/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guajardo_3rd_0929_methods;

/**
 *
 * @author rguajardo0103
 */
public class Guajardo_3rd_0929_methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
           // System.out.println(isEven (i)); 
            System.out.println(i + " is odd ");
            if(isPrime(i)){
                
                }
        }
    
    }
    
    /*
    A method is like a little program that communicates with other parts of the 
    program by returning values(most of the time)
    */
    static boolean isEven(int number){
         return (number % 2 == 0);
            } 
    static boolean isOdd(int number){
        return (number % 2 != 0);
    }
    static boolean isPrime(int somenumber){
        //boolean prime = true;
            int divisor = 0;
                for(int i = 2; i < somenumber; i++){
                    if(somenumber % i == 0){
                      //  prime = false;
                            divisor +=  1;
                    }
                     
        }
        if(divisor > 0){
            return false;
        }else{
            return true;
        }
    //return (divisor == 0);
}
}//final brace
