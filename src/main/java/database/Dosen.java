/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author ACER
 */
public class Dosen extends Orang{
    private int NIP;
    
    public Dosen(int NIP, String nama, String tanggal) {
        super(nama, tanggal);
        this.NIP = NIP;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }
    
    @Override
    public void update(String[] replaced){
        this.setNama(replaced[0]);
        this.NIP = Integer.parseInt(replaced[1]);
        this.setTanggal(replaced[2]);  
    }
    
    @Override
    public String view(){
        return String.format("%1$s_%2$s_%3$s", this.NIP, this.getNama(), this.getTanggal());
        }
}