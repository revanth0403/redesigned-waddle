/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.Count;
import java.util.Scanner;

/**
 *
 * @author revanth
 */
public class CountVowels {
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        String text=t.nextLine();
        int count=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        
        System.out.println(count);
        
    }
    
}
