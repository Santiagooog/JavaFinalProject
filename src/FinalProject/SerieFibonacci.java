package FinalProject;
import java.util.Scanner;
public class SerieFibonacci{
    public static void Fibonacci(int limite){
        Scanner sc = new Scanner(System.in);
    
    int num1 = 0, num2 = 1, suma = 1;
    
    System.out.println(num1);
         
      for (int i = 1; i < limite; i++) {

        if((num1+num2+suma) <= limite){
          System.out.println(suma);
             
          suma = num1 + num2;
          num1 = num2;
          num2 = suma;
        }
      }
      sc.close();
    }
}