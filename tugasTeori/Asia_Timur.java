package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Teori - Interface
 */
public class Asia_Timur extends Negara implements INegara, IBudaya, IFisik{
    //String nama, sistemPemerintahan;
    
    Asia_Timur(String nama, String sistemPemerintahan){
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
        System.out.println("Orang Asia Timur memiliki budaya makan menggunakan sumpit.");
    }

    @Override
    public void menyetirMobil() {
        System.out.println("Orang Asia Tenggara menyetir mobil di sebelah kiri.");
    }
    
    @Override
    public void ciriMata() {
        System.out.println("Orang Asia Timur memiliki kelopak mata monolid.");
    }

    @Override
    public void warnaKulit() {
        System.out.println("Orang Asia Timur memiliki warna kulit kuning cerah.");
    }
}