package interfacelatihan;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum - Interface
 */
public class MultipleInterfaceMain {
    public static void main(String[] args){
        Rektor pakrektor = new Rektor();
        
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatMawapres(sarjanaCum);
        pakrektor.beriSertifikatMawapres(masterCum);
    }
}