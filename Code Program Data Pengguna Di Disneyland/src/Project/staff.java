/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author RYAN
 */

// Child Ketiga
public class staff extends person{
    private	int	ID_Staff;
    private	String	Tanggal_Gajian;
    private	int	Gaji;
    private	String	Tugas;
    
    //Method
    public	void	infoGaji() {}
    // Setter
    public	void	setID_STAFF(int _id_staff) {
        this.ID_Staff = _id_staff;
    }
    public	void	setTANGGAL_GAJIAN(String _tanggal_gajian){
        this.Tanggal_Gajian = _tanggal_gajian;
    }
    public	void	setGAJI(int _gaji){
        this.Gaji = _gaji;
    }
    public	void	setTUGAS(String _tugas){
        this.Tugas = _tugas;
    }
    // Getter
    public	int	getStaff(){
        return this.ID_Staff;
    }
    public	String	getTanggal_Gajian(){
        return this.Tanggal_Gajian;
    }
    public int getGaji(){
        return this.Gaji;
    }
    public	String	getTugas(){
        return this.Tugas;
    }
    // Polyphorisme
    @Override
    public boolean login(String Id_Staff){
        if(this.ID_Staff == ID_Staff) 
            return true;
        else
            return false;
    }
    @Override
    public void getBiodata(){
        System.out.println("ID Staff\t: " + getStaff());
        System.out.println("Tanggal Gajian\t: " + getTanggal_Gajian());
        System.out.println("Gaji\t: " + getGaji());
        System.out.println("Tugas\t: " + getTugas());
    }
}
