package interfacelatihan;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum - Interface
 */
public class Mahasiswa implements ICumlaude{
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
        
    }

    @Override
    public void meraihIPKTinggi() {
        
    }
}