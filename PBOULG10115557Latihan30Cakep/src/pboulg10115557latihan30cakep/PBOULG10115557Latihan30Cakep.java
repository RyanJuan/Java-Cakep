/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan30cakep;

import java.util.Scanner;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 30
 */
public class PBOULG10115557Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner (System.in);
        
        System.out.println((char)27+ "[01;35mKamu " + (char)27 
                + "[01;32mngerjain sendiri" + (char)27 +
                "[01;33m latihan 17 sampe" + (char)27 +
                "[01;34m latihan 30 ini?");
        
        System.out.print((char)27+ "[01;34mJawab " + (char)27 
                + "[01;35m(Yoi/Enggak) : ");
    
        String Keterangan = baca.next();
        
        System.out.println("");
        if("Yoi".equals(Keterangan) || ("yoi".equals(Keterangan)))  {
            System.out.println((char)27+ "[01;31mCakep Bener, " + (char)27 
                + "[01;35mGoodJoob : ");
            
        }
        if("Enggak".equals(Keterangan) || ("ENGGAK".equals(Keterangan))) {
        {    
            System.out.println((char)27+"[01;31mTetep Cakep Sih");
            System.out.println((char)27+"[01;36mSing Penting Paham "
                    + "Konsep nya yee.");
            System.out.println("Keep the code works dude");     
       }           
     }    
   } 
 }
