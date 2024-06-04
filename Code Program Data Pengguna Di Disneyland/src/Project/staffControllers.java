/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author RYAN
 */
public class staffControllers {
   public void Create(staff obj) {
        inisialisasi.liststaff.add( obj);
    }
    
    public void Read() {
        System.out.println("------------------------");
        for(staff obj : inisialisasi.liststaff){
            obj.getBiodata();
            System.out.println("------------------------");
        }
    }
    
    public void Update(int index,staff obj) {
        inisialisasi.liststaff.set(index, obj);
    }
    
    public void Delete(staff obj) {
        inisialisasi.liststaff.remove( obj);
    }  
}
