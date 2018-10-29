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
public class PBO210117063Latihan61LivingThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human hu= new Human();
        hu.setNama("Rizki Adam Kurniawan");
        hu.walk(hu.getNama());       
        hu.breath("Rizki Adam Kurniawan");
        hu.eat("Rizki Adam Kurniawan");
    }
    
}
