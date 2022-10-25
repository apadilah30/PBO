/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ContohFungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        
        mtk.nilai1 = 100;
        mtk.nilai2 = 10;
        
        int hasil = mtk.tambah();
        
        System.out.println("Hasil tambah() = "+hasil);
        
        hasil = mtk.kurang();
        System.out.println("Hasil kurang() = "+hasil);
        
        hasil = mtk.kali();
        System.out.println("Hasil kali() = "+hasil);
        
        hasil = mtk.bagi();
        System.out.println("Hasil bagi() = "+hasil);
    }
    
}
