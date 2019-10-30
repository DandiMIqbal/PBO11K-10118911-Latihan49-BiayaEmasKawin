/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118911.latihan49.biayaemaskawin;

/**
 *
 * @author Dandi M Iqbal
 * Nama : Dandi Muhammad Iqbal 
 * Kelas : IF-11K
 * Nim : 10118911
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya emas
 * kawin
 */
public class PBO11K10118911Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beli bli = new Beli();
        bli.setEmasKawin(15.7);
        bli.setHargaSatuGram(570000);
        
        System.out.println("Hendri membeli emas kawin : " + bli.getEmasKawin() + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " + bli.getHargaSatuGram());
        System.out.println();
        
        double emas_kawin = bli.getEmasKawin();
        double harga_satu_gram = bli.getHargaSatuGram();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " + bli.hitungTotalPembayaran(emas_kawin, harga_satu_gram));
    }   
    
}
