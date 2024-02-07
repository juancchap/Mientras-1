
package mientras1;

//Importacion de libreria
import java.util.Scanner;

public class Mientras1 {

    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        int i=1, contador;
        //Le pedimos al usuario que nos digite cuantos numeros
        System.out.println("Diguite cuantos numeros en pantalla: ");
        contador=entrada.nextInt();
        //mientras que
        while (i<=contador)
        {
            System.out.println(i);   
            i+=2;
        }
        
        
    }
    
}
