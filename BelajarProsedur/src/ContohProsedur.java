/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ContohProsedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia budi = new Manusia();
        budi.nama = "Budi Nugrah";
        budi.jenisKelamin = "Laki-Laki";
        budi.alamat = "Subang";
        
        Manusia tina = new Manusia();
        tina.nama = "Tina Sumarna";
        tina.jenisKelamin = "Perempuan";
        tina.alamat = "Sumedang";
        
        budi.tampilInformasi();
        tina.tampilInformasi();
    }
    
}
