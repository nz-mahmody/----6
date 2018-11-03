/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner d=new Scanner (System.in);
        int a=d.nextInt();
        int b=d.nextInt();
        int c=d.nextInt();
        if((a*a)==(b*b)+(c*c)||(b*b)==(a*a)+(c*c)||(c*c)==(a*a)+(b*b))
            System.out.print("yes");
        else
            System.out.print("no");
    }
    
}
