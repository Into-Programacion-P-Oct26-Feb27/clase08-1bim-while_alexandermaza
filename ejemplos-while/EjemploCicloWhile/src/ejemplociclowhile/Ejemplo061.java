/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       boolean bandera = true;
       
       while(bandera == true){
           System.out.println("Estoy en ciclo");
           
           int salir;
           System.out.println("Desea salir del ciclo?, Ingrese -100");
           salir = entrada.nextInt();
           if (salir == -100){
               bandera = false;
               
           }
       }
    }
    
}
/*
Estamos haciendo un ciclo que no tiene fin, hasta que el usuario de forma 
manual pueda finalizar el ciclo.
*/
    

