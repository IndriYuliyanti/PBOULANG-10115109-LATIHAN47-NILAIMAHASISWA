/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan47.nilaimahasiswa;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 menghitung gradee nilai mahasiswa
 */
public class Pboulang10115109Latihan47Nilaimahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilai1 = new Nilai(81,75,68);
        
        double na = nilai1.hitungnilaiakhir();
        String index = nilai1.getIndex(na);
        String keterangan = nilai1.getketerangan(index);
        
         System.out.println("QUIS \t\t: "+nilai1.getQuis());
        System.out.println("UTS \t\t: "+nilai1.getUts());
        System.out.println("UAS \t\t: "+nilai1.getUas()+"\n");
        System.out.println("NILAI AKHIR \t\t: "+nilai1.getNa()+"\n");
        System.out.println("Index \t\t: "+index);
        System.out.println("Keterangan \t: "+keterangan+"\n");
    }
    
}
