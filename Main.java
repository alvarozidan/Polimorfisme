/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String args[]){
        Pegawai p = new Pegawai();
        p = new Programmer(); //polimorfisme
        p = new Manajer();//polimorfisme
        
//        Manajer m = new Programmer(); 
        // tidak bisa karena programmer bukan subclass manajer
    }
}
