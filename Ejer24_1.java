public class Ejer24_1 extends Base{
    public static void main(String[] args) {
        int height1 = 0;
        int height2 = 0;
        int height3 = 0;
        int bigger_height = 0;
        int half_height = 0;
        int lower_height =0;
        int temporary = 0;

    screen.println("- Dada la altura de 3 personas vamos a mostraslas en forma descendente por favor ingrese la primer altura en cm: ");
    height1 = keyboard.nextInt();
    screen.println("- ingrese la segunda altura en cm: ");
    height2 = keyboard.nextInt();
    screen.println("- Ingrese la tercera altura en cm: ");
    height3 = keyboard.nextInt();

    lower_height = height1;
    half_height = height2;
    bigger_height = height3;


    if(lower_height>half_height){
        temporary = lower_height;
        lower_height = half_height;
        half_height = temporary;
    }
    if(half_height>bigger_height){
        temporary = half_height;
        half_height = bigger_height;
        bigger_height = half_height;
    }
    if(lower_height>half_height){
        temporary=lower_height;
        lower_height=half_height;
        half_height=temporary;
    }
    screen.println("El orden ascendente es primero: " + lower_height +" segundo: " + half_height + " tercero: " + bigger_height);
    }
    

    
}
