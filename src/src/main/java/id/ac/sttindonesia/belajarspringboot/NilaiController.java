package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.NilaiEntity;
import id.ac.sttindonesia.belajarspringboot.NilaiService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Controller
public class NilaiController
{
  @Autowired private NilaiService service;

  @GetMapping("/nilai")
  public String index(Model model)
  {
    List<NilaiEntity> daftarPengguna = service.listAll();
    model.addAttribute("daftar_pengguna", daftarPengguna);
    
    return "nilai/nilai-index";
  }
  @GetMapping("/nilai/create")
  public String create(Model model)
  {
    model.addAttribute("pengguna", new NilaiEntity());
    return "nilai/nilai-create";
  }
  @PostMapping("/nilai/store")
  public String store(NilaiEntity pengguna)
  {
    service.save(pengguna);
    return "redirect:/nilai";
  }

  @GetMapping("/nilai/{id}/edit")
  public String edit(Model model, @PathVariable("id") Integer id)
  {
    Optional<NilaiEntity> nilai = service.edit(id);
    model.addAttribute("pengguna", nilai);
    return "nilai/nilai-edit";
  }


}