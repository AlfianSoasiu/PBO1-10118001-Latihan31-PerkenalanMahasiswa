/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Memanggil subclass perkenalan mahasiswa
 */
public class perkenalanmhs {
      public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("1011");
        mhs1.setNama("Fian");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("1012");
        mhs2.setNama("Borut");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("1013");
        mhs3.setNama("Agil");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("1014");
        mhs4.setNama("Gbrand");
        mhs4.perkenalkanDiri();
    }
    
}
