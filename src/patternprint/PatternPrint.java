/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternprint;

import java.util.Scanner;

/**
 *
 * @author janna_xing
 */
public class PatternPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
