package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Praktikum - Interface
 */
public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    
    Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return nama;
    }
    
    void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }
    
    int getKaki(){
        return jmlKaki;
    }
    
    public abstract void displayBinatang();
}