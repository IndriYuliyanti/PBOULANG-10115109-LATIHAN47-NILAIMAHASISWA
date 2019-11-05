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
public class Nilai {
    private double quis;
    private double uts;
    private double uas;
    private double na;
    private String index;
    private String keterangan;
    
    public Nilai(){
    }

    public double getQuis() {
        return quis;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public double getNa() {
        return na;
    }

    public String getIndex() {
        return index;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public Nilai(double quis, double uts, double uas){
        this.quis = quis ;
        this.uts = uts ;
        this.uas = uas ;
        
    }
    
    public double hitungnilaiakhir(){
        na = (0.2*quis)+(0.3*uts)+(0.5*uas);
        return na;
    }
    
    public String getIndex(double na){
        if (na > 80 ){
            index = "A";
        }
            else
            if (na > 68){
                index = "B";
            }
        
            else
            if (na > 56){
                index = "C";
            }
        else
            if (na > 45){
                index = "D";
            }
        else
             index = "E";
        return index;
            }
        
    public String getketerangan(String index){
        switch (index){
            case "A" : keterangan = " SANGAT BAIK ";
                break;
            case "B" : keterangan = "  BAIK";
                break;
                
            case "C" : keterangan = " CUKUP  ";
                break;
            
            case "D" : keterangan = "KURANG ";
                break;
                
            case "E" : keterangan = " SANGAT KURANG ";
                break;
                
            default: keterangan = "cek nilai";
        }
        return keterangan;
                
               
        }
    }
            
            

