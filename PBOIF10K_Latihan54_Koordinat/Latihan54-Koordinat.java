/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Koordinat
 */

public class Latihan54Koordinat {

    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat.getX() 
                + ", y : " + warnaKoordinat.getY());
    }
    
}