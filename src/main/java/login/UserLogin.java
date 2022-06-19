/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import java.io.*;
import java.util.Scanner;
import pathing.*;

/**
 *
 * @author Raven
 */
public final class UserLogin {
    
    private UserLogin(){};
    
    public final static boolean login(String password){
        boolean jawaban = false;
        try{
        Scanner Reader = new Scanner(new File(Path.path+"\\user\\user.txt"));
        String user = Reader.nextLine();
        Reader.close();
        jawaban = Algorithm.logProcess(user, password, Path.path);
        }
        catch(FileNotFoundException e){
        System.out.println("An error occurred.");
    }
        return jawaban;
    }
    
    public final static boolean login(String user, String password){
        return Algorithm.logProcess(user, password, Path.path);
    }

    public final static void changePW(String password){
        Algorithm.pwChange(password, Path.path);
    }
}