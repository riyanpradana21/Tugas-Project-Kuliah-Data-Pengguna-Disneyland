package Project;

import java.util.Scanner;

public class MenuUtama {
    public static void main(String[] args) {
        //memanggil data awal
        inisialisasi.init();   
        
        //memanggil method yang diperlukan
        PengunjungBiasaControllers objControl 
                = new PengunjungBiasaControllers();
        PengunjungMemberControllers mbrControl
                = new PengunjungMemberControllers();
        staffControllers stffControl
                = new staffControllers();
        
        int pilihanMenu = 0;
        int pilihanSubMenu = 0;        
        do{
            System.out.println("------------------");
            System.out.println("    Menu Utama");
            System.out.println("------------------");
            System.out.println("1. Data Pengunjung Biasa");
            System.out.println("2. Data Pengunjung Member");
            System.out.println("3. Data Staff");
            System.out.println("4. Keluar");
            System.out.println("------------------");
            System.out.print("Pilihan Menu [1-4] : ");
            Scanner input = new Scanner(System.in);
            pilihanMenu = input.nextInt();
            switch (pilihanMenu){
                case 1:{
                    do{
                        System.out.println("\n\n------------------");
                        System.out.println(" Data Pengunjung Biasa ");
                        System.out.println("------------------");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Ubah Data");
                        System.out.println("3. Hapus Data");
                        System.out.println("4. Lihat Data");
                        System.out.println("5. Kembali ke Menu");
                        System.out.println("------------------");
                        System.out.print("Pilihan Sub Menu [1-5] : ");
                        pilihanSubMenu = input.nextInt(); 
                        switch (pilihanSubMenu){
                            case 1:{
                                int id, notelp, umur;
                                String Nama, JenisKelamin, MasaBerlaku, TanggalDaftar, TipePengunjung;                                
                                
                                PengunjungBiasa obj2 = new PengunjungBiasa();
                                System.out.println("Masukkan ID\t: "); 
                                Scanner input2 = new Scanner(System.in);
                                id = input2.nextInt();
                                input2.nextLine();
                                obj2.setID_PENGUNJUNG(id);
                                
                                System.out.print("Masukkan Nama Anda : "); 
                                Nama = input2.nextLine(); 
                                obj2.setNAMA(Nama);
                                
                                System.out.print("Masukkan Jenis Kelamin Anda : ");
                                JenisKelamin = input2.nextLine();
                                obj2.setJENIS_KELAMIN(JenisKelamin);
                                
                                System.out.print("Masukkan Masa Berlaku Anda : ");
                                MasaBerlaku = input2.nextLine();
                                obj2.setMASA_BERLAKU(MasaBerlaku);
                                
                                System.out.println("Masukkan No. Telepon\t: ");
                                notelp = input2.nextInt();
                                input2.nextLine();
                                obj2.setNO_TELPON(notelp);
                                
                                System.out.print("Masukkan Tanggal Daftar : ");
                                TanggalDaftar = input2.nextLine();
                                obj2.setTANGGAL_DAFTAR(TanggalDaftar);
                                
                                System.out.print("Masukkan Tipe Pengunjung : ");
                                TipePengunjung = input2.nextLine();
                                obj2.setTIPE_PENGUNJUNG(TipePengunjung);
                                
                                System.out.print("Masukkan Umur\t: ");
                                umur = input2.nextInt();
                                input2.nextLine();
                                obj2.setUMUR(umur);
                                objControl.Create(obj2);
                                
                                System.out.println("Data telah ditambahkan");
                                break;
                            }
                            case 2:{
                                ///mendapatkan index data yang diupdate
                                int indexUpdate;
                                int notelp, umur;
                                String Nama, JenisKelamin, MasaBerlaku, TanggalDaftar, TipePengunjung;
                                System.out.print("Index data diupdate : ");
                                indexUpdate = input.nextInt(); 
                                
                                //melakukan perubahan data atribut
                                PengunjungBiasa obj2 = new PengunjungBiasa();
                                obj2 = inisialisasi.listPengunjungBiasa.get(indexUpdate);
                                System.out.print("Masukkan Nama Anda : ");
                                Scanner input2 = new Scanner(System.in);
                                Nama = input2.nextLine(); 
                                obj2.setNAMA(Nama);
                                
                                System.out.print("Masukkan Jenis Kelamin Anda : ");
                                JenisKelamin = input2.nextLine();
                                obj2.setJENIS_KELAMIN(JenisKelamin);
                                
                                System.out.print("Masukkan Masa Berlaku Anda : ");
                                MasaBerlaku = input2.nextLine();
                                obj2.setMASA_BERLAKU(MasaBerlaku);
                                
                                System.out.println("Masukkan No. Telepon\t: ");
                                notelp = input2.nextInt();
                                input2.nextLine();
                                obj2.setNO_TELPON(notelp);
                                
                                System.out.print("Masukkan Tanggal Daftar : ");
                                TanggalDaftar = input2.nextLine();
                                obj2.setTANGGAL_DAFTAR(TanggalDaftar);
                                
                                System.out.print("Masukkan Tipe Pengunjung : ");
                                TipePengunjung = input2.nextLine();
                                obj2.setTIPE_PENGUNJUNG(TipePengunjung);
                                
                                System.out.print("Masukkan Umur\t: ");
                                umur = input2.nextInt();
                                input2.nextLine();
                                obj2.setUMUR(umur);
                                
                                //update ke data list
                                System.out.println("Data Anda Telah Dirubah");
                                objControl.Update(indexUpdate, obj2);
                                break;
                            }
                            case 3:{
                                 ///mendapatkan index data yang dihapus
                                int indexUpdate;
                                System.out.print("Index data dihapus : ");
                                indexUpdate = input.nextInt(); 
                                
                                //melakukan perubahan data atribut
                                PengunjungBiasa obj2 = new PengunjungBiasa();
                                obj2 = inisialisasi.listPengunjungBiasa.get(indexUpdate);
                                
                                //proses delete
                                objControl.Delete(obj2);
                                break;
                            }
                            case 4:{
                                objControl.Read();
                                break;
                            }
                            default:{
                                System.out.println("Pilihan tidak ada");
                                break;
                            }
                        }
                    } while(pilihanSubMenu != 5);                    
                    break;
                }
                case 2:{
                    do{
                        System.out.println("\n\n------------------");
                        System.out.println(" Data Pengunjung Member");
                        System.out.println("------------------");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Ubah Data");
                        System.out.println("3. Hapus Data");
                        System.out.println("4. Lihat Data");
                        System.out.println("5. Kembali ke Menu");
                        System.out.println("------------------");
                        System.out.print("Pilihan Sub Menu [1-5] : ");
                        pilihanSubMenu = input.nextInt(); 
                        switch (pilihanSubMenu){
                            case 1:{
                                int id, notelp, umur;
                                String Nama, JenisKelamin, status, tipemember, waktutenggat;                                
                                
                                PengunjungMember mbr2 = new PengunjungMember();
                                System.out.println("Masukkan ID\t: "); 
                                Scanner input2 = new Scanner(System.in);
                                id = input2.nextInt();
                                input2.nextLine();
                                mbr2.setID_MEMBER(id);
                                
                                System.out.print("Masukkan Nama Anda : "); 
                                Nama = input2.nextLine(); 
                                mbr2.setNAMA(Nama);
                                
                                System.out.print("Masukkan Jenis Kelamin Anda : ");
                                JenisKelamin = input2.nextLine();
                                mbr2.setJENIS_KELAMIN(JenisKelamin);
                                
                                System.out.print("Masukkan Status Anda : ");
                                status = input2.nextLine();
                                mbr2.setSTATUS(status);
                                
                                System.out.println("Masukkan No. Telepon\t: ");
                                notelp = input2.nextInt();
                                input2.nextLine();
                                mbr2.setNO_TELPON(notelp);
                                
                                System.out.print("Masukkan Tipe Member : ");
                                tipemember = input2.nextLine();
                                mbr2.setTIPE_MEMBER(tipemember);
                                
                                System.out.print("Masukkan Waktu Tenggat : ");
                                waktutenggat = input2.nextLine();
                                mbr2.setWAKTU_TENGGAT(waktutenggat);
                                
                                System.out.print("Masukkan Umur\t: ");
                                umur = input2.nextInt();
                                input2.nextLine();
                                mbr2.setUMUR(umur);
                                mbrControl.Create(mbr2);
                                
                                System.out.println("Data telah ditambahkan");
                                break;
                            }
                            case 2:{
                                ///mendapatkan index data yang diupdate
                                int indexUpdate;
                                int id, notelp, umur;
                                String Nama, JenisKelamin, status, tipemember, waktutenggat;
                                System.out.print("Index data diupdate : ");
                                indexUpdate = input.nextInt(); 
                                
                                //melakukan perubahan data atribut
                                PengunjungMember mbr2 = new PengunjungMember();
                                mbr2 = inisialisasi.listPengunjungMember.get(indexUpdate);
                                System.out.print("Masukkan Nama Anda : ");
                                Scanner input2 = new Scanner(System.in);
                                Nama = input2.nextLine(); 
                                mbr2.setNAMA(Nama);
                                
                                System.out.print("Masukkan Jenis Kelamin Anda : ");
                                JenisKelamin = input2.nextLine();
                                mbr2.setJENIS_KELAMIN(JenisKelamin);
                                
                                System.out.print("Masukkan Status Anda : ");
                                status = input2.nextLine();
                                mbr2.setSTATUS(status);
                                
                                System.out.println("Masukkan No. Telepon\t: ");
                                notelp = input2.nextInt();
                                input2.nextLine();
                                mbr2.setNO_TELPON(notelp);
                                
                                System.out.print("Masukkan Tipe Member : ");
                                tipemember = input2.nextLine();
                                mbr2.setTIPE_MEMBER(tipemember);
                                
                                System.out.print("Masukkan Waktu Tenggat : ");
                                waktutenggat = input2.nextLine();
                                mbr2.setWAKTU_TENGGAT(waktutenggat);
                                
                                System.out.print("Masukkan Umur\t: ");
                                umur = input2.nextInt();
                                input2.nextLine();
                                mbr2.setUMUR(umur);
                                
                                //update ke data list
                                System.out.println("Data Anda Telah Berhasil Dirubah");
                                mbrControl.Update(indexUpdate, mbr2);
                                break;
                            }
                            case 3:{
                                 ///mendapatkan index data yang dihapus
                                int indexUpdate;
                                System.out.print("Index data dihapus : ");
                                indexUpdate = input.nextInt(); 
                                
                                //melakukan perubahan data atribut
                                PengunjungMember mbr2 = new PengunjungMember();
                                mbr2 = inisialisasi.listPengunjungMember.get(indexUpdate);
                                
                                //proses delete
                                mbrControl.Delete(mbr2);
                                break;
                            }
                            case 4:{
                                mbrControl.Read();
                                break;
                            }
                            default:{
                                System.out.println("Pilihan tidak ada");
                                break;
                            }
                        }
                    } while(pilihanSubMenu != 5);                    
                    break;
                }
                case 3:{
                    do{
                        System.out.println("\n\n------------------");
                        System.out.println(" Data Staff");
                        System.out.println("------------------");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Ubah Data");
                        System.out.println("3. Hapus Data");
                        System.out.println("4. Lihat Data");
                        System.out.println("5. Kembali ke Menu");
                        System.out.println("------------------");
                        System.out.print("Pilihan Sub Menu [1-5] : ");
                        pilihanSubMenu = input.nextInt(); 
                        switch (pilihanSubMenu){
                            case 1:{
                                int id, notelp, umur, gaji;
                                String Nama, JenisKelamin, tanggalgajian, tugas;                                
                                
                                staff stff2 = new staff();
                                System.out.println("Masukkan ID\t: "); 
                                Scanner input2 = new Scanner(System.in);
                                id = input2.nextInt();
                                input2.nextLine();
                                stff2.setID_STAFF(id);
                                
                                System.out.print("Masukkan Nama Anda : "); 
                                Nama = input2.nextLine(); 
                                stff2.setNAMA(Nama);
                                
                                System.out.print("Masukkan Jenis Kelamin Anda : ");
                                JenisKelamin = input2.nextLine();
                                stff2.setJENIS_KELAMIN(JenisKelamin);
                                
                                System.out.print("Masukkan Gaji : ");
                                gaji = input2.nextInt();
                                input2.nextLine();
                                stff2.setGAJI(gaji);
                                
                                System.out.println("Masukkan No. Telepon\t: ");
                                notelp = input2.nextInt();
                                input2.nextLine();
                                stff2.setNO_TELPON(notelp);
                                
                                System.out.print("Masukkan Tanggal Gajian : ");
                                tanggalgajian = input2.nextLine();
                                stff2.setTANGGAL_GAJIAN(tanggalgajian);
                                
                                System.out.print("Masukkan Tugas : ");
                                tugas = input2.nextLine();
                                stff2.setTUGAS(tugas);
                                
                                System.out.print("Masukkan Umur\t: ");
                                umur = input2.nextInt();
                                input2.nextLine();
                                stff2.setUMUR(umur);
                                stffControl.Create(stff2);
                                
                                System.out.println("Data telah ditambahkan");
                                break;
                            }
                            case 2:{
                                ///mendapatkan index data yang diupdate
                                int indexUpdate;
                                int id, notelp, umur, gaji;
                                String Nama, JenisKelamin, tanggalgajian, tugas;
                                System.out.print("Index data diupdate : ");
                                indexUpdate = input.nextInt(); 
                                
                                //melakukan perubahan data atribut
                                staff stff2 = new staff();
                                stff2 = inisialisasi.liststaff.get(indexUpdate);
                                System.out.print("Masukkan Nama Anda : ");
                                Scanner input2 = new Scanner(System.in);
                                Nama = input2.nextLine(); 
                                stff2.setNAMA(Nama);
                                
                                System.out.print("Masukkan Jenis Kelamin Anda : ");
                                JenisKelamin = input2.nextLine();
                                stff2.setJENIS_KELAMIN(JenisKelamin);
                                
                                System.out.print("Masukkan Gaji : ");
                                gaji = input2.nextInt();
                                input2.nextLine();
                                stff2.setGAJI(gaji);
                                
                                System.out.println("Masukkan No. Telepon\t: ");
                                notelp = input2.nextInt();
                                input2.nextLine();
                                stff2.setNO_TELPON(notelp);
                                
                                System.out.print("Masukkan Tanggal Gajian : ");
                                tanggalgajian = input2.nextLine();
                                stff2.setTANGGAL_GAJIAN(tanggalgajian);
                                
                                System.out.print("Masukkan Tugas : ");
                                tugas = input2.nextLine();
                                stff2.setTUGAS(tugas);
                                
                                System.out.print("Masukkan Umur\t: ");
                                umur = input2.nextInt();
                                input2.nextLine();
                                stff2.setUMUR(umur);
                                
                                //update ke data list
                                System.out.println("Data Anda Telah Berhasil Dirubah");
                                stffControl.Update(indexUpdate, stff2);
                                break;
                            }
                            case 3:{
                                 ///mendapatkan index data yang dihapus
                                int indexUpdate;
                                System.out.print("Index data dihapus : ");
                                indexUpdate = input.nextInt(); 
                                
                                //melakukan perubahan data atribut
                                staff stff2 = new staff();
                                stff2 = inisialisasi.liststaff.get(indexUpdate);
                                
                                //proses delete
                                stffControl.Delete(stff2);
                                break;
                            }
                            case 4:{
                                stffControl.Read();
                                break;
                            }
                            default:{
                                System.out.println("Pilihan tidak ada");
                                break;
                            }
                        }
                    } while(pilihanSubMenu != 5);                    
                    break;
                }
                default:{
                    System.out.println("Pilihan tidak ada");
                    break;
                }
            }
        } while(pilihanMenu != 4);
    }
}
