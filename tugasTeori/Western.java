package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Teori - Interface
 */
public class Western extends Negara implements INegara, IBudaya, IFisik{
    //String nama, sistemPemerintahan;
    
    Western(String nama, String sistemPemerintahan){
        super(nama, sistemPemerintahan);
    }

    @Override
    public void namaNegara() {
        System.out.println("Nama Negara: " + this.nama);
    }

    @Override
    public void menerapkanSistemPemerintahan() {
        System.out.println("Sistem Pemerintahan: " + this.sistemPemerintahan);
    }

    @Override
    public void caraMakan() {
        System.out.println("Orang Barat memiliki budaya makan menggunakan garpu.");
    }

    @Override
    public void menyetirMobil() {
        System.out.println("Orang Barat menyetir mobil di sebelah kiri.");
    }
    
    @Override
    public void ciriMata() {
        System.out.println("Orang Western memiliki warna kornea mata beragam.");
    }

    @Override
    public void warnaKulit() {
        System.out.println("Orang Asia Tenggara memiliki warna kulit putih pucat.");
    }
}