package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.NilaiEntity;
import id.ac.sttindonesia.belajarspringboot.NilaiRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class NilaiRepositoryTests
{
  /**
    * Autowired digunakan untuk mempermudah mengakses
    * fungsi-fungsi yang ada di dalam class tanpa
    * melakukan instantiasi
   */
  @Autowired private NilaiRepository repo;
  
  @Test
  public void testAddNew()
  {
    NilaiEntity nilai = new NilaiEntity();

    nilai.setNIM_MAHASISWA("4403001");
    nilai.setNAMA_MAHASISWA("RIZKI");
    nilai.setALAMAT("BATU");
    nilai.setJK("LAKI-LAKI");
    nilai.setJURUSAN("IF");
    nilai.setMATKUL("MATKUL");
    nilai.setKELAS("PAGI");
    nilai.setNILAI("A");

    NilaiEntity savedNilai = repo.save(nilai);
    //mulai test
    Assertions.assertNotNull(savedNilai);
    Assertions.assertTrue(savedNilai.getId() > 0, "nilaiid mesti lebih besar dari 0");
  }
  
}