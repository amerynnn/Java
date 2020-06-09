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
public class Enkrip {
        public static void main(String[] args){

        Menu input3 = new Menu();
        Menu input4 = new Menu();
        Menu varx = new Menu();
        
        Scanner sc = new Scanner(System.in);
        String plaintext = input3.jtinput.getText();
        int shift =  Integer.parseInt(jtangka.getText());
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
            alphabet = plaintext.charAt(i);
            
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             alphabet = (char) (alphabet + shift);
             if(alphabet > 'z') {
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             alphabet = (char) (alphabet + shift);    
                
             if(alphabet > 'Z') {
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }


}
}
