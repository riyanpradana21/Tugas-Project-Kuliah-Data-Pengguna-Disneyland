/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author RYAN
 */
// child Pertama
public class PengunjungMember extends person {
    
    // Atribut
    private int	ID_Member;
    private String Waktu_Tenggat;
    private String Tipe_Member;
    private String Status;
    
    //Method
    public void	getDiskon(){}
    public void	getPerpanjangan(){}
    
    // Encapsulation
    public void	setID_MEMBER(int _id_member){
        this.ID_Member = _id_member;
    }
    public void	setWAKTU_TENGGAT(String _waktu_tenggat){
        this.Waktu_Tenggat = _waktu_tenggat;
    }
    public void	setTIPE_MEMBER(String _waktu_member){
        this.Tipe_Member = _waktu_member;
    }
    public void	setSTATUS(String _status){
        this.Status = _status;
    }
    public int getId_Member(){
        return this.ID_Member;
    }
    public String getWaktu_Tenggat(){
        return this.Waktu_Tenggat;
    }
    public String getTipe_Member(){
        return this.Tipe_Member;
    }
    public String getStatus(){
        return this.Status;
    }
            
    // polyphorisme
    @Override
    public boolean login(String Id_Member) {
        if(this.ID_Member == ID_Member) 
            return true;
        else 
            return false;
    }
    
    @Override
    public void	getBiodata() {
        System.out.println("ID Member\t: " + getId_Member());
        System.out.println("Waktu Tenggat\t: " + getWaktu_Tenggat());
        System.out.println("Tipe Member\t: " + getTipe_Member());
        System.out.println("Status\t: " + getStatus());
    }

}
