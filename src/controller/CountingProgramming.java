/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import function.Algorithm;
import function.Library;
import java.util.HashMap;
import view.Menu;

/**
 *
 * @author danhv
 */
public class CountingProgramming extends Menu<String> {
    static String[] searchChoice = {"1. Word Count", "2. Letter Count", "3. Exit"};
    protected Library lib;
    protected Algorithm al;
    protected String s;
    public CountingProgramming (String s) {
        super("SEARCHING PROGRAMME", searchChoice);
        lib = new Library();
        al = new Algorithm();
        this.s = s;
    }

    @Override
    public void execute(int n) {
        int x;
        switch (n) {
            case 1: 
                HashMap<String, Integer> word = al.wordCount(s);
                for (String w : word.keySet()) {
                    System.out.print(w + "=" + word.get(w) + " ");
                }
                System.out.println("");
                break;
            case 2: 
                HashMap<String, Integer> letter = al.letterCount(s);
                for (String l : letter.keySet()) {
                    
                    if (l.charAt(0)>= 97 && l.charAt(0)<=122) {
                        System.out.print(l + "=" + letter.get(l)+ " ");
                    }
                }
                System.out.println("");
                break;
            case 3: 
                System.exit(0);
        }
    }
}
