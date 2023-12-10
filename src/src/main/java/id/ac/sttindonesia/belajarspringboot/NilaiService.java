package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.NilaiEntity;
import id.ac.sttindonesia.belajarspringboot.NilaiRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class NilaiService 
{
  @Autowired private NilaiRepository repo;

  public List<NilaiEntity> listAll()
  {
    return (List<NilaiEntity>) repo.findAll();
  }
  public void save(NilaiEntity nilai)
  {
    repo.save(nilai);
  }

  public Optional<NilaiEntity> edit(Integer id){
    Optional<NilaiEntity> nilai = repo.findById(id);
    return nilai;
  
  }
}