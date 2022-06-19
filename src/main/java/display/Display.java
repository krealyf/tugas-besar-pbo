/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package display;
import pathing.Path;
import java.util.*;
import database.*;
/**
 *
 * @author Raven
 */
public final class Display {
    
    private Display(){};
    //Method otomatis harus terpanggil untuk membuat arraylist
    // path penuh hingga current.txt
    
    public final static ArrayList<Mahasiswa> importingFile1(){
        return Algorithm.importingFileMahasiswa(Path.path);}
    
    public final static ArrayList<Dosen> importingFile2(){
        return Algorithm.importingFileDosen(Path.path);
    
    }
}