package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Teori - Interface
 */
public class Asia_Tenggara extends Negara implements INegara, IBudaya, IFisik{
    //String nama, sistemPemerintahan;
    
    Asia_Tenggara(String nama, String sistemPemerintahan){
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
        System.out.println("Orang Asia Tenggara memiliki budaya makan menggunakan tangan.");
    }

    @Override
    public void menyetirMobil() {
        System.out.println("Orang Asia Tenggara menyetir mobil di sebelah kanan.");
    }

    @Override
    public void ciriMata() {
        System.out.println("Orang Asia Tenggara memiliki kelopak mata ganda.");
    }

    @Override
    public void warnaKulit() {
        System.out.println("Orang Asia Tenggara memiliki warna kulit sawo matang.");
    }
}