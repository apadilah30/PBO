/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ContohParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematika mtk = new Matematika();
        
        int hasil = mtk.tambah(100, 20);
        System.out.println("Hasil tambah : "+hasil);
        
        hasil = mtk.kurang(100, 5);
        System.out.println("Hasil kurang : "+hasil);
        
        double bagi = mtk.bagi(100, 5);
        System.out.println("Hasil bagi : "+bagi);
    }
    
}
