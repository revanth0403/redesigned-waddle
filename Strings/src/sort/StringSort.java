/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
import java.lang.String;
import java.io.*;
import java.util.*;

 /**
 *
 * @author revanth
 */
public class StringSort {
    public static void main(String[] args){
        char temp;
        Scanner scan=new Scanner(System.in);
        String text;
        text=scan.nextLine();
        
        char[] text1=text.toCharArray();
        for(int i=0;i<(text1.length-1);i++){
            for(int j=i+1;j>0;j--){
                  if(text1[j]<text1[j-1]){
                 temp=text1[j-1];
                text1[j-1]=text1[j];
                text1[j]=temp;
            }
            }
         text=String.valueOf(text1);
        }  System.out.println(text);
           
    }}