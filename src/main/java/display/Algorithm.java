/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package display;

import database.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Raven
 */
final class Algorithm {
    
    private Algorithm(){};
    
    public final static ArrayList<Mahasiswa> importingFileMahasiswa(String path){
        ArrayList<Mahasiswa> ugm = new ArrayList<>();
        try {
        Scanner myReader = new Scanner(new File(path + "\\data\\mahasiswa\\current.txt"));
        while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arraySTR = data.split("_");
        ugm.add(new Mahasiswa(Integer.parseInt(arraySTR[0]),arraySTR[1],arraySTR[2]));
      }
      myReader.close();
      }
      catch (IOException e){System.out.println("An error occurred (importingFileMahasiswa).");}
    return ugm;}
    
    public final static ArrayList<Dosen> importingFileDosen(String path){
        ArrayList<Dosen> ugm = new ArrayList<>();
        try {
        Scanner myReader = new Scanner(new File(path + "\\data\\dosen\\current.txt"));
        while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arraySTR = data.split("_");
        ugm.add(new Dosen(Integer.parseInt(arraySTR[0]),arraySTR[1],arraySTR[2]));
      }
      myReader.close();
      }
      catch (IOException e){System.out.println("An error occurred. (importingFileDosen)");}
    return ugm;}
    
}