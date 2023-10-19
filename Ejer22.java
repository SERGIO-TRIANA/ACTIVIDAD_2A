
public class Ejer22 extends Base{

    public static void main(String[] args) {
        int number = 0;
        String message = "";
        String message2 = "";
        screen.println("vamos a evaluar si dado un numero entero evaluar y mostrar si es positivo,\n negativo o cero y si es par o impar, por favor ingrese un numero entero");
        number=keyboard.nextInt();
        if(number>0){message=" - El numero es positivo";}
        else if(number<0){message= " - El numero es negativo";}
        else{message=" - El numero es 0";}
        if(number%2==0){message2=" - El numero es par";}
        else{message2=" - El numero es impar";}
        screen.println(message+message2);

    
}
    
}
