/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;
import java.util.Scanner;
/**
 *
 * @author revanth
 */
public class StringReverse {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String text;
        text = scan.nextLine();
        StringBuilder text1=new StringBuilder();
        text1.append(text);
        for(int i=text1.length()-1;i>=0;i--){
            System.out.print(text1.charAt(i));
        }
        
    }
        
        
        
    
             }
