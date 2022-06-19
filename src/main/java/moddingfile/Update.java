/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddingfile;
import pathing.*;
import database.*;
/**
 *
 * @author Raven
 */
public final class Update {
    
    private Update(){};
    
    public final static void add(Mahasiswa mahasiswa){
        Algorithm.adding(mahasiswa, Path.path);
    }
    public final static void add(Dosen dosen){
        Algorithm.adding(dosen, Path.path);
    }
    public final static void removeMahasiswa(int line){
        Algorithm.removeMahasiswa(line,Path.path);
    }
    public final static void removeDosen(int line){
        Algorithm.removeDosen(line,Path.path);
    }
    public final static void replaceMahasiswa(int NIM,String nama, String tanggal ,int line){
        Mahasiswa mahasiswa = new Mahasiswa(NIM,nama,tanggal);
        Algorithm.replace(mahasiswa,line, Path.path);
    }
    public final static void replaceDosen(int NIP,String nama, String tanggal,int line){
        Dosen dosen = new Dosen(NIP,nama,tanggal);
        Algorithm.replace(dosen,line, Path.path);
    }

}