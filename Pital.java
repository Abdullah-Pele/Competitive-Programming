import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Abdullah Hussein
 */
 //  url: https://codeforces.com/problemset/problem/989/A
 
public class Pital {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = s.charAt(0);
        
        if(s.length()>1){
        for (int i = 1; i < s.length(); i++) {
            char c2 = s.charAt(i);
            if(c != c2 && c2 != '.' && c != '.'){
                if(i+1 < s.length()){
                    if(c2 != s.charAt(i+1) && c != s.charAt(i+1) && s.charAt(i+1) != '.'){
                        System.out.println("Yes");
                        System.exit(0);
                    }
                }
            }
            c = s.charAt(i);
        }
        }
        System.out.println("No");
    }
}
