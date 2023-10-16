import java.io.PrintStream;
import java.util.Scanner;

public class Ejer25 {

    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
    int height1 = 0;
    int height2 = 0;
    int height3 = 0;
    int height4 = 0;
    int order_1 = 0;
    int order_2 = 0;
    int order_3 = 0;
    int order_4 = 0;
    screen.println(" - Dada la altura de 4 personas vamos a mostrarlas en forma ascendente por favor ingrese la primera altura en cm: ");
    height1 = keyboard.nextInt();
    screen.println(" - Ingrese la segunda altura en cm: ");
    height2 = keyboard.nextInt();
    screen.println(" - Ingrese la tercera altura en cm: ");
    height3 = keyboard.nextInt();
    screen.println(" - Ingrese la cuarta altura: ");
    height4 = keyboard.nextInt();
    if(height1>=height2 & height1>=height2 & height1>=height3){order_4 = height1;}
    else if(height2>=height1 & height2>=height3 & height2>=height4){order_4 = height2;}
    else if(height3>=height1 & height3>=height2 & height3>=height4){order_4 = height3;}
    else if(height4>=height1 & height4>=height2 & height4>=height3){order_4 = height4;}
    if(height1<=height2 & height1<= height3 & height1<=height4){order_1 = height1;}
    else if(height2<=height1 & height2<=height3 & height2<=height4){order_1 = height2;}
    else if(height3<=height1 & height3<=height2 & height3<=height4){order_1 = height3;}
    else if(height4<=height1 & height4<=height2 & height4<=height3){order_1 = height4;}
    if(height1<=height4 & height1>=height3 & height1>=height2){order_3=height1;}
    else if(height1<=height3 & height1>=height4 & height1>=height2){order_3=height1;}
    else if(height1<=height2 & height1>=height4 & height1>=height3){order_3=height1;}
    if(height2<=height4 & height2>=height3 & height2>=height1){order_3=height2;}
    else if(height2<=height3 & height2>=height4 & height2>=height1){order_3=height2;}
    else if(height2<=height1 & height2>=height4 & height2>=height3){order_3=height2;}
    if(height3<=height4 & height3>=height2 & height3>=height1){order_3=height3;}
    else if(height3<=height2 & height3>=height4 & height3>=height1){order_3=height3;}
    else if(height3<=height1 & height3>=height4 & height3>=height2){order_3=height3;}
    if(height4<=height3 & height4>=height2 & height4>=height1){order_3=height4;}
    else if(height4<=height2 & height4>=height3 & height4>=height1){order_3=height4;}
    else if(height4<=height1 & height4>=height3 & height4>=height2){order_3=height4;}
    if(height1>=height4 & height1<=height3 & height1<=height2){order_2=height1;}
    else if(height1>=height3 & height1<=height4 & height1<=height2){order_2=height1;}
    else if(height1>=height2 & height1<=height4 & height1<=height3){order_2=height1;}
    if(height2>=height4 & height2<=height3 & height2<=height1){order_2=height2;}
    else if(height2>=height3 & height2<=height4 & height2<=height1){order_2=height2;}
    else if(height2>=height1 & height2<=height4 & height2<=height3){order_2=height2;}
    if(height3>=height4 & height3<=height2 & height3<=height1){order_2=height3;}
    else if(height3>=height2 & height3<=height4 & height3<=height1){order_2=height3;}
    else if(height3>=height1 & height3<=height4 & height3<=height2){order_2=height3;}
    if(height4>=height3 & height4<=height2 & height4<=height1){order_2=height4;}
    else if(height4>=height2 & height4<=height3 & height4<=height1){order_2=height4;}
    else if(height4>= height1 & height4<=height3 & height4<=height2){order_2=height4;}
    screen.println("el orden ascendente es; primero: "+ order_1 + " segundo: " + order_2 + " tercero: " + order_3 + " cuarto: " + order_4);

        
    }
    
}
