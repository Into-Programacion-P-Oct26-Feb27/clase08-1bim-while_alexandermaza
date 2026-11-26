/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejemplo063 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       boolean bandera = true;
       String pais;
       String capital;
       String reporte = "";
       
       while(bandera == true){
           System.out.println("Ingrese un pais");
           pais = entrada.nextLine();
           
           System.out.println("Ingrese una capital");
           capital = entrada.nextLine();
           
           reporte = String.format("%s%s\t%s\n",reporte,pais,capital);
           
           String salir;
           System.out.println("Desea salir del ciclo?, Ingrese si");
           salir = entrada.nextLine();
           if (salir.equals("si")){
               bandera = false;
               
           }
       }
       System.out.printf("%s\n",reporte);
    }
    
}
/*
Estamos haciendo un ciclo que no tiene fin, hasta que el usuario de forma 
manual pueda finalizar el ciclo.
*/
    

