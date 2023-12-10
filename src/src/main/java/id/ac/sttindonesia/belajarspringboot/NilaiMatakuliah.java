package id.ac.sttindonesia.belajarspringboot;

import java.sql.Date;

public class NilaiMatakuliah
{
  private Integer Nim;
  private String Nama;
  private String Alamat;
  private String JenisKelamin;
  private String Jurusan;
  private String MataKuliah;
  private String Kelas;
  private String Keterangan;
  private String Nilai;
 





  @Override
  public String toString()
  {
    return "Pendaftaran [Nama Mahasiswa = " + this.NamaMahasiswa + 
          ", Tempat Lahir = " + this.TempatLahir +  
          ", Tanggal Lahir = " + this.TanggalLahir;
  }
}