
package javaapplication11;
import java.util.Random;
import java.util.Scanner;
public class JavaApplication11 {

    
    public static void main(String[] args) {
       int i;
       int a;
       int number;
       Random randomObj= new Random();
       Scanner keyboard = new Scanner(System.in);
       
       
       System.out.println("how many numbers ? ");
       a=keyboard.nextInt();
       
       
       
       for (i=0; i<a; i++){
             number= randomObj.nextInt(1000);
       if(number%2==0){
           System.out.println(number + " number is even");
       }
       else{
           System.out.println(number + " number is odd");
       }
    
      
    }
    
}
}