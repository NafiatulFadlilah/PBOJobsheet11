package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Praktikum - Interface
 */
public class Singa extends Binatang implements IKarnivora{
    private String suara, warnaBulu;
    
    Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan(){
        System.out.println("Jenis: Karnivora");
        System.out.println("Makanan: Daging");
    }
    
    @Override
    public void displayBinatang(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("Jumlah Kaki: " + super.getKaki());
    }
    
    void displayData(){
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " +  this.warnaBulu);
    }
}