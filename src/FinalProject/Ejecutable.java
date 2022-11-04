package FinalProject;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        
            
        
        System.out.println("Elige que ejercicio deseas ejecutar:\n"+
        "A) Numeros Primos\n"+
        "B) Serie Fibonnachi\n"+
        "C) Promedio de matricula\n"+
        "D) Promedio Edades Facultad de ingenieria\n"+
        "F) Salir" );

        opcion = sc.next();
        
        switch (opcion) {
            case "A":{
                System.out.println("¿Cuantos numeros va a ingresar? ");
                int cantidad = sc.nextInt();
                FinalProject.NumerosPrimos.NumerosPrimoss(cantidad);
                break;
        }
            case "B":{
                System.out.println("Ingrese el limite de la serie");
                int limite = sc.nextInt();
                FinalProject.SerieFibonacci.Fibonacci(limite);
                break;}
            case "C":
                FinalProject.PromedioMatriculasU.PromMatriculas();
                break;
            case "D":
                FinalProject.PromedioEdadesU.PromEdades();
                break;
            case "F":
            {
                break;
            }
            default:
                FinalProject.FuncionSwitch.funSwitch();
            
        }
            
        sc.close();
    }
}
