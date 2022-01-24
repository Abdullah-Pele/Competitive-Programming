import java.util.ArrayList;
import java.util.Collection;
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

//https://codeforces.com/problemset/problem/63/A

public class SinkingShip {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> rats = new ArrayList<>();
        ArrayList<String> womchild = new ArrayList<>();
        ArrayList<String> man = new ArrayList<>();
        String cap = "";
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < x; i++) {
            String[] s = sc.nextLine().split(" ");
            if(s[1].startsWith("r"))
                rats.add(s[0]);
            else if(s[1].startsWith("w") || s[1].startsWith("ch"))
                womchild.add(s[0]);
            else if(s[1].startsWith("m"))
                man.add(s[0]);
            else
                cap = s[0];
        }
        
//        Collections.sort(womchild);
//        Collections.sort(rats);
//        Collections.sort(man);
//        
        for (String string : rats) {
            System.out.println(string);
        }
        for (String string : womchild) {
            System.out.println(string);
        }
        for (String string : man) {
            System.out.println(string);
        }
        System.out.println(cap);
    }
 
}
