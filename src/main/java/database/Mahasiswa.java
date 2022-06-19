/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author ACER
 */
public class Mahasiswa extends Orang{
    private int NIM;
    
    public Mahasiswa(int NIM, String nama, String tanggal) {
        super(nama, tanggal);
        this.NIM = NIM;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }
    
    @Override
    public void update(String[] replaced){
        for (int i = 0; i < replaced.length; i++){
            this.setNama(replaced[i]);
            this.NIM = Integer.parseInt(replaced[i]);
            this.setTanggal(replaced[i]);
        }
    }
    
    @Override
    public String view(){
        return String.format("%1$s_%2$s_%3$s", this.NIM, this.getNama(), this.getTanggal());
    }
}
    