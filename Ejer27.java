import java.io.PrintStream;
import java.util.Scanner;

public class Ejer27 {

    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
    int birthdate_day = 0;
    int birthdate_month = 0;
    String zodiac_sign = "";

    screen.println("Segun tu fecha de nacimiento conoceras tu signo zodiacal, por favor ingresa tu dia de nacimiento: ");
    birthdate_day = keyboard.nextInt();
    screen.println("Ingresa tu mes de nacimiento: ");
    birthdate_month = keyboard.nextInt();
    
    if(birthdate_month==3){
        if(birthdate_day>=21)
        {zodiac_sign="Aries";}
        }
        if(birthdate_month==4){
            if(birthdate_day<=19)
            {zodiac_sign="Aries";}
            }
    if(birthdate_month==4){
        if(birthdate_day>=20)
        {zodiac_sign="Tauro";}
        }
        if(birthdate_month==5){
            if(birthdate_day<=20)
            {zodiac_sign="Tauro";}
            }
    if(birthdate_month==5){
        if(birthdate_day>=21)
        {zodiac_sign="Geminis";}
        }
        if(birthdate_month==6){
            if(birthdate_day <=20)
            {zodiac_sign="Geminis";}
        }
    if(birthdate_month==6){
        if(birthdate_day>=21)
        {zodiac_sign="Cancer";}
        }
        if(birthdate_month==7){
            if(birthdate_day<=22)
            {zodiac_sign="Cancer";}
        }
    if(birthdate_month==7 || birthdate_month==8){
        if(birthdate_day>=23 & birthdate_day<=22)
        {zodiac_sign="Leo";}
        }
        if(birthdate_month==8){
            if(birthdate_day<=22)
            {zodiac_sign="Leo";}
        }
    if(birthdate_month==8){
        if(birthdate_day>=23)
        {zodiac_sign="Virgo";}
        }
        if(birthdate_month==9){
            if(birthdate_day<=22)
            {zodiac_sign="Virgo";}
        }
    if(birthdate_month==9){
        if(birthdate_day>=23)
        {zodiac_sign="Libra";}
        }
        if(birthdate_month==10){
            if(birthdate_day<=22)
            {zodiac_sign="Libra";}
        }
    if(birthdate_month==10){
        if(birthdate_day>=23)
        {zodiac_sign="Escorpio";}
        }
        if(birthdate_month==11){
            if(birthdate_day<=21)
            {zodiac_sign="Escorpio";}
        }
    if(birthdate_month==11){
        if(birthdate_day>=22)
        {zodiac_sign="Sagitario";}
        }
        if(birthdate_month==12){
            if(birthdate_day<=21)
            {zodiac_sign="Sagitario";}
        }
    if(birthdate_month==12){
        if(birthdate_day>=22)
        {zodiac_sign="Capricornio";}
        }
        if(birthdate_month==1){
            if(birthdate_day<=19)
            {zodiac_sign="Capricornio";}
        }
    if(birthdate_month==1){
        if(birthdate_day>=20)
        {zodiac_sign="Acuario";}
        }
        if(birthdate_month==2){
            if(birthdate_day<=18)
            {zodiac_sign="Acuario";}
        }
    if(birthdate_month==2){
        if(birthdate_day>=19)
        {zodiac_sign="Picis";}
        }
        if(birthdate_month==3){
            if(birthdate_day<=20)
            {zodiac_sign="Picis";}
        }

    screen.println("El signo del zodiaco es: " + zodiac_sign);
        
    }
    
}
