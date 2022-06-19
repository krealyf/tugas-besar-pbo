/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Raven
 */
final class Algorithm {
    
    private Algorithm(){};
    
    final static boolean logProcess(String user, String password, String path){
    try{
        Scanner Reader = new Scanner(new File(path+"\\user\\user.txt"));
        String username = Reader.nextLine();
        String pw = Reader.nextLine();
        if (user.equals(username)){
            return (pwCheck(password, pw, path));
        }
        else{return false;}
    }
    catch(FileNotFoundException e){
    System.out.println("An error occurred.");
}
    return false;}
    


    
    final static boolean pwCheck(String password, String pw, String path){
    try{
        int code1 = Integer.parseInt((new Scanner(new File(path+"\\user\\enc\\code.txt"))).nextLine());
        int code2 = Integer.parseInt((new Scanner(new File(path+"\\user\\enc\\code\\code.txt"))).nextLine());
        if (password.length() != pw.length()){return false;}
        for (int i = 0; i< password.length();i++){
        if(!(((int) password.charAt(i)+((code1+code2)*Math.pow(-1, i))) == ((int) pw.charAt(i)))){
        return false;}
        else if (i==password.length()-1){return true;}}
    }
    catch(FileNotFoundException e){
    System.out.println("An error occurred.");
    return false;}
    return false;}
    
    
    private static int codeGenerate(){
        Random rn = new Random();
        int bound = 10;
        int code = rn.nextInt(bound);
        return code;
    }
       
    
    final static void pwChange(String password, String path){
        try {
            //Making the encryption
            int code1 = codeGenerate();
            System.out.println(6);
            int code2 = codeGenerate();
            System.out.println(4);
            try (FileWriter code_1 = new FileWriter(new File(path+"\\user\\enc\\code.txt"), false)) {
                String node1 = (code1+"").replaceAll("\\s", "");
                code_1.write(node1);
            }
            try (FileWriter code_2 = new FileWriter(new File(path+"\\user\\enc\\code\\code.txt"), false)) {
                String node2 = (code2+"").replaceAll("\\s", "");
                code_2.write(node2);
            }

            //Making new User file
            Scanner Reader = new Scanner(new File(path+"\\user\\user.txt"));
            String username = Reader.nextLine();
            try (FileWriter files = new FileWriter(new File(path+"\\user\\user.txt"), false)) {
                String pw = "";
                for (int i = 0; i< password.length();i++){
                    pw +=  (char)((int) password.charAt(i)+((code1+code2)*Math.pow(-1, i)));}

                files.write(username+"\n"+pw);
            }

        }catch(FileNotFoundException e){
        System.out.println("An error occurred.");
        }
        catch(IOException e){System.out.println("An error occurred.");
        }
        }
    }