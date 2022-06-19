/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddingfile;
import database.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Raven
 */
final class Algorithm {
    
    private Algorithm(){};
    
    final static void replacingMahasiswa(String file, String backup){ 
    try {
      // Duplicate the backup file into "Current.txt file"
      Scanner myReader = new Scanner(new File(backup));
      try{FileWriter newFile = new FileWriter(new File(file+"\\data\\mahasiswa\\current.txt"), false);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        newFile.write(data+"\n");
      }
      myReader.close();
      newFile.close();
      }
      catch (IOException e){System.out.println("An error occurred.");}
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred (replacingMahasiswa).");
      e.printStackTrace();
    }}
    
    final static void replacingDosen(String file, String backup){ 
    try {
      // Duplicate the backup file into "Current.txt file"
      Scanner myReader = new Scanner(new File(backup));
      try{FileWriter newFile = new FileWriter(new File(file+"\\data\\dosen\\current.txt"), false);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        newFile.write(data+"\n");
      }
      myReader.close();
      newFile.close();
      }
      catch (IOException e){System.out.println("An error occurred.");}
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred (replacingDosen).");
      e.printStackTrace();
    }}
    
    
    
    final static void adding(Mahasiswa mahasiswa, String path){ 
      // Write to Database"
      try{FileWriter newFile = new FileWriter(new File(path+"\\data\\mahasiswa\\current.txt"), true);
      newFile.write(mahasiswa.view()+"\n");
      newFile.close();
      }
      catch (IOException e){System.out.println("An error occurred (adding).");}} 
    
    final static void adding(Dosen dosen, String path){ 
      // Write to Database"
      try{FileWriter newFile = new FileWriter(new File(path+"\\data\\dosen\\current.txt"), true);
      newFile.write(dosen.view()+"\n");
      newFile.close();
      }
      catch (IOException e){System.out.println("An error occurred (adding).");}} 
    
    
    
