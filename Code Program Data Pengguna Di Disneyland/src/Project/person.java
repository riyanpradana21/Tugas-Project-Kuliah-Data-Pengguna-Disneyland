/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author RYAN
 */
// parent class
public class person {
   // Atribut
    private String Nama_Pengunjung;
    private String Jenis_Kelamin;
    private int	Umur;
    private int	No_Telepon;
    
    //Method
    public boolean login(String ID){
        return false;
    }
    public void	getBiodata() {}
    
    // Encapsulation
    // setter
    public void	setNAMA(String _nama) {
        if(_nama.length() <= 5)
            System.out.println("Nama Kurang Lengkap !");
        else
            this.Nama_Pengunjung = _nama;
    }
    public void	setJENIS_KELAMIN(String _jenis_kelamin){
        this.Jenis_Kelamin = _jenis_kelamin;
    }
    public void	setUMUR(int _umur){
        this.Umur = _umur;
    } 
    public void	setNO_TELPON(int _no_telpon){
        this.No_Telepon = _no_telpon;
    }
    
    //getter
    public String getNama(){ 
        return this.Nama_Pengunjung;
    }
    public String getJenis_Kelamin(){
        return this.Jenis_Kelamin;
    }
    public int	getUmur(){return 0;}
    public int	getNo_Telpon(){return 0;}

}
