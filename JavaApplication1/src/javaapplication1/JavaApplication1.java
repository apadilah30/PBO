/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String nama = JOptionPane.showInputDialog(null,"Masukkan nama Anda :","Input nama",JOptionPane.QUESTION_MESSAGE);
//        
//        String tahun_string = JOptionPane.showInputDialog(null,"Masukkan tahun sekarang :","Tahun sekarang",JOptionPane.QUESTION_MESSAGE);
//        
//        int tahun = Integer.parseInt(tahun_string);
//        
//        String tahun_lahir_string = JOptionPane.showInputDialog(null,"Masukan tahun lahir :","Tahun kelahiran",JOptionPane.QUESTION_MESSAGE);
//        
//        int tahun_lahir = Integer.parseInt(tahun_lahir_string);
//        
//        int hasil = tahun - tahun_lahir;
//        
//        JOptionPane.showMessageDialog(null, nama+" usia Anda sekarang adalah "+hasil+" tahun","USIA ANDA",JOptionPane.INFORMATION_MESSAGE);
        uts();
    }
    
    public static void uts(){
        String nilai_gram_string = JOptionPane.showInputDialog(null, "Masukkan nilai gram yang akan dikonversi: ","Input nilai",JOptionPane.QUESTION_MESSAGE);
        int nilai_gram = Integer.parseInt(nilai_gram_string);
        // Perulangan Pertama
        String mg_string = "";
        String cg_string = "";
        String dg_string = "";
        int nilai_kali_turun = 1;
        for(int i = 0;i <= 3;i++){
            switch (i) {
                case 1:
                    int dg = nilai_gram * nilai_kali_turun;
                    dg_string = Integer.toString(dg) + " dg";
                    break;
                case 2:
                    int cg = nilai_gram * nilai_kali_turun;
                    cg_string = Integer.toString(cg) + " cg";
                    break;
                case 3:
                    int mg = nilai_gram * nilai_kali_turun;
                    mg_string = Integer.toString(mg) + " mg";
                    break;
                default:
                    break;
            }
            nilai_kali_turun *= 10;
        }
        String dag_string = "";
        String hg_string = "";
        String kg_string = "";
        float nilai_kali_naik = 1;
        for(int i = 0;i <= 3;i++){
            switch (i) {
                case 1:
                    float dag = nilai_gram / nilai_kali_naik;
                    dag_string = Float.toString(dag) + " dag";
                    break;
                case 2:
                    float hg = nilai_gram / nilai_kali_naik;
                    hg_string = Float.toString(hg) + " hg";
                    System.out.print(nilai_kali_naik);
                    break;
                case 3:
                    float kg = nilai_gram / nilai_kali_naik;
                    kg_string = Float.toString(kg) + " kg";
                    break;
                default:
                    break;
            }
            nilai_kali_naik *= 10;
        }
        
        JOptionPane.showMessageDialog(null, 
                "Berikut adalah nilai konversi dari "+nilai_gram+" gram \n"+
                nilai_gram+" gram = "+mg_string+"\n"+
                nilai_gram+" gram = "+cg_string+"\n"+
                nilai_gram+" gram = "+dg_string+"\n"+
                nilai_gram+" gram = "+dag_string+"\n"+
                nilai_gram+" gram = "+hg_string+"\n"+
                nilai_gram+" gram = "+kg_string+"\n",
                "HASIL KONVERSI",
        JOptionPane.INFORMATION_MESSAGE);
    }
    
}
