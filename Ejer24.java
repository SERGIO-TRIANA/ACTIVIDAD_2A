public class Ejer24 extends Base{
    public static void main(String[] args) {
    int height1 = 0;
    int height2 = 0;
    int height3 = 0;
    int order_1 = 0;
    int order_2 = 0;
    int order_3 = 0;
    screen.println("- Dada la altura de 3 personas vamos a mostraslas en forma descendente por favor ingrese la primer altura en cm: ");
    height1 = keyboard.nextInt();
    screen.println("- ingrese la segunda altura en cm: ");
    height2 = keyboard.nextInt();
    screen.println("- Ingrese la tercera altura en cm: ");
    height3 = keyboard.nextInt();
    if (height1>=height2 & height1>=height3){order_3 = height1;}
    if (height2>=height1 & height2>=height3){order_3 = height2;}
    if (height3>=height1 & height3>=height2){order_3 = height3;}
    if (height1<=height2 & height1<=height3){order_1 = height1;}
    if (height2<=height1 & height2<=height3){order_1 = height2;}
    if (height3<=height1 & height3<=height1){order_1 = height3;}
    if (height1<=height3 & height1>=height2){order_2 = height1;} 
    if (height2<=height1 & height2>=height3){order_2 = height2;}
    if (height3<=height2 & height3>=height1){order_2 = height3;}
    else{;}
    screen.println("El orden ascendente es primero: " + order_1 +" segundo: " + order_2 + " tercero: " + order_3);
        
    }
}