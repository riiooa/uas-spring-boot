package id.ac.sttindonesia.belajarspringboot;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "nilai_matakuliah")
public class NilaiEntity
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(nullable = false, length=15)
  private String nimMahasiswa;

  @Column(nullable = false, unique = true, name="NAMA_MAHASISWA")
  private String namaMahasiswa;

  @Column(nullable = false, length=15)
  private String alamat;

  @Column(nullable = false, length = 15)
  private String jenisKelamin;

  @Column(nullable = false, name = "JURUSAN")
  private String jurusan;

  @Column(nullable = false, name = "MATKUL")
  private String matkul;

  @Column(nullable = false)
  private String kelas;

  @Column(nullable = false)
  private String nilai;

  public NilaiEntity(Integer id, String nimMahasiswa, String namaMahasiswa, String alamat, String jenisKelamin,
      String jurusan, String matkul, String kelas, String nilai) {
    this.id = id;
    this.nimMahasiswa = nimMahasiswa;
    this.namaMahasiswa = namaMahasiswa;
    this.alamat = alamat;
    this.jenisKelamin = jenisKelamin;
    this.jurusan = jurusan;
    this.matkul = matkul;
    this.kelas = kelas;
    this.nilai = nilai;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNimMahasiswa() {
    return nimMahasiswa;
  }

  public void setNimMahasiswa(String nimMahasiswa) {
    this.nimMahasiswa = nimMahasiswa;
  }

  public String getNamaMahasiswa() {
    return namaMahasiswa;
  }

  public void setNamaMahasiswa(String namaMahasiswa) {
    this.namaMahasiswa = namaMahasiswa;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getJenisKelamin() {
    return jenisKelamin;
  }

  public void setJenisKelamin(String jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public String getJurusan() {
    return jurusan;
  }

  public void setJurusan(String jurusan) {
    this.jurusan = jurusan;
  }

  public String getMatkul() {
    return matkul;
  }

  public void setMatkul(String matkul) {
    this.matkul = matkul;
  }

  public String getKelas() {
    return kelas;
  }

  public void setKelas(String kelas) {
    this.kelas = kelas;
  }

  public String getNilai() {
    return nilai;
  }

  public void setNilai(String nilai) {
    this.nilai = nilai;
  }
  
 

}
