
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika rifki = new Matematika (8,0);
        
        System.out.println("Hasil Penjumlahan: "+rifki.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+rifki.setPengurangan());
        System.out.println("Hasil Perkalian: "+rifki.setPerkalian());
        System.out.println("Hasil Pembagian: "+rifki.setPembagian());
        
        
    }
}
