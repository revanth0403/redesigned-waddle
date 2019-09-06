/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.Rotation;

/**
 *
 * @author revanth
 */
public class StrinRotation {
    public static void main(String args[]){
        
     String a="revanthchakri";
    String b="chakrirevanth";
    if(a.length() != b.length()) {
            System.out.println("s2 is not rotated version of s1");
        
        }else {
            String s3 = a + a;
            if(s3.contains(b)) {
                System.out.println("s2 is a rotated version of s1");
            } else {
                System.out.println("s2 is not rotated version of s1");
            }
        }

    
    
}}
