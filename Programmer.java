/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author HP
 */
public class Programmer extends Pegawai {
    public int bonus;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("BONUS : "+bonus);
    }
    
}
