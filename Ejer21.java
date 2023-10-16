import java.io.PrintStream;
import java.util.Scanner;

public class Ejer21{

    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int number = 0;
        String message = "";
        screen.println("ingrese un numero entero cualquiera");
        number=keyboard.nextInt();
        if(number>0){message="el numero es positivo";}
        else if(number<0){message="el numero es negativo";}
        else{message="el numero es 0";}
        screen.println(message);

    


    
}
    
}
