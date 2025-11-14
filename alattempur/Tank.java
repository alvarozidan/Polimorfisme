/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alattempur;

/**
 *
 * @author HP
 */
public class Tank extends AlatTempur {
    public int personil;
    public String area;
    
    public  void info(){
        super.info();
        System.out.println("Jumlah personil di dalam Tank : "+personil);
        System.out.println("Medan area tempur Tank : "+area);
    }
}
