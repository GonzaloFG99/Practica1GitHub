/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5string7;
import java.util.*;
/**
 *
 * @author admin
 */
public class T5String7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        String caracter;
        char continuar;
        int cont=0;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("Anota un carácter");
            caracter=sc.nextLine();
            System.out.println("Anota una palabra o cadena de carácteres.");
            cadena=sc.nextLine();
            cont = contCaracter(cadena, caracter, cont);
            System.out.println("El carácter "+caracter+" aparece "+cont+ " vez/veces en la cadena");
            System.out.println("¿Quiere usted continuar? S o N.");
            continuar=sc.nextLine().charAt(0);
            if(continuar!='S' && continuar!='s' && continuar!='N' && continuar !='n'){
                System.out.println("Error, no se puede proseguir con el proceso.");
            }
        }while(continuar!='N' && continuar !='n' && continuar=='S' || continuar=='s');
    }

    public static int contCaracter(String cadena, String caracter, int cont) {
        for (int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==caracter.charAt(0)){
                cont++;
            }
        }
        return cont;
    }
    
}
