/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Acer
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Array List Practice
//        ArrayList<String> array = new ArrayList<String>();
//
//        array.add("A");
//        array.add("B");
//        array.add("C");
//
//        for(String value: array){
//            System.out.println(value);
//        }
//
//        System.out.println("removing index 0.");
//        array.remove(0);
//
//        for(String value: array){
//            System.out.println(value);
//        }
//
//        System.out.println("updating index 0.");
//        array.set(0,"jeruk");
//
//        for(String value: array){
//            System.out.println(value);
//        }

//          HashSet Practice
//          HashSet<String> set = new HashSet<String>();
//
//          set.add("A");
//          set.add("A");
//          set.add("AB");
//
//          for(String value: set){
//              System.out.println(value);
//          }

//        HashMap Practice
//        HashMap<Integer,String> map = new HashMap<Integer,String>();
//
//        map.put(1, "A");
//        map.put(2, "B");
//        map.put(5, "C");

//        Treeset
//        TreeSet<String> set = new TreeSet<String>();
//
//        set.add("1");
//        set.add("10");
//        set.add("6");
//        set.add("23");
//        set.add("1");
//
//        for(String value:set){
//            System.out.println(value);
//        }

    HashSet<String> set = new HashSet<String>();
    set.add("Eko");
        set.add("Kurniawan");
        set.add("saeppani"); 
        set.add("Eko");
        set.add("Kurniawan");
        set.add("saeppani");
        set.add("Eko");
        set.add("Kurniawan");
        set.add("saeppani");

        for(String value : set){
           System.out.println(value);
        }

    }

}
