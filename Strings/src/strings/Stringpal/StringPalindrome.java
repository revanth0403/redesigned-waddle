/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.Stringpal;
import java.util.Scanner;

/**
 *
 * @author revanth
 */
public class StringPalindrome {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String text=scan.nextLine();
        for(int i=0,j=text.length()-1;i<=j;i++,j--){
        if(text.charAt(i)!=text.charAt(j)){
            System.out.println("not a palindrome");
            return;
        }
        System.out.println("its a palindrome");
        return;
    }
    }
    
}
