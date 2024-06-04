/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.util.ArrayList;
/**
 *
 * @author RYAN
 */
public class inisialisasi {
    public static ArrayList<PengunjungBiasa>
            listPengunjungBiasa = new ArrayList<>();
    public static ArrayList<PengunjungMember>
            listPengunjungMember = new ArrayList<>();
    public static ArrayList<staff>
            liststaff = new ArrayList<>();
    
    public static void init() {
        // Membuat parameter awal pada saat program dijalankan
        PengunjungBiasaControllers objControl = new PengunjungBiasaControllers();
        
        PengunjungBiasa obj1 = new PengunjungBiasa();
        obj1.setID_PENGUNJUNG(01);
        obj1.setJENIS_KELAMIN("Laki - Laki");
        obj1.setMASA_BERLAKU("24 April 2024");
        obj1.setNAMA("Wahyu Pradana");
        obj1.setNO_TELPON(891234567);
        obj1.setTANGGAL_DAFTAR("24 April 2024");
        obj1.setTIPE_PENGUNJUNG("Baru");
        obj1.setUMUR(24);
        objControl.Create(obj1);
        
        PengunjungBiasa obj2 = new PengunjungBiasa();
        obj2.setID_PENGUNJUNG(02);
        obj2.setJENIS_KELAMIN("Perempuan");
        obj2.setMASA_BERLAKU("31 Agustus 2024");
        obj2.setNAMA("Ratna Kusumawati");
        obj2.setNO_TELPON(812345678);
        obj2.setTANGGAL_DAFTAR("31 Oktober 2024");
        obj2.setTIPE_PENGUNJUNG("Lama");
        obj2.setUMUR(31);
        objControl.Create(obj2);
        
        PengunjungMemberControllers mbrControl = new PengunjungMemberControllers();
        
        PengunjungMember mbr1 = new PengunjungMember();
        mbr1.setID_MEMBER(01);
        mbr1.setJENIS_KELAMIN("Laki - Laki");
        mbr1.setNAMA("Taki Naki");
        mbr1.setNO_TELPON(891122334);
        mbr1.setSTATUS("Aktif");
        mbr1.setTIPE_MEMBER("Gold");
        mbr1.setUMUR(27);
        mbr1.setWAKTU_TENGGAT("27 April 2025");
        mbrControl.Create(mbr1);
        
        PengunjungMember mbr2 = new PengunjungMember();
        mbr2.setID_MEMBER(02);
        mbr2.setJENIS_KELAMIN("Perempuan");
        mbr2.setNAMA("Lady Girl");
        mbr2.setNO_TELPON(89123456);
        mbr2.setSTATUS("Aktif");
        mbr2.setTIPE_MEMBER("Bronze");
        mbr2.setUMUR(25);
        mbr2.setWAKTU_TENGGAT("27 April 2026");
        mbrControl.Create(mbr2);
        
        staffControllers stffControl = new staffControllers();
        
        staff stff1 = new staff();
        stff1.setID_STAFF(01);
        stff1.setNAMA("Ary Widianto");
        stff1.setGAJI(1000000);
        stff1.setNO_TELPON(890123456);
        stff1.setTANGGAL_GAJIAN("25 Mei 2024");
        stff1.setTUGAS("Admin");
        stff1.setUMUR(31);
        stffControl.Create(stff1);
        
        staff stff2 = new staff();
        stff2.setID_STAFF(02);
        stff2.setNAMA("Arsy Alea");
        stff2.setGAJI(1500000);
        stff2.setNO_TELPON(89543210);
        stff2.setTANGGAL_GAJIAN("25 Mei 2025");
        stff2.setTUGAS("Admin");
        stff2.setUMUR(25);
        stffControl.Create(stff2);
    }
}
