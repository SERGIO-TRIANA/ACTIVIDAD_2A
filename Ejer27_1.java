public class Ejer27_1 extends Base{
    public static void main(String[] args) {
        
        String date_of_birt = "";
        String birt_day = "";
        int birt_day_int = 0;
        String zodiac_sign = "";

        screen.println("Segun tu fecha de nacimiento conoceras tu signo zodiacal, por favor ingresa tu dia de nacimiento formato AAAA-MM-DD:");
        date_of_birt = keyboard.nextLine();

        birt_day = date_of_birt.substring(5,7) + date_of_birt.substring(8, 10);

        birt_day_int = Integer.parseInt(birt_day);

        if((birt_day_int>=321 && birt_day_int<=331) || (birt_day_int>=401 && birt_day_int <=419))
            zodiac_sign="Aries";
        else if((birt_day_int>=420 && birt_day_int<=430) || (birt_day_int>=501 && birt_day_int<=520))
            zodiac_sign="Tauro";
        else if((birt_day_int>=521 && birt_day_int<=531) || (birt_day_int>=601 && birt_day_int<=621));
            zodiac_sign="Geminis";
        if((birt_day_int>=622 && birt_day_int<=630) || (birt_day_int>=701 && birt_day_int<=722))
            zodiac_sign="Cancer";
        else if((birt_day_int>=723 && birt_day_int<=731) || (birt_day_int>=801 && birt_day_int <= 822))
            zodiac_sign="Leo";
        if ((birt_day_int>=823 && birt_day_int<=831) || (birt_day_int>=901 && birt_day_int<=922))
            zodiac_sign="Virgo";
        else if((birt_day_int>=923 && birt_day_int<= 930) || (birt_day_int>=1001 && birt_day_int<=1022))
            zodiac_sign="Libra";
        if((birt_day_int>=1023 && birt_day_int<=1031) || (birt_day_int>=1101 && birt_day_int<=1121))
            zodiac_sign="Escorpio";
        else if((birt_day_int>=1122 && birt_day_int<=1130) || (birt_day_int>=1201 && birt_day_int<=1221))
            zodiac_sign="Sagitario";
        if((birt_day_int>=1222 && birt_day_int<=1231) || (birt_day_int>=101 && birt_day_int<=119))
            zodiac_sign="Capricornio";
        else if((birt_day_int>=120 && birt_day_int<=131) || (birt_day_int>=201 && birt_day_int<=218))
            zodiac_sign="Acuario";
        if((birt_day_int>=219 && birt_day_int<=228) || (birt_day_int>=301 && birt_day_int<=320))
            zodiac_sign="Picis";
        if(!zodiac_sign.isEmpty())
            screen.println("Su signo del Zodiaco es: " + zodiac_sign);
            else
            screen.println("No se pudo determinar su signo zodiacal");
    }
    
}
