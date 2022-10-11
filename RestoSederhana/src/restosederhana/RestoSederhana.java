/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restosederhana;

import javax.swing.JOptionPane;


/**
 *
 * @author Acer
 */
public class RestoSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jum=0, i=0;
        double total_bayar=0;
        int [] kode = new int[5];
        int [] qty = new int[5];
        double [] harga = new double[5];
        double [] sub_total = new double[5];
        String [] makanan = new String[5];
        
        System.out.println("KASIR RESTORAN SUNDA");
        System.out.println("====================");
        System.out.println("Menu :");
        System.out.println("Kode\tNama\t\tHarga");
        System.out.println("1\tNasi Putih\tRp 5,000");
        System.out.println("2\tAyam Serundeng\tRp 8,000");
        System.out.println("3\tBakar Gurame\tRp 15,000");
        System.out.println("4\tPecel Lele\tRp 12,000");
        System.out.println("5\tTahu/Tempe\tRp 2,000");
        int stop = 0;
        do {
            i++;
            kode[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan kode makanan :"));
            qty[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan jumlah yang dipesan :"));
            switch (kode[i]){
                case 1 : 
                          makanan[i]="Nasi Putih";
                          harga[i]  =5000;
                          break;
                case 2 : 
                          makanan[i]="Ayam Serundeng";
                          harga[i]  =8000;
                          break;
                case 3 : 
                          makanan[i]="Bakar Gurame";
                          harga[i]  =15000;
                          break;
                case 4 : 
                          makanan[i]="Pecel Lele";
                          harga[i]  =12000;
                          break;
                case 5 : 
                          makanan[i]="Tahu/Tempe";
                          harga[i]  =2000;
                          break;
                default : 
                          JOptionPane.showMessageDialog(null, "Makanan tidak tersedia");
            }
            stop = JOptionPane.showConfirmDialog(null,"Apakah anda ingin memesan lagi?");
            switch(stop){
                case JOptionPane.YES_OPTION:
                    stop = 0;
                    break;
                case JOptionPane.NO_OPTION:
                    stop = 1;
                    break;
                default:
                    stop = 1;
                    break;
            }
        }
        while (stop == 0);
        System.out.println("===============");
        System.out.println("Rekapitulasi Pesanan");
        System.out.println("Kode\tNama\t\tHarga\tJumlah\tSub Total");
        for(int j = 1; j <= i; j++){
             sub_total[j]   = qty[j]*harga[j];
             total_bayar    += sub_total[j];
             System.out.println(j+"\t"+makanan[j]+"\t"+harga[j]+"\t"+qty[j]+"\t"+sub_total[j]); 
        }
        
        System.out.println("Total tagihan Anda : Rp "+total_bayar);
        
//        Hitung Kembalian
        int kembalian = 0;
        int uang_masuk = 0;
        
        uang_masuk = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan uang pelanggan : "));
        
        if(uang_masuk >= total_bayar){
            System.out.println("Kembalian : Rp "+(uang_masuk-total_bayar));
        } else {
            System.out.println("Pastikan uang tidak kurang!");
        }
    }
    
}
