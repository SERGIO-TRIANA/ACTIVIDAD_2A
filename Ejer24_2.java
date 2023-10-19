public class Ejer24_2 extends Base{
    public static void main(String[] args) {
        int[] height ={0, 0, 0};
        int[] height_order = {0, 0, 0};
        int temporary = 0;

    screen.println("- Dada la altura de 3 personas vamos a mostraslas en forma descendente por favor ingrese la primer altura en cm: ");
    height[0] = keyboard.nextInt();
    screen.println("- ingrese la segunda altura en cm: ");
    height[1] = keyboard.nextInt();
    screen.println("- Ingrese la tercera altura en cm: ");
    height[2] = keyboard.nextInt();

    height_order[0] = height[0];
    height_order[1] = height[1];
    height_order[2] = height[2];


    if(height_order[0]>height_order[1]){
        temporary = height_order[0];
        height_order[0] = height_order[1];
        height_order[1] = temporary;
    }
    if(height_order[1]>height_order[2]){
        temporary = height_order[1];
        height_order[1] = height_order[2];
        height_order[2] = temporary;
    }
    if(height_order[0]>height_order[1]){
        temporary=height_order[0];
        height_order[0]=height_order[1];
        height_order[1]=temporary;
    }
    screen.println("El orden ascendente es primero: " + height_order[0] +" segundo: " + height_order[1] + " tercero: " + height_order[2]);
    }
    

    
}