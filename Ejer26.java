public class Ejer26 extends Base{

    public static void main(String[] args) {
    long cell_phone_number = 0;
    long prefix = 0;
    String operator = "";
    String omr_o_omv = "";
    String Operator_infrastructure = "";
    String assigned_prefix = "";

    screen.println("hallaremos prefijo, nombre del operador al que pertenece, si el operador es OMR o OMV, de cual operador"+ 
    " es \n la infraestructura, y cuales son los prefijos asignados a ese operador, por favor digite el numero de telefono: ");
    cell_phone_number = keyboard.nextLong();
    prefix = cell_phone_number/10000000;
    if(prefix>=300 & prefix<=304){operator="Tigo";}
    else if(prefix==324){operator="Tigo";}
    else if(prefix>=310 & prefix<=314){operator="Claro";}
    else if(prefix>=320 & prefix<=323){operator="Claro";}
    else if(prefix>=315 & prefix<=318){operator="Movistar";}
    else if(prefix==319){operator="Virgin";}
    else if(prefix>=350 & prefix<=351){operator="Exito";}
    else if(prefix>=305 & prefix<=308){operator="Wom";}
    if(operator=="Claro"){omr_o_omv="Operador movil con red";}
    else if(operator=="Movistar"){omr_o_omv="Operador movil con red";}
    else if(operator=="Tigo"){omr_o_omv="Operador movil con red";}
    else if(operator=="Virgin"){omr_o_omv="Operador movil virtual";}
    else if(operator=="exito"){omr_o_omv="Operador movil virtual";}
    else{omr_o_omv="Operador Movil virtual";}
    if(operator=="Virgin"){Operator_infrastructure=" De Movistar.";}
    else if(operator=="Exito"){Operator_infrastructure=" De Tigo.";}
    else if(operator=="Wom"){Operator_infrastructure=" De Tigo, Claro y Movistar.";}
    else{Operator_infrastructure="Infraestructura propia.";}
    if(operator=="Claro"){assigned_prefix=" De 310 a 314 y 320 a 323";}
    else if(operator=="Tigo"){assigned_prefix=" De 300 a 304 y 324";}
    else if(operator=="Movistar"){assigned_prefix=" De 315 a 318";}
    else if(operator=="Virgin"){assigned_prefix=" Solo el 319";}
    else if(operator=="Exito"){assigned_prefix=" El 350 y el 351";}
    else{assigned_prefix=" Del 305 al 308";}

    screen.println("el numero de prefijo es: " + prefix +  
    "\nEl operador es: " + operator + "\n" + operator + " es un: " + omr_o_omv + 
    "\nDe quien es la infraestructura?: " + Operator_infrastructure + "\n Los prefijos asignados al operador son: " + assigned_prefix);
        
    }
    
}
