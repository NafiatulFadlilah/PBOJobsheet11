package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Praktikum - Interface
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara, warnaBulu;
    
    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora + Herbivora");
        System.out.println("Daging + Tumbuhan");
    }
    
    @Override
    public void displayBinatang(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("Jumlah Kaki: " + super.getKaki());
    }
    
    public void displayData(){
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}