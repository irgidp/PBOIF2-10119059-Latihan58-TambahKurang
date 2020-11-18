/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan hasil tambah kurang
 */
package pboif2.pkg10119059.latihan58.tambahkurang;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan58TambahKurang {

    public static void main(String[] args) {
        JumlahBilangan jmlBil = new JumlahBilangan();
        SelisihBilangan selBil = new SelisihBilangan();
        
        System.out.print("Hasil perjumlahan = "); jmlBil.tampilHasilJumlah();
        System.out.print("Hasil Selisih " + jmlBil.getX() + " - " + jmlBil.getY()+ " : "); selBil.tampilSelisih();
    }
    
}
