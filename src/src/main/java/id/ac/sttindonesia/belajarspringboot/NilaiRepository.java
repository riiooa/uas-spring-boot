package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.NilaiEntity;

import org.springframework.data.repository.CrudRepository;

public interface NilaiRepository extends CrudRepository<NilaiEntity, Integer>
{
  
}