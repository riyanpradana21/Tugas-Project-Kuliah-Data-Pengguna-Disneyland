/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.util.Collection;
/**
 *
 * @author RYAN
 */
public class PengunjungMemberControllers {
   public void Create(PengunjungMember obj) {
        inisialisasi.listPengunjungMember.add( obj);
    }
    
    public void Read() {
        System.out.println("------------------------");
        for(PengunjungMember obj : inisialisasi.listPengunjungMember){
            obj.getBiodata();
            System.out.println("------------------------");
        }
    }
    
    public void Update(int index,PengunjungMember obj) {
        inisialisasi.listPengunjungMember.set(index, obj);
    }
    
    public void Delete(PengunjungMember obj) {
        inisialisasi.listPengunjungMember.remove( obj);
    } 
}
