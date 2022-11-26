package interfacelatihan;
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;
/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum - Interface
 */
public class interfacemain {
    public static void main(String[] args){
        Rektor pakrektor = new Rektor();
        
        //Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        //sarjanaCumlaude.kuliahDiKampus();
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}