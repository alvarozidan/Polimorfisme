/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author HP
 */
public class Main1 {
    public static void main(String args[]){
        Pegawai p = new Pegawai();
        p = new Programmer(); //polimorfisme
        p = new Manajer();//polimorfisme
        
//        Manajer m = new Programmer(); 
        // tidak bisa karena programmer bukan subclass manajer
        
        Manajer m = new Manajer();
        m.gajiPokok = 10000;
        m.nama = "Sai";
        m.tunjangan = 5000;
        p = m; //polimorfisme
        p.tampilData();//VIRTUAL METHOD INVOCATION-VMI
        m.tampilData();//Bukan VMI, karena m bukan objek polimorfisme
    }
}
