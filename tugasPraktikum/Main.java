package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Praktikum - Interface
 */
public class Main {
    public static void main(String[] args){
        Keledai kedelai = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gulali = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa cingacing = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        
        kedelai.displayMakan();
        kedelai.displayBinatang();
        kedelai.displayData();
        
        System.out.println();
        
        gulali.displayMakan();
        gulali.displayBinatang();
        gulali.displayData();
        
        System.out.println();
        
        cingacing.displayMakan();
        cingacing.displayBinatang();
        cingacing.displayData();
    }
}