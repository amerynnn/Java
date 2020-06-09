/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Scanner;
/**
 *
 * @author BianA
 */
public class Dekrip {
    public static void main(String[] args){
        
        Menu input3 = new Menu();
        Menu input4 = new Menu();
        Menu varx = new Menu();
       
        Scanner sc = new Scanner(System.in);
        String ciphertext; int shift;
        ciphertext = input3.jtinput.getText();
        shift =  Integer.parseInt(jtangka.getText());
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)  
        {
            char alphabet = ciphertext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet - shift);
            
                if(alphabet < 'a') {
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }    
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char) (alphabet - shift);
                
                if (alphabet < 'A') {
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;            
            }
            else 
            {
             decryptMessage = decryptMessage + alphabet;            
            } 
        }
}
}