//    final static void duplicating(){   
//    try {
//      File myObj = new File("Menu\\Current Menu.txt");
//      Scanner myReader = new Scanner(myObj);
//      try{FileWriter newFile = new FileWriter("Menu\\proses.txt");
//      while (myReader.hasNextLine()) {
//        String data = myReader.nextLine();
//        newFile.write(data+"\n");
//      }
//      myReader.close();
//      newFile.close();
//      }
//      catch (IOException e){System.out.println("An error occurred.");}
//    } catch (FileNotFoundException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//    }
    
    
    
    
    //Fungsi backup name
    private static String bckup_name_file(String path){
        //Creating Time
         LocalDateTime currentLocalDateTime = LocalDateTime.now();
 
        // Create DateTimeFormatter instance with specified format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
 
        // Format LocalDateTime to String
        String formattedDateTime = currentLocalDateTime.format(dateTimeFormatter);
        int panjang = (new File(String.format(path))).listFiles().length;
 
        return String.format(" %1$s %2$s", (panjang), formattedDateTime);}
    
    final static void backupMahasiswa(String path){
        File filebaru = new File(String.format(path+"\\data\\mahasiswa\\backup%s.txt", bckup_name_file(path)));
        try{filebaru.createNewFile();
    }
        catch (IOException e){System.out.println("An error occurred (backupMahasiswa).");}
    try{
        Scanner myReader = new Scanner(new File(path+"\\data\\mahasiswa\\current.txt"));
        try{FileWriter newFile = new FileWriter(filebaru);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          newFile.write(data+"\n");
        }
        myReader.close();
        newFile.close();
        }catch (IOException e){System.out.println("An error occurred (backupMahasiswa).");}
    }
    catch (IOException e){System.out.println("An error occurred (backupMahasiswa).");}
    }
    
    final static void backupDosen(String path){
        File filebaru = new File(String.format(path+"\\data\\dosen\\backup%s.txt", bckup_name_file(path)));
        try{filebaru.createNewFile();
    }
        catch (IOException e){System.out.println("An error occurred (backupDosen).");}
    try{
        Scanner myReader = new Scanner(new File(path+"\\data\\dosen\\current.txt"));
        try{FileWriter newFile = new FileWriter(filebaru);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          newFile.write(data+"\n");
        }
        myReader.close();
        newFile.close();
        }catch (IOException e){System.out.println("An error occurred (backupDosen).");}
    }
    catch (IOException e){System.out.println("An error occurred (backupDosen).");}
    }
    
    final static void removeMahasiswa(int line, String path){
        try{
        FileWriter files = new FileWriter(path+"\\data\\mahasiswa\\proses.txt");
        Scanner myReader = new Scanner(new File(path+"\\data\\mahasiswa\\current.txt"));
        int i = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            files.write(data+"\n");
        }
        files.close();
        myReader.close();
        FileWriter files2 = new FileWriter(new File(path+"\\data\\mahasiswa\\current.txt"), false);
        Scanner myReader2 = new Scanner(new File(path+"\\data\\mahasiswa\\proses.txt"));
        while (myReader2.hasNextLine()) {
            String data2 = myReader2.nextLine();
            if (i != line){files2.write(data2+"\n");}
            i++;
        }
        files2.close();
        myReader2.close();
        (new File(path+"\\data\\mahasiswa\\proses.txt")).delete();
        }
        catch (IOException e){
         System.out.println("An error occurred. (removeMahasiswa)");
        }
    }
    
    final static void removeDosen(int line, String path){
        try{
        FileWriter files = new FileWriter(path+"\\data\\dosen\\proses.txt");
        Scanner myReader = new Scanner(new File(path+"\\data\\dosen\\current.txt"));
        int i = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            files.write(data+"\n");
        }
        files.close();
        myReader.close();
        FileWriter files2 = new FileWriter(new File(path+"\\data\\dosen\\current.txt"), false);
        Scanner myReader2 = new Scanner(new File(path+"\\data\\dosen\\proses.txt"));
        while (myReader2.hasNextLine()) {
            String data2 = myReader2.nextLine();
            if (i != line){files2.write(data2+"\n");}
            i++;
        }
        files2.close();
        myReader2.close();
        (new File(path+"\\data\\dosen\\proses.txt")).delete();
        }
        catch (IOException e){
         System.out.println("An error occurred (removeDosen).");
        }
    }
    
    
    final static void replace(Mahasiswa mahasiswa,int line, String path){
        try{
        FileWriter files = new FileWriter(path+"\\data\\mahasiswa\\proses.txt");
        Scanner myReader = new Scanner(new File(path+"\\data\\mahasiswa\\current.txt"));
        int i = 0;
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            files.write(data+"\n");
        }
        files.close();
        myReader.close();
        FileWriter files2 = new FileWriter(new File(path+"\\data\\mahasiswa\\current.txt"), false);
        Scanner myReader2 = new Scanner(new File(path+"\\data\\mahasiswa\\proses.txt"));
        while (myReader2.hasNextLine()){
            String data2 = myReader2.nextLine();
            if (i != line){files2.write(data2+"\n");}
            else{files2.write(mahasiswa.view()+"\n");}
            i++;
        }
        files2.close();
        myReader2.close();
        (new File(path+"\\data\\mahasiswa\\proses.txt")).delete();
        }
        catch (IOException e){
         System.out.println("An error occurred (replace).");
        }
    }
    
    final static void replace(Dosen dosen,int line, String path){
        try{
        FileWriter files = new FileWriter(path+"\\data\\dosen\\proses.txt");
        Scanner myReader = new Scanner(new File(path+"\\data\\dosen\\current.txt"));
        int i = 0;
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            files.write(data+"\n");
        }
        files.close();
        myReader.close();
        FileWriter files2 = new FileWriter(new File(path+"\\data\\dosen\\current.txt"), false);
        Scanner myReader2 = new Scanner(new File(path+"\\data\\dosen\\proses.txt"));
        while (myReader2.hasNextLine()){
            String data2 = myReader2.nextLine();
            if (i != line){files2.write(data2+"\n");}
            else{files2.write(dosen.view()+"\n");}
            i++;
        }
        files2.close();
        myReader2.close();
        (new File(path+"\\data\\dosen\\proses.txt")).delete();
        }
        catch (IOException e){
         System.out.println("An error occurred (replace).");
        }
    }
    
}