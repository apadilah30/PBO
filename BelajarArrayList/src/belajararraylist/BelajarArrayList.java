/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajararraylist;

import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class BelajarArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] data = new String[5];
        int i;
        
        String nama, key;
        boolean gotcha;
        
        for(i = 0;i < data.length; i++){
            nama = JOptionPane.showInputDialog("Masukkan huruf/kata ke-"+(i+1));
            data[i] = nama;
        }
        
        System.out.print("Huruf yang dimasukkan {");
        
        for(i = 0;i < data.length; i++){
            System.out.print(data[i]+", ");
        }
        System.out.println("}");
        
        key = JOptionPane.showInputDialog("Masukkan huruf/kata yang ingin dicari : ");
        
        System.out.println("Huruf/kata yang dicari : "+key);
        
        gotcha = false;
        
        for(i = 0;i < data.length; i++){
            if(data[i].equals(key)){
                gotcha = true;
                break;
            }
        }
        
        if(gotcha){
            System.out.println("Huruf/kata ditemukan di urutan ke-"+(i+1));
        } else {
            System.out.println("Huruf/kata tidak ditemukan");
        }
    }
    
}
