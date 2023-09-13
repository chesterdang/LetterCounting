/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author danhv
 */
public class Algorithm {
    public HashMap<String, Integer> wordCount (String s ) {
        HashMap<String, Integer> word = new HashMap<>();
        StringTokenizer tk = new StringTokenizer(s,",.()");
        
        while (tk.hasMoreElements()){
            String token = tk.nextToken();
            if (word.containsKey(token)) {
                word.put(token, word.get(token)+1);
            }  else {
                word.put(token, 1);
            }
        }
        return word;
    }
    
    public HashMap<String, Integer> letterCount (String s) {
        HashMap<String, Integer> letter = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (letter.containsKey( s.charAt(i)+"")) {
                letter.put(s.charAt(i)+"", letter.get(s.charAt(i)+"")+1);
            }  else {
                letter.put(s.charAt(i)+"", 1);
            }
        }
        return letter;
    }
}

