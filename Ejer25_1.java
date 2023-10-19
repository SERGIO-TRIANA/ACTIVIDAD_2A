public class Ejer25_1 extends Base{
    public static void main(String[] args) {
    int height1 = 0;
    int height2 = 0;
    int height3 = 0;
    int height4 = 0;
    int quarter_height;
    int third_height;
    int second_height;
    int first_height;
    int temporary = 0;
    screen.println(" - Dada la altura de 4 personas vamos a mostrarlas en forma ascendente por favor ingrese la primera altura en cm: ");
    height1 = keyboard.nextInt();
    screen.println(" - Ingrese la segunda altura en cm: ");
    height2 = keyboard.nextInt();
    screen.println(" - Ingrese la tercera altura en cm: ");
    height3 = keyboard.nextInt();
    screen.println(" - Ingrese la cuarta altura: ");
    height4 = keyboard.nextInt();

    first_height = height1;
    second_height = height2;
    third_height = height3;
    quarter_height = height4;

    if(first_height>second_height){
        temporary=first_height;
        first_height=second_height;
        second_height=temporary;
    }
    if(second_height>third_height){
        temporary=second_height;
        second_height=third_height;
        third_height=temporary;
    }
    if(third_height>quarter_height){
        temporary=third_height;
        third_height=quarter_height;
        quarter_height=temporary;
    }
    if(first_height>second_height){
        temporary=first_height;
        first_height=second_height;
        second_height=temporary;
    }
    if(second_height>third_height){
        temporary=second_height;
        second_height=third_height;
        third_height=temporary;
    }
    if(first_height>second_height){
        temporary=first_height;
        first_height=second_height;
        second_height=temporary;
    }
    screen.println("El orden ascendente es primero: " + first_height +" segundo: " + second_height + " tercero: " + third_height + " cuarto: " + quarter_height);
    }
    }
    

