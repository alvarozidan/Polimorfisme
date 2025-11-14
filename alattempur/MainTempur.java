/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alattempur;

/**
 *
 * @author HP
 */
public class MainTempur {
    public static void main(String args[]){
        AlatTempur at = new AlatTempur();
        Tank t = new Tank();
        Kapal k = new Kapal();
        Pesawat p = new Pesawat();
        at = t;
        
        t.nama = "GARUDA INDONESIA/001";
        t.jenis = "TANK";
        t.jumlahPeluru = 50;
        t.tipeKendaraan = "KENDARAAN BERAT/DARAT";
        t.tipePeluru = "PELEDAK 100mm";
        t.area = "HUTAN/AREA DARATAN LUAS";
        t.personil = 5;
        
        k.nama = "USS GERALD R. FORD";
        k.jenis = "KAPAL PERANG";
        k.jumlahPeluru = 999;
        k.tipeKendaraan = "KENDARAAN BERAT/LAUT";
        k.tipePeluru = "kaliber 50mm";
        k.armada = 10;
        
        
        p.nama = "Lockheed Martin F-35 Lighting II";
        p.jenis = "PESAWAT TEMPUR";
        p.jumlahPeluru = 999;
        p.tipeKendaraan = "KENDARAAN BERAT/UDARA";
        p.tipePeluru = "kaliber 50mm";
        p.rudal = 4;
        
        AlatTempur[] arrAT = new AlatTempur[3];
        arrAT[0] = t; 
        arrAT[1] = k; 
        arrAT[2] = p;
        
        System.out.println("=====================================================");
        arrAT[0].info();
        System.out.println("-----------------------------------------------------");
        arrAT[1].info();
        System.out.println("-----------------------------------------------------");
        arrAT[2].info();
        System.out.println("=====================================================");
        
        dayaTempur(t);
        dayaTempur(k);
        dayaTempur(p);
    }
    
    public static void dayaTempur(AlatTempur at){
        if(at instanceof Tank){
            Tank T = (Tank) at;
            int total = T.personil * T.jumlahPeluru;
            System.out.println("Total Daya Tempur Tank : "+total);
        }else if(at instanceof Kapal){
            Kapal K = (Kapal) at;
            int total = K.armada * K.jumlahPeluru;
            System.out.println("Total Daya Tempur Kapal : "+total);
        }else if(at instanceof Pesawat){
            Pesawat P = (Pesawat) at;
            int total = P.jumlahPeluru * P.rudal;
            System.out.println("Total Daya Tempur Pesawat : "+total);
        }else{
            System.out.println("Tidak ditemukan apa apa 🤣🤣🤣");
        }
    }
}
