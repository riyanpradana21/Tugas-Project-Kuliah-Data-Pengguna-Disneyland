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
public class PengunjungBiasaControllers {
    public void Create(PengunjungBiasa obj) {
        inisialisasi.listPengunjungBiasa.add( obj);
    }
    
    public void Read() {
        System.out.println("------------------------");
        for(PengunjungBiasa obj : inisialisasi.listPengunjungBiasa){
            obj.getBiodata();
            System.out.println("------------------------");
        }
    }
    
    public void Update(int index,PengunjungBiasa obj) {
        inisialisasi.listPengunjungBiasa.set(index, obj);
    }
    
    public void Delete(PengunjungBiasa obj) {
        inisialisasi.listPengunjungBiasa.remove( obj);
    }
}
