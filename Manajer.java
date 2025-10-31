/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author HP
 */
public class Manajer extends Pegawai{
    public int tunjangan;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("TUNJANGAN : "+tunjangan);
    }
    
}
