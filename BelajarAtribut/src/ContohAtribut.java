/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ContohAtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Orang budi = new Orang();
        budi.nama = "Budi";
        budi.alamat = "Bandung";
        budi.umur = 30;
        budi.menikah = false;
        
        Orang rina = new Orang();
        rina.nama = "Rina";
        rina.alamat = "Jakarta";
        rina.umur = 19;
        rina.menikah = false;
        
        System.out.println(budi.nama);
        System.out.println(rina.nama);
    }
    
}
