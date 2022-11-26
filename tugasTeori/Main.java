package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Teori - Interface
 */
public class Main {
    public static void main(String[] args){
        Asia_Tenggara a_tenggara = new Asia_Tenggara("Indonesia", "Presidensial");
        Asia_Timur a_timur = new Asia_Timur("Korea Selatan", "Presidensial Campuran");
        Western western = new Western("Amerika Serikat", "Republik Konstitusional Federal");
        
        System.out.println("=====||PROGRAM INTERFACE NEGARA||=====");
        a_tenggara.namaNegara();
        a_tenggara.menerapkanSistemPemerintahan();
        a_tenggara.caraMakan();
        a_tenggara.menyetirMobil();
        a_tenggara.ciriMata();
        a_tenggara.warnaKulit();
        System.out.println("---------------------------------------");
        a_timur.namaNegara();
        a_timur.menerapkanSistemPemerintahan();
        a_timur.caraMakan();
        a_timur.menyetirMobil();
        a_timur.ciriMata();
        a_timur.warnaKulit();        
        System.out.println("---------------------------------------");
        western.namaNegara();
        western.menerapkanSistemPemerintahan();
        western.caraMakan();
        western.menyetirMobil();
        western.ciriMata();
        western.warnaKulit();
        System.out.println("---------------------------------------");
    }
}