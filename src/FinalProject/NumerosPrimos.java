package FinalProject;
import java.util.Scanner;
public class NumerosPrimos {
    
    public static void NumerosPrimoss(int cantidad){
    Scanner sc = new Scanner(System.in);
    int contador=0;

    
    int numerosPrimos = 0;
    String numeros = null;
    while (cantidad > 0){
    System.out.println("Ingrese el numero: ");
    int numero = sc.nextInt();
    
    for(int i = 1; i<= numero ;i++){
      int operacion = numero % i;
      if(operacion == 0){
        contador++;
      }
    }
    if(contador <= 2){
      System.out.println("El numero " + numero+ " es primo");
      numerosPrimos++;
      numeros = numeros+","+numero;
    }else{
      System.out.println("El numero "+ numero+" ingresado no es primo");
    }
      cantidad--;
      contador=0;
    }
    System.out.println("De los números ingresados "+ numerosPrimos + " son primos");
    System.out.println("Los numeros primos son : " + numeros);
    sc.close();
    }
}
