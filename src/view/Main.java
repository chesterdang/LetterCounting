/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.CountingProgramming;
import function.Library;

/**
 *
 * @author danhv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library lib = new Library();
        String s = lib.getString("Enter sentence: ");
        s.toLowerCase();
        new CountingProgramming(s).run();
        
    }
    
}
