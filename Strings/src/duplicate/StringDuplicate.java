/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicate;
import java.util.Scanner;
/**
 *
 * @author revanth
 */
public class StringDuplicate {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String text;
        int cnt=0;
        text=scan.nextLine();
        char[] text1=text.toCharArray();
        for(int i=0;i<=text.length()-1;i++){
            for(int j=i+1;j<=text.length()-1;j++){
                if(text1[i]==text1[j]){
                    System.out.println(text1[j]);
                    cnt++;
                    break;
                }
               
                    
                }
            } System.out.println(cnt);
        }
        
        
        
        
    }
    

