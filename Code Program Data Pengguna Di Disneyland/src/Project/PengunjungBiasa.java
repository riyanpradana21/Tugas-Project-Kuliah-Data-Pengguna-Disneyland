/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author RYAN
 */
// child Kedua
public class PengunjungBiasa extends person{
    
    // Atribut
    private int	ID_Pengunjung;
    private String Tanggal_Terdaftar;
    private String Tipe_Pengunjung;
    private String Masa_Berlaku;
    
    // Method
    public void	getPembayaran(){}
    public void	setID_PENGUNJUNG(int _id_pengunjung){
        this.ID_Pengunjung = _id_pengunjung;
    }
    public void	setTANGGAL_DAFTAR(String _tanggal_daftar) {
        this.Tanggal_Terdaftar = _tanggal_daftar;
    }
    public void	setTIPE_PENGUNJUNG(String _tipe_pengunjung){
        this.Tipe_Pengunjung = _tipe_pengunjung;
    }
    public void	setMASA_BERLAKU(String _masa_berlaku){
        this.Masa_Berlaku = _masa_berlaku;
    }
    public int	getId_Pengunjung(){
        return this.ID_Pengunjung;
    }
    public String getTanggal_Daftar(){
        return this.Tanggal_Terdaftar;
    }
    public String getTipe_Pengunjung(){
        return this.Tipe_Pengunjung;
    }
    public String getMasa_Berlaku(){
        return this.Masa_Berlaku;
    }
            
    // Polyphorisme
    @Override
    public boolean login(String Id_Pengunjung){
        if(this.ID_Pengunjung == ID_Pengunjung) 
            return true;
        else 
            return false;
    }
    @Override
    public void	getBiodata(){
        System.out.println("ID Pengunjung\t: " + getId_Pengunjung());
        System.out.println("Tanggal Daftar\t: " + getTanggal_Daftar());
        System.out.println("Tipe Pengunjung\t: " + getTipe_Pengunjung());
        System.out.println("Masa Berlaku\t: " + getMasa_Berlaku());
    }
}
