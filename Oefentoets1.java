/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oefentoets1;
import java.util.*;
/**
 *
 * @author jor
 */
public class Oefentoets1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        //read plof
        int plof = 1;   
        while (plof <2 || plof > 9){
          System.out.print("Wat is het \"Plof\" getal (2..9) ? ");
          plof = stdin.nextInt();  
          if (plof <2 || plof >9){
              System.out.println("het getal moet tussen de 2 en de 9 liggen");
          }
          }
        
          //read the max amount
          System.out.print("Tot welk getal moet ik tellen? ");
          int max= stdin.nextInt();
          
          //count till max and see if counter is deviable by plof
          int counter = 1;
          while (counter <= max){
              if (counter % plof == 0){
                  System.out.print("plof ");
              }
              else {System.out.print("" + counter + " ");
              }
              counter ++;
          }
      }
    }
      
    
    
