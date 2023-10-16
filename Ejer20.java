import java.io.PrintStream;
import java.util.Scanner;

public class Ejer20{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        int number=0;
        int residue=0;
        String message = "";
        screen.println("ingrese un numero entero");
        number=keyboard.nextInt();
        residue=(number%2);
        if(residue==0){message="el numero ingresado es par";
    }
        else{message="el numero ingresado es impar";
    }
    screen.println(message);

    }
}