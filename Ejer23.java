public class Ejer23 extends Base{

    public static void main(String[] args) {

    int q_tire = 0;
    int value_of_tire;
    screen.println("se va a Calcular el total que una persona debe pagar en un monta llantas, si el costo de cada llanta es \nde $120.000; sin embargo hay una promoción en caso de que se compren 4 salen a 108.000 C/U, por favor ingrese la cantidad de llantas a comprar: ");
    q_tire=keyboard.nextInt();
    if (q_tire<4){value_of_tire = q_tire*120000;}
    else{value_of_tire=q_tire*108000;}
    screen.println("el valor de las llantas es: "+value_of_tire);
    
}
    
}
