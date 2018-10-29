/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan61.livingthings;

/*
Nama : Cessario Sheva Lakita P.A
Nim : 101107063
Kelas : IF-2
Deskripsi Program : Menampilkan data diri
 */
public class Human extends LivingThing{
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan");
    }
    
}
