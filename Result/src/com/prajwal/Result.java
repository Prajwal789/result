/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prajwal;

/**
 *
 * @author prazwal
 */
public class Result {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sc=35, eng=55, nep=45, comp=75, opt=70 ;
       
        int total  = sc+eng+comp+nep+opt ;
        
        
     if (sc<32||comp<32||eng<32||opt<32||nep<32){
         System.out.println("Sorry yoou are fail");
       }
     else{
        double percentage = total/5;
         
                 
     }
     
        
    
    }
}
