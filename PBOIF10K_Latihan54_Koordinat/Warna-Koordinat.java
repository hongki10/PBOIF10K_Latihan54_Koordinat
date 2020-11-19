/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Koordinat
 */

 public class WarnaKoordinat extends Koordinat {
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.setNamaWarna(namaWarna);
    }
    
    public String getNamaWarna() {
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}